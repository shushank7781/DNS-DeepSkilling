import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method - runs before every test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created.");
    }

    // Test method using AAA Pattern
    @Test
    public void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    // Teardown method - runs after every test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator object destroyed.");
    }
}
