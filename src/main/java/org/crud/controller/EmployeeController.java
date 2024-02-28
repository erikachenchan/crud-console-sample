package org.crud.controller;

import org.crud.model.EmployeeModel;
import org.crud.service.Service;
import org.crud.service.impl.ImplService;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeController {

    public static Scanner scanner = new Scanner(System.in);

    public void inputSave() throws SQLException {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter age: ");
        int userAge = Integer.parseInt(scanner.nextLine());

        EmployeeModel employeeModel = new EmployeeModel(firstName, lastName, userAge);

        Service service = new ImplService();
        service.saveData(employeeModel);
    }
}
