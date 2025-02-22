package io.nop.core.lang.sql;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSqlHelper {
    @Test
    public void testSplit() {
        String text = "\n select o where a=';' ; \n select b;  ss";
        List<SQL> sqls = SqlHelper.splitSqlText(text);
        assertEquals(3, sqls.size());
        assertEquals("\n select o where a=';' ", sqls.get(0).getText());
        assertEquals("select b", sqls.get(1).getText());
        assertEquals("ss", sqls.get(2).getText());
    }
}
