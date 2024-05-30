package com.fsd.RdbmsDDL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.RdbmsDDL.DTO.AlterTableRequest;
import com.fsd.RdbmsDDL.DTO.CreateIndexRequest;
import com.fsd.RdbmsDDL.DTO.CreateTableRequest;
import com.fsd.RdbmsDDL.DTO.DropTableRequest;
import com.fsd.RdbmsDDL.DTO.SelectQueryRequest;
import com.fsd.RdbmsDDL.DTO.TruncateTableRequest;
import com.fsd.RdbmsDDL.Service.QueryService;

@RestController
@RequestMapping("/query/ddl")
public class QueryController {

	@Autowired
	private QueryService queryService;

	// Data Definition Language Queries(DDL)
	@PostMapping("/generateCreateTableQuery")
	public String generateCreateTableQuery(@RequestBody CreateTableRequest request) {
		return queryService.generateCreateTableQuery(request);
	}

	@PostMapping("/generateAlterTableQuery")
	public String generateAlterTableQuery(@RequestBody AlterTableRequest request) {
		return queryService.generateAlterTableQuery(request.getTableName(), request.getOperation());
	}

	@PostMapping("/generateDropTableQuery")
	public String generateDropTableQuery(@RequestBody DropTableRequest request) {
		return queryService.generateDropTableQuery(request);
	}

	@PostMapping("/generateTruncateTableQuery")
	public String generateTruncateTableQuery(@RequestBody TruncateTableRequest request) {
		return queryService.generateTruncateTableQuery(request);
	}

	// Data Query Language Query(DQL)
	@PostMapping("/generateSelectQuery")
	public String generateSelectQuery(@RequestBody SelectQueryRequest request) {
		return queryService.generateSelectQuery(request);
	}

	// Commonly used other Queries
	@PostMapping("/generateDistinctQuery")
	public String generateDistinctQuery(@RequestBody SelectQueryRequest request) {
		return queryService.generateDistinctQuery(request);
	}

	@PostMapping("/generateJoinQuery")
	public String generateJoinQuery(@RequestBody SelectQueryRequest request) {
		return queryService.generateJoinQuery(request);
	}

	@PostMapping("/generateGroupByQuery")
	public String generateGroupByQuery(@RequestBody SelectQueryRequest request) {
		return queryService.generateGroupByQuery(request);
	}

	@PostMapping("/generateHavingQuery")
	public String generateHavingQuery(@RequestBody SelectQueryRequest request) {
		return queryService.generateHavingQuery(request);
	}

	@PostMapping("/generateCreateIndexQuery")
	public String generateCreateIndexQuery(@RequestBody CreateIndexRequest request) {
		return queryService.generateCreateIndexQuery(request);
	}

}
