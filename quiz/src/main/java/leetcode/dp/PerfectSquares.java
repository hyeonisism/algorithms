package leetcode.dp;

import java.util.Arrays;

/**
 * link {https://leetcode.com/problems/perfect-squares/}
 *
 * @author hyeonisism
 */
public class PerfectSquares {
    static class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n + 1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            for (int i = 0; i <= n; i++) {
                for (int j = 1; i + j * j <= n; j++) {
                    dp[i + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
                }
                for (int i1 : dp) {
                    System.out.print(String.format("%10d", i1));
                    System.out.print(" , ");
                }
                System.out.println();
            }
            return dp[n];
        }
    }
}
