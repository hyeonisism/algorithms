package leetcode.backtracking;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordSearchTests {

    @Test
    void shouldReturnTrue() {
        // given
        WordSearch.Solution solution = new WordSearch.Solution();

        // when
        char[][] input = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        boolean result = solution.exist(input, "ABCCED");

        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnTrue2() {
        // given
        WordSearch.Solution solution = new WordSearch.Solution();

        // when
        char[][] input = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        boolean result = solution.exist(input, "SEE");

        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalse() {
        // given
        WordSearch.Solution solution = new WordSearch.Solution();

        // when
        char[][] input = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        boolean result = solution.exist(input, "ABCB");

        // then
        assertThat(result).isFalse();
    }
}
