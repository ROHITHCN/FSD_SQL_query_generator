package com.fsd.RdbmsDML.Service;

import org.springframework.stereotype.Service;

import com.fsd.RdbmsDML.DTO.DeleteQueryRequest;
import com.fsd.RdbmsDML.DTO.DenyRequest;
import com.fsd.RdbmsDML.DTO.GrantRequest;
import com.fsd.RdbmsDML.DTO.InsertQueryRequest;
import com.fsd.RdbmsDML.DTO.RevokeRequest;
import com.fsd.RdbmsDML.DTO.UpdateQueryRequest;

@Service
public class QueryService {

    public String generateInsertQuery(InsertQueryRequest request) {
        return "INSERT INTO " + request.getTable() + " (" + request.getColumns() + ") VALUES (" + request.getValues() + ")";
    }

    public String generateUpdateQuery(UpdateQueryRequest request) {
        return "UPDATE " + request.getTable() + " SET " + request.getSetValues() + " WHERE " + request.getCondition();
    }

    public String generateDeleteQuery(DeleteQueryRequest request) {
        return "DELETE FROM " + request.getTable() + " WHERE " + request.getCondition();
    }
    
    public String generateGrantQuery(GrantRequest request) {
        return "GRANT " + request.getPrivileges() + " ON " + request.getTableName() + " TO " + request.getUser();
    }

    public String generateRevokeQuery(RevokeRequest request) {
        return "REVOKE " + request.getPrivileges() + " ON " + request.getTableName() + " FROM " + request.getUser();
    }

    public String generateDenyQuery(DenyRequest request) {
        return "DENY " + request.getPrivileges() + " ON " +  request.getTableName() + " TO " + request.getUser();
    }


}

