//__XGEN_FORCE_OVERRIDE__
package io.nop.xlang.ast._gen;

import io.nop.xlang.ast.RestBinding;
import io.nop.xlang.ast.XLangASTNode; //NOPMD - suppressed UnusedImports - Auto Gen Code

import io.nop.xlang.ast.XLangASTKind;
import io.nop.core.lang.json.IJsonHandler;
import io.nop.api.core.util.ProcessResult;
import java.util.function.Function;
import java.util.function.Consumer;


// tell cpd to start ignoring code - CPD-OFF
@SuppressWarnings({"PMD.UselessOverridingMethod","PMD.UnusedLocalVariable",
        "PMD.UnnecessaryFullyQualifiedName","PMD.UnnecessaryImport","PMD.EmptyControlStatement"})
public abstract class _RestBinding extends XLangASTNode {
    
    protected io.nop.xlang.ast.Identifier identifier;
    
    protected io.nop.xlang.ast.Expression initializer;
    

    public _RestBinding(){
    }

    
    public io.nop.xlang.ast.Identifier getIdentifier(){
        return identifier;
    }

    public void setIdentifier(io.nop.xlang.ast.Identifier value){
        checkAllowChange();
        if(value != null) value.setASTParent(this);
        
        this.identifier = value;
    }
    
    public io.nop.xlang.ast.Expression getInitializer(){
        return initializer;
    }

    public void setInitializer(io.nop.xlang.ast.Expression value){
        checkAllowChange();
        if(value != null) value.setASTParent(this);
        
        this.initializer = value;
    }
    

    public void validate(){
       super.validate();
     
          checkMandatory("identifier",getIdentifier());
       
    }


    public RestBinding newInstance(){
      return new RestBinding();
    }

    @Override
    public RestBinding deepClone(){
       RestBinding ret = newInstance();
    ret.setLocation(getLocation());
    ret.setLeadingComment(getLeadingComment());
    ret.setTrailingComment(getTrailingComment());
    copyExtFieldsTo(ret);
    
                if(identifier != null){
                  
                          ret.setIdentifier(identifier.deepClone());
                      
                }
            
                if(initializer != null){
                  
                          ret.setInitializer(initializer.deepClone());
                      
                }
            
       return ret;
    }

    @Override
    public void forEachChild(Consumer<XLangASTNode> processor){
    
            if(identifier != null)
                processor.accept(identifier);
        
            if(initializer != null)
                processor.accept(initializer);
        
    }

    @Override
    public ProcessResult processChild(Function<XLangASTNode,ProcessResult> processor){
    
            if(identifier != null && processor.apply(identifier) == ProcessResult.STOP)
               return ProcessResult.STOP;
        
            if(initializer != null && processor.apply(initializer) == ProcessResult.STOP)
               return ProcessResult.STOP;
        
       return ProcessResult.CONTINUE;
    }

    @Override
    public boolean replaceChild(XLangASTNode oldChild, XLangASTNode newChild){
    
            if(this.identifier == oldChild){
               this.setIdentifier((io.nop.xlang.ast.Identifier)newChild);
               return true;
            }
        
            if(this.initializer == oldChild){
               this.setInitializer((io.nop.xlang.ast.Expression)newChild);
               return true;
            }
        
        return false;
    }

    @Override
    public boolean removeChild(XLangASTNode child){
    
            if(this.identifier == child){
                this.setIdentifier(null);
                return true;
            }
        
            if(this.initializer == child){
                this.setInitializer(null);
                return true;
            }
        
    return false;
    }

    @Override
    public boolean isEquivalentTo(XLangASTNode node){
       if(this.getASTKind() != node.getASTKind())
          return false;
    RestBinding other = (RestBinding)node;
    
            if(!isNodeEquivalent(this.identifier,other.getIdentifier())){
               return false;
            }
        
            if(!isNodeEquivalent(this.initializer,other.getInitializer())){
               return false;
            }
        
        return true;
    }

    @Override
    public XLangASTKind getASTKind(){
       return XLangASTKind.RestBinding;
    }

    protected void serializeFields(IJsonHandler json) {
        
                    if(identifier != null){
                      
                              json.put("identifier", identifier);
                          
                    }
                
                    if(initializer != null){
                      
                              json.put("initializer", initializer);
                          
                    }
                
    }

    @Override
    public void freeze(boolean cascade){
      super.freeze(cascade);
        
                if(identifier != null)
                    identifier.freeze(cascade);
                if(initializer != null)
                    initializer.freeze(cascade);
    }

}
 // resume CPD analysis - CPD-ON