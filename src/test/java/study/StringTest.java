package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }

    @Test
    void substring() {
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt() 메소드로 특정 위치의 문자를 가져오는 것과 값이 벗어나면 StringIndexOutOfBoundsException이 발생하는 지에 대한 테스트 ")
    void charAt() {
        char actual = "abc".charAt(1);
        assertThat(actual).isEqualTo('b');

        assertThatThrownBy(() -> {
            "abc".charAt(4);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range");
    }
}
