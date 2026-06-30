package Model;

import java.util.Scanner;

public class Player {
    public String name;
    public PlayingPiece playingPiece;
    private static final Scanner SCANNER = new Scanner(System.in);

    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }
    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

    public int[] makeMove(Board board) {
        System.out.print(name + " (" + playingPiece.pieceType + "), enter row and column (0-2): ");
        int row = SCANNER.nextInt();
        int col = SCANNER.nextInt();
        return new int[] { row, col };
    }
}
