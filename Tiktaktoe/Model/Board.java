package Model;

import java.util.*;

/**
 * Board
 */
class Pair<T, U> {
    public final T first;
    public final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
public class Board {

    public int size;
    public PlayingPiece[][] board;
    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }
    public boolean placePiece(int row, int col, PlayingPiece piece) {
        if (row < 0 || row >= size || col < 0 || col >= size || board[row][col] != null) {
            return false;
        }
        board[row][col] = piece;
        return true;
    }

    public boolean checkWin(PlayingPiece piece) {
        PieceType pieceType = piece.pieceType;

        for (int i = 0; i < size; i++) {
            boolean rowMatch = true;
            boolean colMatch = true;

            for (int j = 0; j < size; j++) {
                if (board[i][j] == null || board[i][j].pieceType != pieceType) {
                    rowMatch = false;
                }
                if (board[j][i] == null || board[j][i].pieceType != pieceType) {
                    colMatch = false;
                }
            }

            if (rowMatch || colMatch) {
                return true;
            }
        }

        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] == null || board[i][i].pieceType != pieceType) {
                diagonalMatch = false;
            }
            if (board[i][size - 1 - i] == null || board[i][size - 1 - i].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return diagonalMatch || antiDiagonalMatch;
    }

    public boolean isFull() {
        return getFreeCells().isEmpty();
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String value = board[i][j] == null ? " " : board[i][j].pieceType.toString();
                System.out.print(" " + value + " ");
                if (j < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("---+---+---");
            }
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new Pair<>(i, j));
                }
            }
        }
        return freeCells;
    }
}
