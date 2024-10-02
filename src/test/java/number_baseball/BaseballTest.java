package number_baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest {
    BaseballGame bg;
    @BeforeEach
    void setUp() {
        bg = new BaseballGame();
    }
    @Test
    @DisplayName("세자리 난수 생성 테스트")
    void testGenerateThreeDigitNumber() {
        int result = bg.generateThreeDigitNumber();
        //100 ~ 999 사이의 숫자인지 테스트
        assertThat(result).isBetween(100, 999);
        // 각 자리를 분리하여 저장
        int hundreds = result / 100;
        int tens = (result / 10) % 10;
        int ones = result % 10;
        // 서로 다른 숫자인지 확인
        assertThat(hundreds).isNotEqualTo(tens);
        assertThat(hundreds).isNotEqualTo(ones);
        assertThat(tens).isNotEqualTo(ones);
        //모든 자리가 1부터 9 사이의 숫자인지 확인
        assertThat(hundreds).isBetween(1, 9);
        assertThat(tens).isBetween(1, 9);
        assertThat(ones).isBetween(1, 9);
    }
}
