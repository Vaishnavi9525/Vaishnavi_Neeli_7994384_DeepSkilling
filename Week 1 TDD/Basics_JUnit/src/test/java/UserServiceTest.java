import org.example.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testGetUserName() {

        // Arrange
        String expected = "Admin";

        // Act
        String actual = userService.getUserName();

        // Assert
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        userService = null;
    }
}