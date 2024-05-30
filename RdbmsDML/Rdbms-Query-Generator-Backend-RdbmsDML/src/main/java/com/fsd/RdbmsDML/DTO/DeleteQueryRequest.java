package com.fsd.RdbmsDML.DTO;

public class DeleteQueryRequest {
	private String table;
	private String condition;

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
