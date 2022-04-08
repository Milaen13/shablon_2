import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntsCalculatorTest {

    public static IntsCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new IntsCalculator();
    }

// сумма

    @Test
    void sum() {

        // given
        final int a = 5;
        final int b = 5;
        final int expected = 10;

        // when
        final int actual = calculator.sum(a, b);

        // then
        Assert.assertEquals(expected, actual);
    }

    // умножение

    @Test
    void mult() {

        // given
        final int a = 5;
        final int b = 5;
        final int expected = 25;

        // when
        final int actual = calculator.mult(a, b);

        // then
        Assert.assertEquals(expected, actual);
    }

    // степень

    @Test
    void pow() {

        // given
        final int a = 5;
        final int b = 5;
        final int expected = 3125;

        // when
        final int actual = calculator.pow(a, b);

        // then
        Assert.assertEquals(expected, actual);
    }
}
