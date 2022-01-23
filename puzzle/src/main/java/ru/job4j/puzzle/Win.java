package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][0] == 1 && (board[index][1] == 1) && board[index][2] == 1 && board[index][3] == 1 && board[index][4] == 1 ||
                    board[0][index] == 1 && board[1][index] == 1 && board[2][index] == 1 && board[3][index] == 1 && board[4][index] == 1) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}

