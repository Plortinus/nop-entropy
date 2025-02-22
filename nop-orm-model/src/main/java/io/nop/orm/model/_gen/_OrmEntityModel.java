package io.nop.orm.model._gen;

import io.nop.commons.collections.KeyedList; //NOPMD NOSONAR - suppressed UnusedImports - Used for List Prop
import io.nop.core.lang.json.IJsonHandler;



// tell cpd to start ignoring code - CPD-OFF
/**
 * generate from [29:2:0:0]/nop/schema/orm/entity.xdef <p>
 * 
 */
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable",
    "PMD.UnnecessaryFullyQualifiedName","PMD.EmptyControlStatement","java:S116","java:S101"})
public abstract class _OrmEntityModel extends io.nop.core.resource.component.AbstractComponentModel {
    
    /**
     *  
     * xml name: aliases
     * 
     */
    private KeyedList<io.nop.orm.model.OrmAliasModel> _aliases = KeyedList.emptyList();
    
    /**
     *  是否在延迟加载后检查乐观锁版本
     * xml name: checkVersionWhenLazyLoad
     * 延迟加载属性之后检查数据的乐观锁版本是否发生变化。
     * 如果发生变化，则抛出异常。因为乐观锁版本发生变化表示实体上的属性来自于两个版本的修改，从而破坏了数据一致性。
     */
    private boolean _checkVersionWhenLazyLoad  = true;
    
    /**
     *  实体类名
     * xml name: className
     * 生成的实体类的类名
     */
    private java.lang.String _className ;
    
    /**
     *  
     * xml name: columns
     * 每个column都对应实体上的一个属性。relation本身不创建新的对象属性，而是使用上的属性所覆盖
     */
    private KeyedList<io.nop.orm.model.OrmColumnModel> _columns = KeyedList.emptyList();
    
    /**
     *  
     * xml name: comment
     * 
     */
    private java.lang.String _comment ;
    
    /**
     *  
     * xml name: components
     * 
     */
    private KeyedList<io.nop.orm.model.OrmComponentModel> _components = KeyedList.emptyList();
    
    /**
     *  
     * xml name: computes
     * 
     */
    private KeyedList<io.nop.orm.model.OrmComputePropModel> _computes = KeyedList.emptyList();
    
    /**
     *  
     * xml name: createTimeProp
     * 
     */
    private java.lang.String _createTimeProp ;
    
    /**
     *  
     * xml name: createrProp
     * 
     */
    private java.lang.String _createrProp ;
    
    /**
     *  
     * xml name: dbCatalog
     * 
     */
    private java.lang.String _dbCatalog ;
    
    /**
     *  
     * xml name: dbPkName
     * 
     */
    private java.lang.String _dbPkName ;
    
    /**
     *  
     * xml name: dbSchema
     * 
     */
    private java.lang.String _dbSchema ;
    
    /**
     *  
     * xml name: deleteFlagProp
     * 
     */
    private java.lang.String _deleteFlagProp ;
    
    /**
     *  逻辑删除版本列
     * xml name: deleteVersionProp
     * 逻辑删除时，为了保持唯一键索引的有效性，需要将deleteVersion设置为当前时间，而正常情况下则设置为0。
     */
    private java.lang.String _deleteVersionProp ;
    
    /**
     *  
     * xml name: dimensionalType
     * fact/dimension数仓分类
     */
    private java.lang.String _dimensionalType ;
    
    /**
     *  
     * xml name: displayName
     * 
     */
    private java.lang.String _displayName ;
    
    /**
     *  
     * xml name: entityModeEnabled
     * 
     */
    private boolean _entityModeEnabled  = false;
    
    /**
     *  
     * xml name: filters
     * 
     */
    private KeyedList<io.nop.orm.model.OrmEntityFilterModel> _filters = KeyedList.emptyList();
    
    /**
     *  
     * xml name: indexes
     * 
     */
    private KeyedList<io.nop.orm.model.OrmIndexModel> _indexes = KeyedList.emptyList();
    
    /**
     *  是否键值对表
     * xml name: kvTable
     * 表示当前表作为key-value接口保存单个field对应的值。所谓的横表转纵表，就是把普通的table转换为kvTable。
     * kvTable为true要求实体对象必须实现IOrmKeyValueTable接口
     */
    private boolean _kvTable  = false;
    
    /**
     *  
     * xml name: labelProp
     * 
     */
    private java.lang.String _labelProp ;
    
