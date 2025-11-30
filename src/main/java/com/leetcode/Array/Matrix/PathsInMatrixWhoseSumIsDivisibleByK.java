package com.leetcode.Array.Matrix;

/*You are given a 0-indexed m x n integer matrix grid and an integer k.
You are currently at position (0, 0) and you want to reach position (m - 1, n - 1) moving only down or right.
Return the number of paths where the sum of the elements on the path is divisible by k.
Since the answer may be very large, return it modulo 109 + 7.
*/

// TODO: Go through DP solution
public class PathsInMatrixWhoseSumIsDivisibleByK {

    public int numberOfPaths(int[][] grid, int k) {

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] dp = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(i==0 && j==0) {
                    dp[i][j] = grid[i][j];
                }
                else {
                     dp[i][j] = (dp[i-1][j] + dp[i][j]) % k;
                }
            }
        }
        return dp[rows-1][cols-1];

    }

    public static void main(String[] args) {
        PathsInMatrixWhoseSumIsDivisibleByK pathsInMatrixWhoseSumIsDivisibleByK = new PathsInMatrixWhoseSumIsDivisibleByK();
        int[][] grid = {
                {5,2,4},
                {3,0,5},
                {0,7,2},
        };
        int k = 3;
        int result = pathsInMatrixWhoseSumIsDivisibleByK.numberOfPaths(grid, k);
        System.out.println(result);
    }
}
