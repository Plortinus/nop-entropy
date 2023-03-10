# 开发调试

## 错误定位

后台抛出异常时一般会统一使用NopException异常类，它具有SourceLocation属性，会提示错误发生时对应的XLang程序源码位置。NopException类上还报错了XLang执行堆栈，打印异常消息时会输出Xpl堆栈信息。例如

```java
io.nop.api.core.exceptions.NopException: NopException[seq=4,status=-1,errorCode=nop.err.xui.ref-view-not-exists,params={viewPath=/app/mall/LitemallGoods/attributes.page.yaml},desc=view配置不存在：/app/mall/LitemallGoods/attributes.page.yaml]@_loc=[114:22:0:0]/app/mall/pages/LitemallGoods/LitemallGoods.view.xml
  @@getFormSelection(formModel,objMeta)@[7:30:0:0]/nop/web/xlib/web/page_simple.xpl
  @@</_delta/default/nop/web/xlib/web.xlib#GenPage>("/app/mall/pages/LitemallGoods/LitemallGoods.view.xml","add",null)@[1:17:0:0]/app/mall/pages/LitemallGoods/add.page.yaml
  @@__fn_1()@[1:17:0:0]/app/mall/pages/LitemallGoods/add.page.yaml
```

以上异常表示

1. add.page.yaml调用了web.xlib中的GenPage标签
2. GenPage标签调用了page_simple.xpl
3. page_simple.xpl在第7行调用了getFormSelection函数
4. 在函数内部访问到LitemallGoods.view.xml模型文件，发现它的第114行的配置不正确。

## 日志打印

1. XScript脚本中内置了logInfo/logDebug等函数

```java
 logInfo("nop.err.invalid-name:name={}",name);
```

 第一个参数必须是静态字符串，不允许"sss"+yyy这种形式，从而也避免了log注入攻击。

2. 任意对象调用$函数都会导致打印调试语句

```java
b = a.f().$("test")
```

以上调用等价于 `b = DebugHelper.v(location(), "test",a.f());`，其中test参数为自定义的提示信息。
所以，当我们想查看任意表达式的值的时候，可以在其后增加$调用。打印出的调试信息如下：

```
21:00:01.686 [main] INFO io.nop.xlang.utils.DebugHelper - test:a.f()=>1,loc=[6:8:0:0]file:/C:/can/nop/nop-entropy-bak/nop-xlang/target/test-classes/io/nop/xlang/expr/exprs/debug.test.md
```

test为自定义前缀信息。 a.f()为待查看的表达式源码, `=> 1`表示表达式的返回值为1。 loc对应于调试语句所对应的源码位置。

> 可以在DebugHelper中加条件断点来调试Java源码

## 模型dump

Nop平台大量使用了元编程来动态生成代码，为了有效跟踪代码生成的细节过程，让最终运行代码片段的实际来源一目了然，Nop平台在调试模式下会自动输出合并后的结果模型文件到项目根目录下的_dump目录中。当我们启动应用程序后，可以看到`_dump`目录下存在大量输出文件
![](model-dump.png)

如果结果文件是由多个delta文件合并得来，则在结果文件中我们会看到每个来源节点/属性的源码位置信息。

在XDSL模型的根节点上，我们也可以增加x:dump="true"属性，它会把更细节的合并算法执行过程打印到日志中。

## XLang调试器

Nop平台的nop-idea-plugin模块提供了IDEA开发插件，其中包含了针对XScript脚本语言的调试器，可以为所有XDSL领域语言增加断点调试功能。具体参见文档 [idea-plugin.md](../user-guide/idea/idea-plugin.md)

## GraphQL调试工具

Quarkus框架内置了graphql-ui调试工具。以调试模式启动应用之后，通过链接/q/graphql-ui可以访问到调试页面。
在此页面上可以查看所有后台GraphQL端点和类型的定义，并且输入代码时会自动提示候选文本。

# 常见问题

## 前端

### 1. 字段对应的前端控件显示为空，无法录入

可能是control.xlib中没有针对该字段定义对应的编辑器。在debug日志级别下，XuiHelper.getControlTag函数会打印控件映射结果。例如:

```
 nop.xui.resolve-control-tag:controlTag=edit-int,prop=id,domain=null,stdDomain=null,stdDataType=int,mode=add
```

## 后端

### 1. 后端的bean未按预期注入

首先查看启动工程的`_dump`目录下/{appName}/nop/mai/beans/merged-app.beans.xml中的结果是否满足预期。
这个文件是IoC容器执行完所有动态判断逻辑之后输出的最终结果，其中还打印了属性和对象的来源文件。例如:

```xml
<!--LOC:[18:6:0:0]/nop/auth/beans/auth-service.beans.xml-->
    <bean class="io.nop.auth.service.login.DaoLoginSessionStore" id="$DEFAULT$nopLoginSessionStore" ioc:aop="false"
          name="nopLoginSessionStore">
        <property name="daoProvider" ext:autowired="true">
            <ref bean="$DEFAULT$nopDaoProvider" ext:resolved-loc="[51:6:0:0]/nop/orm/beans/orm-defaults.beans.xml"/>
        </property>
        <property name="sessionIdGenerator" ext:autowired="true">
            <ref bean="$DEFAULT$nopSessionIdGenerator"
                 ext:resolved-loc="[34:6:0:0]/nop/auth/beans/auth-core-defaults.beans.xml"/>
        </property>
    </bean>
```

1. 如果节点路径和前一个兄弟节点的路径不同，则会打印LOC信息。
2. ext:autowired="true"表示这个属性是通过`@Inject`注解自动注入的。
3. ext:resolved-loc属性表示了这个对象具体所在的配置文件路径。

### 2. 如何查看当前应用所加载的bean

在debug模式下，可以通过/r/DevDoc_beans链接查看实际装载的bean

### 3. 如何查看系统中定义的全局函数和全局对象

在debug模式下，可以访问如下链接

1. /r/DevDoc_globalFunctions
2. /r/DevDoc_globalVars

在返回的结果中我们可以看到这些函数和变量的实际对应的Java类和方法。

### 4. 如何查看当前启用的配置变量集合

nop-config模块负责从多个配置来源收集配置信息，并按照优先级决定它们之间的覆盖关系，最终启用的配置变量可以通过如下链接查看：
/r/DevDoc_configVars

在返回的结果中包含每个配置变量的来源资源文件路径。

## 自动化测试

1. 自动录制的response中变量名可能不正确
   因为有可能多个随机变量具有同样的值，因此当保存response数据的时候，有可能根据变量的值反向查找变量名的时候出现错误，导致录制出的变量名不正确。
   例如updateTime录制为addTime等。