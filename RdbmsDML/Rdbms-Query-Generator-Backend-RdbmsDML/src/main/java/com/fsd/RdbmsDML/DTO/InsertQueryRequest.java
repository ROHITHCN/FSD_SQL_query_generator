package com.fsd.RdbmsDML.DTO;

public class InsertQueryRequest {
	
    private String table;
    private String columns;
    private String values;
    
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public String getColumns() {
		return columns;
	}
	public void setColumns(String columns) {
		this.columns = columns;
	}
	public String getValues() {
		return values;
	}
	public void setValues(String values) {
		this.values = values;
	}
}
