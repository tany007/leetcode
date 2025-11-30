package com.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class ZigzagGridTraversalWithSkip {

    public List<Integer> zigzagTraversal(int[][] grid) {

        List<Integer> output = new ArrayList<>();
        if (grid == null || grid.length == 0) {
            return output;
        }
        int rows = grid.length;
        int cols = grid[0].length;

        int globalCellCounter = 0;

        for (int r = 0; r < rows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < cols; c++) {
                    if (globalCellCounter % 2 == 0) {
                        output.add(grid[r][c]);
                    }
                    globalCellCounter++;
                }
            } else {
                for (int c = cols - 1; c >= 0; c--) {
                    if (globalCellCounter % 2 == 0) {
                        output.add(grid[r][c]);
                    }
                    globalCellCounter++;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        ZigzagGridTraversalWithSkip solver = new ZigzagGridTraversalWithSkip();
        int[][] grid = {
                {1,2},
                {3,4}
        };
        List<Integer> result = solver.zigzagTraversal(grid);
        System.out.println(result);
    }
}
