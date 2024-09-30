package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    StringCalculator sc;

    @BeforeEach
    public void setUp() {
        sc = new StringCalculator();
    }

    @DisplayName("add 메소드 테스트")
    @Test
    public void 덧셈() {
        assertThat(6).isEqualTo(sc.add(3,3));
    }

    @DisplayName("subtract 메소드 테스트")
    @Test
    public void 뺄셈() {
        assertThat(0).isEqualTo(sc.subtract(3,3));
    }

    @DisplayName("multiply 메소드 테스트")
    @Test
    public void 곱셈() {
        assertThat(9).isEqualTo(sc.multiply(3,3));
    }

    @DisplayName("divide 메소드 테스트")
    @Test
    public void 나눗셈() {
        assertThat(1).isEqualTo(sc.divide(3,3));
    }

    @DisplayName("문자열 계산 메소드 calculate() 테스트")
    @Test
    public void 문자열계산테스트() {
        String[] values = new String[] {"2", "*", "3", "/", "2", "-", "5", "+", "4"};
        assertThat(sc.calculate(values)).isEqualTo(2);
    }
}
