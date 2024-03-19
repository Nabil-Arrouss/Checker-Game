public class CheckerGame {
    private CheckerBoard board;
    public CheckerGame() {
        this.board = new CheckerBoard();
    }
    public void play() {
        while (!board.isGameOver()) {
            board.print();
            Player currentPlayer = board.getCurrentPlayer();
            System.out.println(currentPlayer.getName() + "'s turn");
            Move move = currentPlayer.getMove(board);
            board.move(move);
        }
        board.print();
        Player winner = board.getWinner();
        System.out.println("Game over. " + winner.getName() + " wins!");
    }
}