    /**
     *  
     * xml name: maxBatchLoadSize
     * 
     */
    private java.lang.Integer _maxBatchLoadSize ;
    
    /**
     *  实体名
     * xml name: name
     * 实体的名称，一般情况下与类名相同
     */
    private java.lang.String _name ;
    
    /**
     *  是否生成代码
     * xml name: notGenCode
     * 如果设置为true，则代码生成时将跳过本实体对象，不为它生成实体类。当我们引用其他模块的实体类时应该设置此属性，
     * 从而避免在本模块中生成其他模块的实体类。
     */
    private boolean _notGenCode  = false;
    
    /**
     *  持久化存储机制
     * xml name: persistDriver
     * 缺省为jdbc，使用关系数据库存储
     */
    private java.lang.String _persistDriver  = "jdbc";
    
    /**
     *  
     * xml name: querySpace
     * 
     */
    private java.lang.String _querySpace  = "default";
    
    /**
     *  是否视图
     * xml name: readonly
     * 
     */
    private boolean _readonly  = false;
    
    /**
     *  是否注册短名称
     * xml name: registerShortName
     * 一般情况下会自动注册实体类的短名称，从而使得eql语句中可以使用短类名，简化sql编写。
     */
    private boolean _registerShortName  = false;
    
    /**
     *  
     * xml name: relations
     * 
     */
    private KeyedList<io.nop.orm.model.OrmReferenceModel> _relations = KeyedList.emptyList();
    
    /**
     *  
     * xml name: shardProp
     * 
     */
    private java.lang.String _shardProp ;
    
    /**
     *  
     * xml name: sqlText
     * 当实体实际对应数据库视图时，这里为视图的定义SQL语句
     */
    private java.lang.String _sqlText ;
    
    /**
     *  
     * xml name: stateProp
     * 
     */
    private java.lang.String _stateProp ;
    
    /**
     *  表名
     * xml name: tableName
     * 
     */
    private java.lang.String _tableName ;
    
    /**
     *  
     * xml name: tableView
     * 
     */
    private boolean _tableView  = false;
    
    /**
     *  自定义标签列表
     * xml name: tagSet
     * 
     */
    private java.util.Set<java.lang.String> _tagSet ;
    
    /**
     *  租户id列
     * xml name: tenantProp
     * 租户id所对应的column的name。如果useTenant为true，tenantProp的缺省值为nopTenant。tenant字段一般不在主键集合中
     */
    private java.lang.String _tenantProp ;
    
    /**
     *  
     * xml name: unique-keys
     * 
     */
    private KeyedList<io.nop.orm.model.OrmUniqueKeyModel> _uniqueKeys = KeyedList.emptyList();
    
    /**
     *  
     * xml name: updateTimeProp
     * 
     */
    private java.lang.String _updateTimeProp ;
    
    /**
     *  
     * xml name: updaterProp
     * 
     */
    private java.lang.String _updaterProp ;
    
    /**
     *  
     * xml name: useGlobalCache
     * 
     */
    private boolean _useGlobalCache  = false;
    
    /**
     *  是否启用逻辑删除
     * xml name: useLogicalDelete
     * 如果启用逻辑删除，则delete动作将设置deleteFlag属性为1，而不是发出delete语句。查询的时候并不会自动按照
     * deleteFlag过滤，选择权交给调用者。
     */
    private boolean _useLogicalDelete  = false;
    
    /**
     *  是否启用数据修订支持
     * xml name: useRevision
     * 启用数据修订要求实体上具有nopRevType/nopRevBeginVer/nopRevEndVer等字段，
     * 当实体数据发生修改时不会直接修改原记录，而是会修改原记录的nopRevEndVer字段，并插入一条新的记录。
     */
    private boolean _useRevision  = false;
    
    /**
     *  是否启用分库分表
     * xml name: useShard
     * 
     */
    private boolean _useShard  = false;
    
    /**
     *  是否启用租户
     * xml name: useTenant
     * 
     */
    private boolean _useTenant  = false;
    
    /**
     *  是否启用工作流支持
     * xml name: useWorkflow
     * 
     */
    private boolean _useWorkflow  = false;
    
    /**
     *  版本列的名称
     * xml name: versionProp
     * version机制提供了内置的乐观锁实现。它的数据类型应该是long或者int。
     */
    private java.lang.String _versionProp ;
    
