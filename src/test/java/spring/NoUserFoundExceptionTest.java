package spring;

import org.junit.Test;
import spring.exception.NoUserFoundException;

import static org.junit.Assert.assertTrue;

public class NoUserFoundExceptionTest {
    private NoUserFoundException exception = new NoUserFoundException("");

    @Test
    public void testInstance() {
        assertTrue(exception instanceof Exception);
    }
}
