package io.nop.wf.dao.store;

import io.nop.orm.IOrmEntitySet;
import io.nop.orm.IOrmKeyValueTable;
import io.nop.wf.core.IWorkflowVarSet;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class KvTableVarSet implements IWorkflowVarSet {
    private final IOrmEntitySet<? extends IOrmKeyValueTable> set;

    public KvTableVarSet(IOrmEntitySet<? extends IOrmKeyValueTable> set) {
        this.set = set;
    }

    @Override
    public Set<String> getVarNames() {
        return set.stream().map(IOrmKeyValueTable::getFieldName).collect(Collectors.toSet());
    }

    @Override
    public Object getVar(String varName) {
        IOrmKeyValueTable item = (IOrmKeyValueTable) set.prop_get(varName);
        return item == null ? null : item.getValue();
    }

    @Override
    public void removeVar(String varName) {
        IOrmKeyValueTable item = (IOrmKeyValueTable) set.prop_get(varName);
        if (item != null) {
            set.remove(item);
        }
    }

    @Override
    public void setVar(String varName, Object value) {
        IOrmKeyValueTable item = (IOrmKeyValueTable) set.prop_make(varName);
        item.setValue(value);
    }

    @Override
    public void setVars(Map<String, Object> vars) {
        if (vars != null) {
            vars.forEach(this::setVar);
        }
    }
}