    /**
     * 
     * xml name: aliases
     *  
     */
    
    public java.util.List<io.nop.orm.model.OrmAliasModel> getAliases(){
      return _aliases;
    }

    
    public void setAliases(java.util.List<io.nop.orm.model.OrmAliasModel> value){
        checkAllowChange();
        
        this._aliases = KeyedList.fromList(value, io.nop.orm.model.OrmAliasModel::getName);
           
    }

    
    public io.nop.orm.model.OrmAliasModel getAlias(String name){
        return this._aliases.getByKey(name);
    }

    public boolean hasAlias(String name){
        return this._aliases.containsKey(name);
    }

    public void addAlias(io.nop.orm.model.OrmAliasModel item) {
        checkAllowChange();
        java.util.List<io.nop.orm.model.OrmAliasModel> list = this.getAliases();
        if (list == null || list.isEmpty()) {
            list = new KeyedList<>(io.nop.orm.model.OrmAliasModel::getName);
            setAliases(list);
        }
        list.add(item);
    }
    
    public java.util.Set<String> keySet_aliases(){
        return this._aliases.keySet();
    }

    public boolean hasAliases(){
        return !this._aliases.isEmpty();
    }
    
    /**
     * 是否在延迟加载后检查乐观锁版本
     * xml name: checkVersionWhenLazyLoad
     *  延迟加载属性之后检查数据的乐观锁版本是否发生变化。
     * 如果发生变化，则抛出异常。因为乐观锁版本发生变化表示实体上的属性来自于两个版本的修改，从而破坏了数据一致性。
     */
    
    public boolean isCheckVersionWhenLazyLoad(){
      return _checkVersionWhenLazyLoad;
    }

    
    public void setCheckVersionWhenLazyLoad(boolean value){
        checkAllowChange();
        
        this._checkVersionWhenLazyLoad = value;
           
    }

    
    /**
     * 实体类名
     * xml name: className
     *  生成的实体类的类名
     */
    
    public java.lang.String getClassName(){
      return _className;
    }

    
    public void setClassName(java.lang.String value){
        checkAllowChange();
        
        this._className = value;
           
    }

    
    /**
     * 
     * xml name: columns
     *  每个column都对应实体上的一个属性。relation本身不创建新的对象属性，而是使用上的属性所覆盖
     */
    
    public java.util.List<io.nop.orm.model.OrmColumnModel> getColumns(){
      return _columns;
    }

    
    public void setColumns(java.util.List<io.nop.orm.model.OrmColumnModel> value){
        checkAllowChange();
        
        this._columns = KeyedList.fromList(value, io.nop.orm.model.OrmColumnModel::getName);
           
    }

    
    public io.nop.orm.model.OrmColumnModel getColumn(String name){
        return this._columns.getByKey(name);
    }

    public boolean hasColumn(String name){
        return this._columns.containsKey(name);
    }

    public void addColumn(io.nop.orm.model.OrmColumnModel item) {
        checkAllowChange();
        java.util.List<io.nop.orm.model.OrmColumnModel> list = this.getColumns();
        if (list == null || list.isEmpty()) {
            list = new KeyedList<>(io.nop.orm.model.OrmColumnModel::getName);
            setColumns(list);
        }
        list.add(item);
    }
    
    public java.util.Set<String> keySet_columns(){
        return this._columns.keySet();
    }

    public boolean hasColumns(){
        return !this._columns.isEmpty();
    }
    
    /**
     * 
     * xml name: comment
     *  
     */
    
    public java.lang.String getComment(){
      return _comment;
    }

    
    public void setComment(java.lang.String value){
        checkAllowChange();
        
        this._comment = value;
           
    }

    
    /**
     * 
     * xml name: components
     *  
     */
    
    public java.util.List<io.nop.orm.model.OrmComponentModel> getComponents(){
      return _components;
    }

    
    public void setComponents(java.util.List<io.nop.orm.model.OrmComponentModel> value){
        checkAllowChange();
        
        this._components = KeyedList.fromList(value, io.nop.orm.model.OrmComponentModel::getName);
           
    }

    
    public io.nop.orm.model.OrmComponentModel getComponent(String name){
        return this._components.getByKey(name);
    }

    public boolean hasComponent(String name){
        return this._components.containsKey(name);
    }

