package org.crud;

import org.crud.controller.EmployeeController;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        EmployeeController controller = new EmployeeController();
        controller.inputSave();
    }
}