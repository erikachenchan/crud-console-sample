//package repository;
//
//import org.crud.dao.Database;
//import org.crud.model.EmployeeModel;
//import org.crud.repository.Repository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.*;
//
//class RepositoryTest {
//
//    private Repository repository;
//
//    private Connection mockConnection;
//    private PreparedStatement mockPreparedStatement;
//
//    @BeforeEach
//    void setUp() throws SQLException {
//        repository = new Repository();
//
//        mockConnection = mock(Connection.class);
//        mockPreparedStatement = mock(PreparedStatement.class);
//
//        // Setting up the mocks
//        when(Database.getConnection()).thenReturn(mockConnection);
//        when(mockConnection.prepareStatement(any(String.class))).thenReturn(mockPreparedStatement);
//    }
//
//    @Test
//    void saveTest() throws SQLException {
//        // Creating a sample EmployeeModel
//        EmployeeModel employeeModel = new EmployeeModel("John", "Doe", 25);
//
//        // Testing the save method
//        assertDoesNotThrow(() -> repository.save(employeeModel), "Exception thrown during save");
//
//        // Verifying that the methods were called
//        verify(mockConnection).prepareStatement(any(String.class));
//        verify(mockPreparedStatement).setString(1, "John");
//        verify(mockPreparedStatement).setString(2, "Doe");
//        verify(mockPreparedStatement).setInt(3, 25);
//        verify(mockPreparedStatement).executeUpdate();
//        verify(mockConnection).close();
//    }
//}
