import Model.GameStatus;    
public class PlayGame{
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        GameStatus status = game.startGame();
        System.out.println("Game Over! Result: " + status);
        switch (status){
            case X_WON:
                System.out.println("Player X has won!");
                break;
            case O_WON:
                System.out.println("Player O has won!");
                break;
            case DRAW:
                System.out.println("The game is a draw!");
                break;
            default:
                break;
        }
    }
}