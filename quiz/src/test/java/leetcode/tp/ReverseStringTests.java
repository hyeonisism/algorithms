package leetcode.tp;

import org.junit.jupiter.api.Test;

import static leetcode.tp.ReverseString.Solution;
import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringTests {

    @Test
    void shouldDo1() {
        // given
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};

        // when
        new Solution().reverseString(chars);

        // then
        assertThat(chars).containsExactly('o', 'l', 'l', 'e', 'h');
    }

    @Test
    void shouldDo2() {
        // given
        char[] chars = new char[]{'h', 'a', 'n', 'n', 'a', 'h'};

        // when
        new Solution().reverseString(chars);

        // then
        assertThat(chars).containsExactly('h', 'a', 'n', 'n', 'a', 'h');
    }
}