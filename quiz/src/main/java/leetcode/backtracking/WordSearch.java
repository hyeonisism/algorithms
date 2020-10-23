package leetcode.backtracking;

/**
 * link {https://leetcode.com/problems/word-search/}
 *
 * @author hyeonisism
 */
public class WordSearch {

    static class Solution {
        public boolean exist(char[][] board, String word) {
            boolean[][] visit = new boolean[board.length][board[0].length];
            for (int row = 0; row < board[0].length; row++) {
                for (int line = 0; line < board.length; line++) {
                    if (word.charAt(0) == board[line][row] && search(board, line, row, word, 0, visit)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean search(char[][] board, int line, int row, String word, int index, boolean[][] visit) {
            if (index == word.length()) {
                return true;
            }

            if (line < 0 || line > board.length - 1 || row < 0 || row > board[0].length - 1 || word.charAt(index) != board[line][row] || visit[line][row]) {
                return false;
            }

            visit[line][row] = true;

            if (search(board, line + 1, row, word, index + 1, visit) ||
                    search(board, line - 1, row, word, index + 1, visit) ||
                    search(board, line, row + 1, word, index + 1, visit) ||
                    search(board, line, row - 1, word, index + 1, visit)
            ) {
                return true;
            }

            visit[line][row] = false;

            return false;
        }
    }
}

