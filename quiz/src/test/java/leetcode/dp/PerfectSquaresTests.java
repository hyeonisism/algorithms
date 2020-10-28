package leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PerfectSquaresTests {

    @Test
    void shouldReturn1() {
        // expect
        assertThat(new PerfectSquares.Solution().numSquares(12)).isEqualTo(3);
    }

    @Test
    void shouldReturn2() {
        // expect
        assertThat(new PerfectSquares.Solution().numSquares(13)).isEqualTo(2);
    }

    @Test
    void shouldReturn3() {
        // expect
        assertThat(new PerfectSquares.Solution().numSquares(8)).isEqualTo(2);
    }

}