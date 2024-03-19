import java.util.ArrayList;
import java.util.List;

public class CheckerBoard {

        private Piece[][] board;
        private Player player1;
        private Player player2;
        private Player currentPlayer;

        public CheckerBoard() {

            // initialize the board and players
            this.board = new Piece[8][8];
            this.player1 = new Player("Player 1", PieceColor.BLACK);
            this.player2 = new Player("Player2", PieceColor.WHITE);
            this.currentPlayer = player1;

            for (int row = 0; row < 3; row++){
                for (int col = 0; col < 8; col++){
                    if ((row + col) % 2 == 1){
                        board[row][col] = new Piece(PieceColor.WHITE);
                    }
                }
            }
            for (int row = 0; row < 3; row++){
                for (int col = 0; col < 8; col++){
                    if ((row + col) % 2 == 1){
                        board[row][col] = new Piece(PieceColor.BLACK);
                    }
                }
            }

        }

    public boolean isGameOver() {
        return false; // Place holder
    }
    public void move(Move move) {
        // Move a piece on the board
        int fromRow = move.getFromRow();
        int fromCol = move.getFromCol();
        int toRow = move.getToRow();
        int toCol = move.getToCol();
        board[toRow][toCol] = board[fromRow][fromCol];
        board[fromRow][fromCol] = null;
        // Check if the piece should be promoted to king
        Piece piece = board[toRow][toCol];
        if (toRow == 0 && piece.getColor() == PieceColor.BLACK) {
            piece.makeKing();
        }
        if (toRow == 7 && piece.getColor() == PieceColor.WHITE) {
            piece.makeKing();
        }
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getWinner() {
        return null;
    }

    public void print() {
        // Print the board
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board[row][col];
                if (piece == null) {
                    System.out.print("-");
                } else {
                    if (piece.getColor() == PieceColor.BLACK) {
                        if (piece.isKing()) {
                            System.out.print("B+");
                        } else {
                            System.out.print("B ");
                        }
                    } else {
                        if (piece.isKing()) {
                            System.out.print("W+");
                        } else {
                            System.out.print("W ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}