    public void addComponent(io.nop.orm.model.OrmComponentModel item) {
        checkAllowChange();
        java.util.List<io.nop.orm.model.OrmComponentModel> list = this.getComponents();
        if (list == null || list.isEmpty()) {
            list = new KeyedList<>(io.nop.orm.model.OrmComponentModel::getName);
            setComponents(list);
        }
        list.add(item);
    }
    
    public java.util.Set<String> keySet_components(){
        return this._components.keySet();
    }

    public boolean hasComponents(){
        return !this._components.isEmpty();
    }
    
    /**
     * 
     * xml name: computes
     *  
     */
    
    public java.util.List<io.nop.orm.model.OrmComputePropModel> getComputes(){
      return _computes;
    }

    
    public void setComputes(java.util.List<io.nop.orm.model.OrmComputePropModel> value){
        checkAllowChange();
        
        this._computes = KeyedList.fromList(value, io.nop.orm.model.OrmComputePropModel::getName);
           
    }

    
    public io.nop.orm.model.OrmComputePropModel getCompute(String name){
        return this._computes.getByKey(name);
    }

    public boolean hasCompute(String name){
        return this._computes.containsKey(name);
    }

    public void addCompute(io.nop.orm.model.OrmComputePropModel item) {
        checkAllowChange();
        java.util.List<io.nop.orm.model.OrmComputePropModel> list = this.getComputes();
        if (list == null || list.isEmpty()) {
            list = new KeyedList<>(io.nop.orm.model.OrmComputePropModel::getName);
            setComputes(list);
        }
        list.add(item);
    }
    
    public java.util.Set<String> keySet_computes(){
        return this._computes.keySet();
    }

    public boolean hasComputes(){
        return !this._computes.isEmpty();
    }
    
    /**
     * 
     * xml name: createTimeProp
     *  
     */
    
    public java.lang.String getCreateTimeProp(){
      return _createTimeProp;
    }

    
    public void setCreateTimeProp(java.lang.String value){
        checkAllowChange();
        
        this._createTimeProp = value;
           
    }

    
    /**
     * 
     * xml name: createrProp
     *  
     */
    
    public java.lang.String getCreaterProp(){
      return _createrProp;
    }

    
    public void setCreaterProp(java.lang.String value){
        checkAllowChange();
        
        this._createrProp = value;
           
    }

    
    /**
     * 
     * xml name: dbCatalog
     *  
     */
    
    public java.lang.String getDbCatalog(){
      return _dbCatalog;
    }

    
    public void setDbCatalog(java.lang.String value){
        checkAllowChange();
        
        this._dbCatalog = value;
           
    }

    
    /**
     * 
     * xml name: dbPkName
     *  
     */
    
    public java.lang.String getDbPkName(){
      return _dbPkName;
    }

    
    public void setDbPkName(java.lang.String value){
        checkAllowChange();
        
        this._dbPkName = value;
           
    }

    
    /**
     * 
     * xml name: dbSchema
     *  
     */
    
    public java.lang.String getDbSchema(){
      return _dbSchema;
    }

    
    public void setDbSchema(java.lang.String value){
        checkAllowChange();
        
        this._dbSchema = value;
           
    }

    
    /**
     * 
     * xml name: deleteFlagProp
     *  
     */
    
    public java.lang.String getDeleteFlagProp(){
      return _deleteFlagProp;
    }

    
    public void setDeleteFlagProp(java.lang.String value){
        checkAllowChange();
        
        this._deleteFlagProp = value;
           
    }

    
    /**
     * 逻辑删除版本列
     * xml name: deleteVersionProp
     *  逻辑删除时，为了保持唯一键索引的有效性，需要将deleteVersion设置为当前时间，而正常情况下则设置为0。
     */
    
    public java.lang.String getDeleteVersionProp(){
      return _deleteVersionProp;
    }

    
    public void setDeleteVersionProp(java.lang.String value){
        checkAllowChange();
        
        this._deleteVersionProp = value;
           
    }

    
    /**
     * 
     * xml name: dimensionalType
     *  fact/dimension数仓分类
     */
    
    public java.lang.String getDimensionalType(){
      return _dimensionalType;
    }

    
    public void setDimensionalType(java.lang.String value){
        checkAllowChange();
        
        this._dimensionalType = value;
           
    }

    
    /**
     * 
     * xml name: displayName
     *  
     */
    
