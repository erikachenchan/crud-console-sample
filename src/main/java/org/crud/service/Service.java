package org.crud.service;

import org.crud.model.EmployeeModel;

import java.sql.SQLException;

public interface Service {
    void saveData(EmployeeModel model) throws SQLException;
}
