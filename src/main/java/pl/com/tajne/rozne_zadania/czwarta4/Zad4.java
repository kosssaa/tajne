package pl.com.tajne.rozne_zadania.czwarta4;

import java.util.ArrayList;
import java.util.Arrays;

public class Zad4 {

    private int[][] chess;

    public Zad4(int[][] board) {
        this.chess = board;
    }


    public static final int EMPTY = 0;
    public static final int BLACK_KING = 1;
    public static final int BLACK_QUEEN = 3;
    public static final int BLACK_ROOK = 5;
    public static final int BLACK_BISHOP = 7;
    public static final int BLACK_KNIGHT = 9;
    public static final int BLACK_PAWN = 11;

    public static final int WHITE_KING = 2;
    public static final int WHITE_QUEEN = 4;
    public static final int WHITE_ROOK = 6;
    public static final int WHITE_BISHOP = 8;
    public static final int WHITE_KNIGHT = 10;
    public static final int WHITE_PAWN = 12;

    public static pl.com.tajne.rozne_zadania.czwarta4.Zad4 sampleBoard() {
        int[][] board = new int[][]{
                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{BLACK_PAWN, BLACK_PAWN, EMPTY, EMPTY, EMPTY, EMPTY, WHITE_PAWN, EMPTY},

                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},

                new int[]{EMPTY, BLACK_KING, BLACK_PAWN, EMPTY, EMPTY, WHITE_KNIGHT, EMPTY, EMPTY},
                new int[]{EMPTY, BLACK_KNIGHT, EMPTY, EMPTY, WHITE_ROOK, EMPTY, WHITE_PAWN, EMPTY},

                new int[]{EMPTY, EMPTY, EMPTY, BLACK_ROOK, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{EMPTY, WHITE_KING, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},


        };
        return new pl.com.tajne.rozne_zadania.czwarta4.Zad4(board);
    }

    public static void main(String[] args) {
        pl.com.tajne.rozne_zadania.czwarta4.Zad4 sampleBoard = sampleBoard();
        System.out.println(Arrays.deepToString(sampleBoard.chess));
    }
}

