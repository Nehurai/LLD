import java.util.*;
import Model.*;
public class TicTacToeGame {
    Deque<Player> players;
    Board board;
    Player winner;
    public void initializeGame() {
        players = new ArrayDeque<>();
        Player playerX = new Player("Player X", new PlayingPieceX());
        Player playerO = new Player("Player O", new PlayingPieceO());
        players.add(playerX);
        players.add(playerO);
        board = new Board(3);
    }
    public GameStatus startGame() {
        while (true) {
            Player currentPlayer = players.poll();
            board.printBoard();
            int[] move = currentPlayer.makeMove(board);
            boolean piecePlaced = board.placePiece(move[0], move[1], currentPlayer.getPlayingPiece());
            if (!piecePlaced) {
                System.out.println("Invalid move. Try again.");
                players.addFirst(currentPlayer);
                continue;
            }
            players.add(currentPlayer);
            if (board.checkWin(currentPlayer.getPlayingPiece())) {
                winner = currentPlayer;
                board.printBoard();
                return currentPlayer.getPlayingPiece().pieceType == PieceType.X ? GameStatus.X_WON : GameStatus.O_WON;
            }
            if (board.isFull()) {
                board.printBoard();
                return GameStatus.DRAW;
            }
        }
    }
    public boolean isGameOver() {
        return winner != null || board.isFull();
    }
    public boolean isFull() {
        return board.isFull();
    }
}
