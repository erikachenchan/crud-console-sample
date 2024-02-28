package org.crud.service.impl;

import org.crud.model.EmployeeModel;
import org.crud.repository.Repository;
import org.crud.service.Service;

import java.sql.SQLException;

public class ImplService implements Service {
    @Override
    public void saveData(EmployeeModel model) throws SQLException {
        Repository repository = new Repository();
        repository.save(model);
    }
}
