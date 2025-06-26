package calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Setup code before each test
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    @AfterEach
    public void tearDown() {
        // Cleanup after each test
        calculator = null;
        System.out.println("Teardown complete.");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 4);

        // Assert
        assertEquals(6, result);
    }
}
