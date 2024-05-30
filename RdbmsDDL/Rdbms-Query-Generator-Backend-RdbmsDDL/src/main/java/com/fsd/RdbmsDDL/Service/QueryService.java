package com.fsd.RdbmsDDL.Service;

import java.util.Map;
import java.util.StringJoiner;

import org.springframework.stereotype.Service;

import com.fsd.RdbmsDDL.DTO.CreateIndexRequest;
import com.fsd.RdbmsDDL.DTO.CreateTableRequest;
import com.fsd.RdbmsDDL.DTO.DropTableRequest;
import com.fsd.RdbmsDDL.DTO.SelectQueryRequest;
import com.fsd.RdbmsDDL.DTO.TruncateTableRequest;

@Service
public class QueryService {

	public String generateCreateTableQuery(CreateTableRequest request) {
		String tableName = request.getTableName();
		Map<String, String> columns = request.getColumns();

		StringJoiner columnDefinitions = new StringJoiner(", ");
		for (Map.Entry<String, String> entry : columns.entrySet()) {
			columnDefinitions.add(entry.getKey() + " " + entry.getValue());
		}

		return "CREATE TABLE " + tableName + " (" + columnDefinitions.toString() + ")";
	}

	public String generateDropTableQuery(DropTableRequest request) {
		return "DROP TABLE " + request.getTableName();
	}

	public String generateAlterTableQuery(String tableName, String operation) {
		return "ALTER TABLE " + tableName + " " + operation;
	}

	public String generateTruncateTableQuery(TruncateTableRequest request) {
		return "TRUNCATE TABLE " + request.getTableName();
	}

	public String generateSelectQuery(SelectQueryRequest request) {
		String query = "SELECT " + request.getColumns() + " FROM " + request.getTable();
		if (request.getCondition() != null && !request.getCondition().isEmpty()) {
			query += " WHERE " + request.getCondition();
		}
		if (request.getOrderBy() != null && !request.getOrderBy().isEmpty()) {
			query += " ORDER BY " + request.getOrderBy();
		}
		query += " LIMIT " + request.getLimit();
		return query;
	}

	public String generateDistinctQuery(SelectQueryRequest request) {
		return "SELECT DISTINCT " + request.getColumns() + " FROM " + request.getTable();
	}

	public String generateJoinQuery(SelectQueryRequest request) {
		return "SELECT " + request.getColumns() + " FROM " + request.getTable() + " INNER JOIN "
				+ request.getJoinTable() + " ON " + request.getJoinCondition();
	}

	public String generateGroupByQuery(SelectQueryRequest request) {
		return "SELECT " + request.getColumns() + " FROM " + request.getTable() + " GROUP BY "
				+ request.getGroupByColumns();
	}

	public String generateHavingQuery(SelectQueryRequest request) {
		return "SELECT " + request.getColumns() + " FROM " + request.getTable() + " GROUP BY "
				+ request.getGroupByColumns() + " HAVING " + request.getHavingCondition();
	}

	public String generateCreateIndexQuery(CreateIndexRequest request) {
		return "CREATE INDEX " + request.getIndexName() + " ON " + request.getTableName() + " (" + request.getColumns()
				+ ")";
	}

}
