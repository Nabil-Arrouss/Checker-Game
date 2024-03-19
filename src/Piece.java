public class Piece {
    private  PieceColor color;
    private boolean isKing;

    public Piece(PieceColor color) {
        this.color = color;
        this.isKing = false;
    }
    public PieceColor getColor() {
        return color;
    }
    public boolean isKing() {
        return isKing;
    }
    public void makeKing() {
        // make the piece a king
    }
}