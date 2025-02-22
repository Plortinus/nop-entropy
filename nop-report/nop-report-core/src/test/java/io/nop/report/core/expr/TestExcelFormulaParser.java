package io.nop.report.core.expr;

import io.nop.core.initialize.CoreInitialization;
import io.nop.core.lang.eval.IEvalAction;
import io.nop.core.unittest.BaseTestCase;
import io.nop.excel.model.XptCellModel;
import io.nop.report.core.engine.XptRuntime;
import io.nop.report.core.model.ExpandedCell;
import io.nop.report.core.model.ExpandedRow;
import io.nop.report.core.model.ExpandedTable;
import io.nop.xlang.api.XLang;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExcelFormulaParser {
    @BeforeAll
    public static void init() {
        CoreInitialization.initialize();
    }

    @AfterAll
    public static void destroy() {
        CoreInitialization.destroy();
    }

    @Test
    public void testParse() {
        BaseTestCase.forceStackTrace();

        ExcelFormulaParser.parseFormula(null, "IF(A1<> \"2\",1,2)", XLang.newCompileTool());

        ExcelFormulaParser.parseFormula(null, "IF(A1<> \"2\",2)", XLang.newCompileTool());
    }

    @Test
    public void testFilterExpr() {
        BaseTestCase.forceStackTrace();

        IEvalAction action = ExcelFormulaParser.parseFormula(null, "SUM(IF(\"e.value <= 2 \",A1:B4))", XLang.newCompileTool());

        XptRuntime xptRt = new XptRuntime(XLang.newEvalScope());
        ExpandedCell cell = new ExpandedCell();
        XptCellModel cellModel = new XptCellModel();
        cellModel.setName("A1");
        cell.setModel(cellModel);
        cell.setValue(1);
        xptRt.setCell(cell);

        ExpandedTable table = new ExpandedTable(2, 2);
        ExpandedRow row = table.makeRow(0);
        row.setFirstCell(cell);
        cell.setRow(row);
        table.addNamedCell(cell);

        Object result = action.invoke(xptRt);
        assertEquals(1, result);
    }
}
