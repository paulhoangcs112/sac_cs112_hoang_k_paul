import java.util.*;
public class TicTic {


    private String[][] board;
    private Scanner console;

    public TicTic(String[][] table, Scanner console) {
        this.board = table;
        this.console = console;
    }

    public void makeTable() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "_";
            }
        }
    }

    public void printTable() {
        System.out.print(" ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + "│");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "│");
            }
            System.out.println();
        }
    }

    public void play(Scanner console) {
        int turn = 0;
        String player = "_";
        makeTable();
        printTable();
        while (turn != 9) {
            int x = console.nextInt();
            int y = console.nextInt();

            while (x >= board.length || y >= board[1].length) {
                System.out.println("Out of bounce, try again!!!");
                x = console.nextInt();
                y = console.nextInt();
            }

            while (board[y][x] != "_") {
                System.out.println("Occupied, try again!!!");
                x = console.nextInt();
                y = console.nextInt();
            }

            if (turn % 2 == 0) {
                player = "X";
            } else {
                player = "O";
            }
            board[y][x] = player;
            turn++;
            printTable();
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[][] board = new String[3][3];
        TicTic ttt = new TicTic(board, console);
        ttt.play(console);
    }
}