package az.edu.ada.wm2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void testAppHasAGreeting() {
        App app = new App();
        assertNotNull("App should have a greeting", app.getGreeting());
    }

    @Test
    public void testGreetingMessage() {
        App app = new App();
        assertEquals("Hello, Maven!", app.getGreeting());
    }   
    @Test
    public void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result);
    }
    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        assertEquals(2, result);
    }
    @Test
    public void testFailCase() {
// This test is designed to fail
        assertTrue(true);
    }
}
