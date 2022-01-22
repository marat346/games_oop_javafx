package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if ((board[1][index] != 'X') && (board[index][1] != 'X')) {
                result = true;
                break;
            }
        }
        return result;
    }
}