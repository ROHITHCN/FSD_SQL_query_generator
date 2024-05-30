package com.fsd.RdbmsDML.DTO;

import java.util.List;

public class GrantRequest {
	private List<String> privileges;
	private String tableName;
	private String user;

	public GrantRequest() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<String> privileges) {
		this.privileges = privileges;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
