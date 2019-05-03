import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc = new Calculator();

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(calc.multiply(3,4), 12);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(calc.divide(18,3), 6);
    }

    @org.junit.jupiter.api.Test
    void addition() {
        assertEquals(calc.addition(2,7), 9);
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        assertEquals(calc.subtraction(13, 6), 7);
    }
}