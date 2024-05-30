package com.fsd.RdbmsDML.DTO;

public class UpdateQueryRequest {
	private String table;
	private String setValues;
	private String condition;

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getSetValues() {
		return setValues;
	}

	public void setSetValues(String setValues) {
		this.setValues = setValues;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
