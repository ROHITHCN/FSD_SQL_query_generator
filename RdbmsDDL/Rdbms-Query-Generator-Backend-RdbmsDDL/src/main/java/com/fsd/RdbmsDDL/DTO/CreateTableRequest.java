package com.fsd.RdbmsDDL.DTO;

import java.util.Map;

public class CreateTableRequest {
    private String tableName;
    private Map<String, String> columns;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public Map<String, String> getColumns() {
		return columns;
	}
	public void setColumns(Map<String, String> columns) {
		this.columns = columns;
	}

    // Getters and setters
    
}

