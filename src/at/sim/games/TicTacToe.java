package at.sim.games;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[3][3];
        boolean game_is_running = true;

        int player = 2;

        printBoard(board);


        while (game_is_running) {

            if (player == 1){
                player = 2;
            } else player = 1;

            System.out.println("Player" + player + ": ");
            int[] position = getPosition(scanner);
            while (!checkPositionIsFree(board, position)) {
                System.out.println("Position is not free");
                System.out.println("New position: ");
                position = getPosition(scanner);
            }
            updateBoard(board, position, player);
            printBoard(board);
            if (checkBoardForWinner(board, player)){
                System.out.println("Player" + player + " won!");
                game_is_running = false;
            }








        }

    }
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int state : row) {
                if(state == 1){
                    System.out.print("|o");
                }
                else if(state == 2){
                    System.out.print("|x");
                }
                else {
                    System.out.print("| ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static int[] getPositionFromInput(String input) {
        String[] input_list = input.split(",");
        int[] output = {Integer.parseInt(input_list[1]), Integer.parseInt(input_list[0])};

        return output;
    }

    public static int[] getPosition(Scanner scanner){
        int[] position = getPositionFromInput(scanner.next());
        return position;
    }

    public static int[][] updateBoard(int[][] board, int[] position, int state){
        board[position[0]][position[1]] = state;
        return board;
    }

    public static boolean checkPositionIsFree (int [][] board, int[] position) {
        if (board[position[0]][position[1]] == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean checkBoardForWinner (int[][] board, int player) {
        boolean winner = false;

        if (board[0][0] == player && board[0][1] == player && board[0][2] == player) {
            winner = true;
        }
        if (board[1][0] == player && board[1][1] == player && board[1][2] == player) {
            winner = true;
        }
        if (board[2][0] == player && board[2][1] == player && board[2][2] == player) {
            winner = true;
        }


        if (board[0][0] == player && board[1][0] == player && board[2][0] == player) {
            winner = true;
        }
        if (board[0][1] == player && board[1][1] == player && board[2][1] == player) {
            winner = true;
        }
        if (board[0][2] == player && board[1][2] == player && board[2][2] == player) {
            winner = true;
        }


        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            winner = true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            winner = true;
        }

        return winner;
    }

}
