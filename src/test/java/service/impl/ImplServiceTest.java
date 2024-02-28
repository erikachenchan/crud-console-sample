//package service.impl;
//
//import org.crud.model.EmployeeModel;
//import org.crud.repository.Repository;
//import org.crud.service.impl.ImplService;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.sql.SQLException;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.verify;
//
//class ImplServiceTest {
//
//    @Mock
//    private Repository mockRepository;
//
//    @InjectMocks
//    private ImplService service;
//
//    @Test
//    void saveDataTest() throws SQLException {
//        MockitoAnnotations.openMocks(this);
//
//        // Creating a sample EmployeeModel
//        EmployeeModel employeeModel = new EmployeeModel("John", "Doe", 25);
//
//        // Mocking the behavior of the repository
//        doNothing().when(mockRepository).save(employeeModel);
//
//        // Testing the saveData method
//        service.saveData(employeeModel);
//
//        // Verifying that the save method of the repository was called
//        verify(mockRepository).save(employeeModel);
//    }
//}