    public java.lang.String getDisplayName(){
      return _displayName;
    }

    
    public void setDisplayName(java.lang.String value){
        checkAllowChange();
        
        this._displayName = value;
           
    }

    
    /**
     * 
     * xml name: entityModeEnabled
     *  
     */
    
    public boolean isEntityModeEnabled(){
      return _entityModeEnabled;
    }

    
    public void setEntityModeEnabled(boolean value){
        checkAllowChange();
        
        this._entityModeEnabled = value;
           
    }

    
    /**
     * 
     * xml name: filters
     *  
     */
    
    public java.util.List<io.nop.orm.model.OrmEntityFilterModel> getFilters(){
      return _filters;
    }

    
    public void setFilters(java.util.List<io.nop.orm.model.OrmEntityFilterModel> value){
        checkAllowChange();
        
        this._filters = KeyedList.fromList(value, io.nop.orm.model.OrmEntityFilterModel::getName);
           
    }

    
    public io.nop.orm.model.OrmEntityFilterModel getFilter(String name){
        return this._filters.getByKey(name);
    }

    public boolean hasFilter(String name){
        return this._filters.containsKey(name);
    }

    public void addFilter(io.nop.orm.model.OrmEntityFilterModel item) {
        checkAllowChange();
        java.util.List<io.nop.orm.model.OrmEntityFilterModel> list = this.getFilters();
        if (list == null || list.isEmpty()) {
            list = new KeyedList<>(io.nop.orm.model.OrmEntityFilterModel::getName);
            setFilters(list);
        }
        list.add(item);
    }
    
    public java.util.Set<String> keySet_filters(){
        return this._filters.keySet();
    }

    public boolean hasFilters(){
        return !this._filters.isEmpty();
    }
    
    /**
     * 
     * xml name: indexes
     *  
     */
    
    public java.util.List<io.nop.orm.model.OrmIndexModel> getIndexes(){
      return _indexes;
    }

    
    public void setIndexes(java.util.List<io.nop.orm.model.OrmIndexModel> value){
        checkAllowChange();
        
        this._indexes = KeyedList.fromList(value, io.nop.orm.model.OrmIndexModel::getName);
           
    }

    
    public io.nop.orm.model.OrmIndexModel getIndex(String name){
        return this._indexes.getByKey(name);
    }

    public boolean hasIndex(String name){
        return this._indexes.containsKey(name);
    }

    public void addIndex(io.nop.orm.model.OrmIndexModel item) {
        checkAllowChange();
        java.util.List<io.nop.orm.model.OrmIndexModel> list = this.getIndexes();
        if (list == null || list.isEmpty()) {
            list = new KeyedList<>(io.nop.orm.model.OrmIndexModel::getName);
            setIndexes(list);
        }
        list.add(item);
    }
    
    public java.util.Set<String> keySet_indexes(){
        return this._indexes.keySet();
    }

    public boolean hasIndexes(){
        return !this._indexes.isEmpty();
    }
    
    /**
     * 是否键值对表
     * xml name: kvTable
     *  表示当前表作为key-value接口保存单个field对应的值。所谓的横表转纵表，就是把普通的table转换为kvTable。
     * kvTable为true要求实体对象必须实现IOrmKeyValueTable接口
     */
    
    public boolean isKvTable(){
      return _kvTable;
    }

    
    public void setKvTable(boolean value){
        checkAllowChange();
        
        this._kvTable = value;
           
    }

    
    /**
     * 
     * xml name: labelProp
     *  
     */
    
    public java.lang.String getLabelProp(){
      return _labelProp;
    }

    
    public void setLabelProp(java.lang.String value){
        checkAllowChange();
        
        this._labelProp = value;
           
    }

    
    /**
     * 
     * xml name: maxBatchLoadSize
     *  
     */
    
    public java.lang.Integer getMaxBatchLoadSize(){
      return _maxBatchLoadSize;
    }

    
    public void setMaxBatchLoadSize(java.lang.Integer value){
        checkAllowChange();
        
        this._maxBatchLoadSize = value;
           
    }

    
    /**
     * 实体名
     * xml name: name
     *  实体的名称，一般情况下与类名相同
     */
    
    public java.lang.String getName(){
      return _name;
    }

    
    public void setName(java.lang.String value){
        checkAllowChange();
        
        this._name = value;
           
    }

    
    /**
     * 是否生成代码
     * xml name: notGenCode
     *  如果设置为true，则代码生成时将跳过本实体对象，不为它生成实体类。当我们引用其他模块的实体类时应该设置此属性，
     * 从而避免在本模块中生成其他模块的实体类。
     */
    
