package com.library.vo;

import java.util.List;
import java.util.Map;

public class ChartVo {

    private List<Map<String, Object>> rows;
    private List<String> columns;

    public List<Map<String, Object>> getRows() {
        return rows;
    }

    public void setRows(List<Map<String, Object>> rows) {
        this.rows = rows;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }
}
