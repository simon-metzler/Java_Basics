package at.sim.games;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[3][3];
        boolean game_is_running = true;

        while (game_is_running) {
            System.out.println("Player 1: ");
            int[] position = getPositionFromInput(scanner.next());
            updateBoard(board, position, 1);
            printBoard(board);



        }

    }
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int state : row) {
                if(state == 1){
                    System.out.print("o|");
                }
                if(state == 2){
                    System.out.print("x|");
                }
                else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }

    public static int[] getPositionFromInput(String input) {
        String[] input_list = input.split(",");
        int[] output = {Integer.parseInt(input_list[0]), Integer.parseInt(input_list[1])};

        return output;
    }

    public static int[][] updateBoard(int[][] board, int[] position, int state){
        board[position[0]][position[1]] = state;
        return board;
    }

}
