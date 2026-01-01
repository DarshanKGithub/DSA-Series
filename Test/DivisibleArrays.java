package Test;

import java.util.*;

public class DivisibleArrays {

    static final int MOD = 10000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // max value
        int K = sc.nextInt(); // length of array

        // dp[len][val]
        int[][] dp = new int[K + 1][N + 1];

        // Base case: length = 1
        for (int val = 1; val <= N; val++) {
            dp[1][val] = 1;
        }

        // Build DP table
        for (int len = 1; len < K; len++) {
            for (int x = 1; x <= N; x++) {

                if (dp[len][x] == 0) continue;

                // Go to multiples of x
                for (int y = x; y <= N; y += x) {
                    dp[len + 1][y] =
                        (dp[len + 1][y] + dp[len][x]) % MOD;
                }
            }
        }

        // Sum all arrays of length K
        int result = 0;
        for (int val = 1; val <= N; val++) {
            result = (result + dp[K][val]) % MOD;
        }

        System.out.println(result);
    }
}
