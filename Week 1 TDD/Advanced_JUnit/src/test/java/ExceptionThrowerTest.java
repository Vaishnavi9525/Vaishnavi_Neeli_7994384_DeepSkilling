import org.example.ExceptionThrower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {

    @Test
    void testThrowException() {

        ExceptionThrower exceptionThrower = new ExceptionThrower();

        assertThrows(RuntimeException.class, () -> {
            exceptionThrower.throwException();
        });
    }
}