package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.DisplayName;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @DisplayName("contains() 메소드 테스트")
    @ValueSource(ints = {1, 2, 3})
    void contains(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    @DisplayName("contains() 메소드를 활용해 입력 값에 따라 결과 값이 다른 경우에 대한 테스트")
    @ParameterizedTest
    @CsvSource({"1, true", "2, true", "3, true", "4, false", "5, false"})
    void caseByContains(int i, boolean b) {
        assertThat(numbers.contains(i)).isEqualTo(b);
    }
}