    public boolean isNotGenCode(){
      return _notGenCode;
    }

    
    public void setNotGenCode(boolean value){
        checkAllowChange();
        
        this._notGenCode = value;
           
    }

    
    /**
     * 持久化存储机制
     * xml name: persistDriver
     *  缺省为jdbc，使用关系数据库存储
     */
    
    public java.lang.String getPersistDriver(){
      return _persistDriver;
    }

    
    public void setPersistDriver(java.lang.String value){
        checkAllowChange();
        
        this._persistDriver = value;
           
    }

    
    /**
     * 
     * xml name: querySpace
     *  
     */
    
    public java.lang.String getQuerySpace(){
      return _querySpace;
    }

    
    public void setQuerySpace(java.lang.String value){
        checkAllowChange();
        
        this._querySpace = value;
           
    }

    
    /**
     * 是否视图
     * xml name: readonly
     *  
     */
    
    public boolean isReadonly(){
      return _readonly;
    }

    
    public void setReadonly(boolean value){
        checkAllowChange();
        
        this._readonly = value;
           
    }

    
    /**
     * 是否注册短名称
     * xml name: registerShortName
     *  一般情况下会自动注册实体类的短名称，从而使得eql语句中可以使用短类名，简化sql编写。
     */
    
    public boolean isRegisterShortName(){
      return _registerShortName;
    }

    
    public void setRegisterShortName(boolean value){
        checkAllowChange();
        
        this._registerShortName = value;
           
    }

    
    /**
     * 
     * xml name: relations
     *  
     */
    
    public java.util.List<io.nop.orm.model.OrmReferenceModel> getRelations(){
      return _relations;
    }

    
    public void setRelations(java.util.List<io.nop.orm.model.OrmReferenceModel> value){
        checkAllowChange();
        
        this._relations = KeyedList.fromList(value, io.nop.orm.model.OrmReferenceModel::getName);
           
    }

    
    public io.nop.orm.model.OrmReferenceModel getRelation(String name){
        return this._relations.getByKey(name);
    }

    public boolean hasRelation(String name){
        return this._relations.containsKey(name);
    }

    public void addRelation(io.nop.orm.model.OrmReferenceModel item) {
        checkAllowChange();
        java.util.List<io.nop.orm.model.OrmReferenceModel> list = this.getRelations();
        if (list == null || list.isEmpty()) {
            list = new KeyedList<>(io.nop.orm.model.OrmReferenceModel::getName);
            setRelations(list);
        }
        list.add(item);
    }
    
    public java.util.Set<String> keySet_relations(){
        return this._relations.keySet();
    }

    public boolean hasRelations(){
        return !this._relations.isEmpty();
    }
    
    /**
     * 
     * xml name: shardProp
     *  
     */
    
    public java.lang.String getShardProp(){
      return _shardProp;
    }

    
    public void setShardProp(java.lang.String value){
        checkAllowChange();
        
        this._shardProp = value;
           
    }

    
    /**
     * 
     * xml name: sqlText
     *  当实体实际对应数据库视图时，这里为视图的定义SQL语句
     */
    
    public java.lang.String getSqlText(){
      return _sqlText;
    }

    
    public void setSqlText(java.lang.String value){
        checkAllowChange();
        
        this._sqlText = value;
           
    }

    
    /**
     * 
     * xml name: stateProp
     *  
     */
    
    public java.lang.String getStateProp(){
      return _stateProp;
    }

    
    public void setStateProp(java.lang.String value){
        checkAllowChange();
        
        this._stateProp = value;
           
    }

    
    /**
     * 表名
     * xml name: tableName
     *  
     */
    
    public java.lang.String getTableName(){
      return _tableName;
    }

    
    public void setTableName(java.lang.String value){
        checkAllowChange();
        
        this._tableName = value;
           
    }

    
    /**
     * 
     * xml name: tableView
     *  
     */
    
    public boolean isTableView(){
      return _tableView;
    }

    
    public void setTableView(boolean value){
        checkAllowChange();
        
        this._tableView = value;
           
    }

    
    /**
     * 自定义标签列表
     * xml name: tagSet
     *  
     */
    
