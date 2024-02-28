//package controller;
//
//import org.crud.controller.EmployeeController;
//import org.crud.service.Service;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.sql.SQLException;
//import java.util.Scanner;
//
//import static org.mockito.Mockito.*;
//
//class EmployeeControllerTest {
//
//    @Mock
//    private Scanner mockScanner;
//
//    @Mock
//    private Service mockService;
//
//    @InjectMocks
//    private EmployeeController controller;
//
//    @Test
//    void inputSaveTest() throws SQLException {
//        MockitoAnnotations.openMocks(this);
//
//        // Mocking user input
//        when(mockScanner.nextLine())
//                .thenReturn("John")
//                .thenReturn("Doe")
//                .thenReturn("25");
//
//        // Testing the inputSave method
//        controller.inputSave();
//
//        // Verifying that the service's saveData method was called with the expected EmployeeModel
//        verify(mockService).saveData(argThat(employeeModel ->
//                employeeModel.getFirstName().equals("John") &&
//                        employeeModel.getLastName().equals("Doe") &&
//                        employeeModel.getAge() == 25));
//
//        // Verifying that the scanner's nextLine method was called
//        verify(mockScanner, atLeastOnce()).nextLine();
//    }
//}
