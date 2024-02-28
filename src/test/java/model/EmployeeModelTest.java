package model;

import org.crud.model.EmployeeModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeModelTest {

    @Test
    void gettersAndSettersTest() {
        // Creating a sample EmployeeModel
        EmployeeModel employeeModel = new EmployeeModel();

        // Setting values using setters
        employeeModel.setFirstName("John");
        employeeModel.setLastName("Doe");
        employeeModel.setAge(25);

        // Getting values using getters and asserting
        assertEquals("John", employeeModel.getFirstName());
        assertEquals("Doe", employeeModel.getLastName());
        assertEquals(25, employeeModel.getAge());
    }

    @Test
    void toStringTest() {
        // Creating a sample EmployeeModel
        EmployeeModel employeeModel = new EmployeeModel("John", "Doe", 25);

        // Asserting the toString method
        assertEquals("EmployeeModel{firstName='John', lastName='Doe', age=25}", employeeModel.toString());
    }
}