    public java.util.Set<java.lang.String> getTagSet(){
      return _tagSet;
    }

    
    public void setTagSet(java.util.Set<java.lang.String> value){
        checkAllowChange();
        
        this._tagSet = value;
           
    }

    
    /**
     * 租户id列
     * xml name: tenantProp
     *  租户id所对应的column的name。如果useTenant为true，tenantProp的缺省值为nopTenant。tenant字段一般不在主键集合中
     */
    
    public java.lang.String getTenantProp(){
      return _tenantProp;
    }

    
    public void setTenantProp(java.lang.String value){
        checkAllowChange();
        
        this._tenantProp = value;
           
    }

    
    /**
     * 
     * xml name: unique-keys
     *  
     */
    
    public java.util.List<io.nop.orm.model.OrmUniqueKeyModel> getUniqueKeys(){
      return _uniqueKeys;
    }

    
    public void setUniqueKeys(java.util.List<io.nop.orm.model.OrmUniqueKeyModel> value){
        checkAllowChange();
        
        this._uniqueKeys = KeyedList.fromList(value, io.nop.orm.model.OrmUniqueKeyModel::getName);
           
    }

    
    public io.nop.orm.model.OrmUniqueKeyModel getUniqueKey(String name){
        return this._uniqueKeys.getByKey(name);
    }

    public boolean hasUniqueKey(String name){
        return this._uniqueKeys.containsKey(name);
    }

    public void addUniqueKey(io.nop.orm.model.OrmUniqueKeyModel item) {
        checkAllowChange();
        java.util.List<io.nop.orm.model.OrmUniqueKeyModel> list = this.getUniqueKeys();
        if (list == null || list.isEmpty()) {
            list = new KeyedList<>(io.nop.orm.model.OrmUniqueKeyModel::getName);
            setUniqueKeys(list);
        }
        list.add(item);
    }
    
    public java.util.Set<String> keySet_uniqueKeys(){
        return this._uniqueKeys.keySet();
    }

    public boolean hasUniqueKeys(){
        return !this._uniqueKeys.isEmpty();
    }
    
    /**
     * 
     * xml name: updateTimeProp
     *  
     */
    
    public java.lang.String getUpdateTimeProp(){
      return _updateTimeProp;
    }

    
    public void setUpdateTimeProp(java.lang.String value){
        checkAllowChange();
        
        this._updateTimeProp = value;
           
    }

    
    /**
     * 
     * xml name: updaterProp
     *  
     */
    
    public java.lang.String getUpdaterProp(){
      return _updaterProp;
    }

    
    public void setUpdaterProp(java.lang.String value){
        checkAllowChange();
        
        this._updaterProp = value;
           
    }

    
    /**
     * 
     * xml name: useGlobalCache
     *  
     */
    
    public boolean isUseGlobalCache(){
      return _useGlobalCache;
    }

    
    public void setUseGlobalCache(boolean value){
        checkAllowChange();
        
        this._useGlobalCache = value;
           
    }

    
    /**
     * 是否启用逻辑删除
     * xml name: useLogicalDelete
     *  如果启用逻辑删除，则delete动作将设置deleteFlag属性为1，而不是发出delete语句。查询的时候并不会自动按照
     * deleteFlag过滤，选择权交给调用者。
     */
    
    public boolean isUseLogicalDelete(){
      return _useLogicalDelete;
    }

    
    public void setUseLogicalDelete(boolean value){
        checkAllowChange();
        
        this._useLogicalDelete = value;
           
    }

    
    /**
     * 是否启用数据修订支持
     * xml name: useRevision
     *  启用数据修订要求实体上具有nopRevType/nopRevBeginVer/nopRevEndVer等字段，
     * 当实体数据发生修改时不会直接修改原记录，而是会修改原记录的nopRevEndVer字段，并插入一条新的记录。
     */
    
    public boolean isUseRevision(){
      return _useRevision;
    }

    
    public void setUseRevision(boolean value){
        checkAllowChange();
        
        this._useRevision = value;
           
    }

    
    /**
     * 是否启用分库分表
     * xml name: useShard
     *  
     */
    
    public boolean isUseShard(){
      return _useShard;
    }

    
    public void setUseShard(boolean value){
        checkAllowChange();
        
        this._useShard = value;
           
    }

    
    /**
     * 是否启用租户
     * xml name: useTenant
     *  
     */
    
