package com.fsd.RdbmsDDL.DTO;

import java.util.List;

public class CreateIndexRequest {
    private String indexName;
    private String tableName;
    private List<String> columns;
	public String getIndexName() {
		return indexName;
	}
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public List<String> getColumns() {
		return columns;
	}
	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

    // Getters and setters
    
}


