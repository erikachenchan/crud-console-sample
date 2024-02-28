package org.crud.repository;


import org.crud.dao.Database;
import org.crud.model.EmployeeModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Database
public class Repository {

    public void save(EmployeeModel model) throws SQLException {
        Connection connection = null;
        try {
            connection = Database.getConnection();
            PreparedStatement ps;
            ps = connection.prepareStatement("INSERT INTO `employeeDetails`(`firstname`, `lastname`, `age`) VALUES (?,?,?)");
            ps.setString(1, model.getFirstName());
            ps.setString(2, model.getLastName());
            ps.setInt(3, model.getAge());
            ps.executeUpdate();
            System.out.println("Success!!");
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            Database.closeConnection(connection);
        }
    }
}