    public boolean isUseTenant(){
      return _useTenant;
    }

    
    public void setUseTenant(boolean value){
        checkAllowChange();
        
        this._useTenant = value;
           
    }

    
    /**
     * 是否启用工作流支持
     * xml name: useWorkflow
     *  
     */
    
    public boolean isUseWorkflow(){
      return _useWorkflow;
    }

    
    public void setUseWorkflow(boolean value){
        checkAllowChange();
        
        this._useWorkflow = value;
           
    }

    
    /**
     * 版本列的名称
     * xml name: versionProp
     *  version机制提供了内置的乐观锁实现。它的数据类型应该是long或者int。
     */
    
    public java.lang.String getVersionProp(){
      return _versionProp;
    }

    
    public void setVersionProp(java.lang.String value){
        checkAllowChange();
        
        this._versionProp = value;
           
    }

    

    @Override
    public void freeze(boolean cascade){
        if(frozen()) return;
        super.freeze(cascade);

        if(cascade){ //NOPMD - suppressed EmptyControlStatement - Auto Gen Code
        
           this._aliases = io.nop.api.core.util.FreezeHelper.deepFreeze(this._aliases);
            
           this._columns = io.nop.api.core.util.FreezeHelper.deepFreeze(this._columns);
            
           this._components = io.nop.api.core.util.FreezeHelper.deepFreeze(this._components);
            
           this._computes = io.nop.api.core.util.FreezeHelper.deepFreeze(this._computes);
            
           this._filters = io.nop.api.core.util.FreezeHelper.deepFreeze(this._filters);
            
           this._indexes = io.nop.api.core.util.FreezeHelper.deepFreeze(this._indexes);
            
           this._relations = io.nop.api.core.util.FreezeHelper.deepFreeze(this._relations);
            
           this._uniqueKeys = io.nop.api.core.util.FreezeHelper.deepFreeze(this._uniqueKeys);
            
        }
    }

    @Override
    protected void outputJson(IJsonHandler out){
        super.outputJson(out);
        
        out.put("aliases",this.getAliases());
        out.put("checkVersionWhenLazyLoad",this.isCheckVersionWhenLazyLoad());
        out.put("className",this.getClassName());
        out.put("columns",this.getColumns());
        out.put("comment",this.getComment());
        out.put("components",this.getComponents());
        out.put("computes",this.getComputes());
        out.put("createTimeProp",this.getCreateTimeProp());
        out.put("createrProp",this.getCreaterProp());
        out.put("dbCatalog",this.getDbCatalog());
        out.put("dbPkName",this.getDbPkName());
        out.put("dbSchema",this.getDbSchema());
        out.put("deleteFlagProp",this.getDeleteFlagProp());
        out.put("deleteVersionProp",this.getDeleteVersionProp());
        out.put("dimensionalType",this.getDimensionalType());
        out.put("displayName",this.getDisplayName());
        out.put("entityModeEnabled",this.isEntityModeEnabled());
        out.put("filters",this.getFilters());
        out.put("indexes",this.getIndexes());
        out.put("kvTable",this.isKvTable());
        out.put("labelProp",this.getLabelProp());
        out.put("maxBatchLoadSize",this.getMaxBatchLoadSize());
        out.put("name",this.getName());
        out.put("notGenCode",this.isNotGenCode());
        out.put("persistDriver",this.getPersistDriver());
        out.put("querySpace",this.getQuerySpace());
        out.put("readonly",this.isReadonly());
        out.put("registerShortName",this.isRegisterShortName());
        out.put("relations",this.getRelations());
        out.put("shardProp",this.getShardProp());
        out.put("sqlText",this.getSqlText());
        out.put("stateProp",this.getStateProp());
        out.put("tableName",this.getTableName());
        out.put("tableView",this.isTableView());
        out.put("tagSet",this.getTagSet());
        out.put("tenantProp",this.getTenantProp());
        out.put("uniqueKeys",this.getUniqueKeys());
        out.put("updateTimeProp",this.getUpdateTimeProp());
        out.put("updaterProp",this.getUpdaterProp());
        out.put("useGlobalCache",this.isUseGlobalCache());
        out.put("useLogicalDelete",this.isUseLogicalDelete());
        out.put("useRevision",this.isUseRevision());
        out.put("useShard",this.isUseShard());
        out.put("useTenant",this.isUseTenant());
        out.put("useWorkflow",this.isUseWorkflow());
        out.put("versionProp",this.getVersionProp());
    }
}
 // resume CPD analysis - CPD-ON
