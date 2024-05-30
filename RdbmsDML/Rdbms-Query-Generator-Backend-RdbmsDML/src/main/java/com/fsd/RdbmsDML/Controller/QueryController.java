package com.fsd.RdbmsDML.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.RdbmsDML.DTO.DeleteQueryRequest;
import com.fsd.RdbmsDML.DTO.DenyRequest;
import com.fsd.RdbmsDML.DTO.GrantRequest;
import com.fsd.RdbmsDML.DTO.InsertQueryRequest;
import com.fsd.RdbmsDML.DTO.RevokeRequest;
import com.fsd.RdbmsDML.DTO.UpdateQueryRequest;
import com.fsd.RdbmsDML.Service.QueryService;

@RestController
@RequestMapping("/query/dml")
public class QueryController {

    @Autowired
    private QueryService queryService;

    //Data Manipulation Language Queries(DML)
    @PostMapping("/generateInsertQuery")
    public String generateInsertQuery(@RequestBody InsertQueryRequest request) {
        return queryService.generateInsertQuery(request);
    }

    @PostMapping("/generateUpdateQuery")
    public String generateUpdateQuery(@RequestBody UpdateQueryRequest request) {
        return queryService.generateUpdateQuery(request);
    }

    @PostMapping("/generateDeleteQuery")
    public String generateDeleteQuery(@RequestBody DeleteQueryRequest request) {
        return queryService.generateDeleteQuery(request);
    }
    
    //Data Control Language Queries(DCL)
    @PostMapping("/generateGrantQuery")
    public String generateGrantQuery(@RequestBody GrantRequest request) {
        return queryService.generateGrantQuery(request);
    }

    @PostMapping("/generateRevokeQuery")
    public String generateRevokeQuery(@RequestBody RevokeRequest request) {
        return queryService.generateRevokeQuery(request);
    }

    @PostMapping("/generateDenyQuery")
    public String generateDenyQuery(@RequestBody DenyRequest request) {
        return queryService.generateDenyQuery(request);
    }
    
}
