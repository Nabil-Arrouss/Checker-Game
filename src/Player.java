import java.util.List;
import static java.lang.Math.*;
public class Player {
    private String name;
    private PieceColor color;
    public Player(String name, PieceColor color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {    // get player's name
        return name;
    }
    public PieceColor getColor() {    // get player piece color
        return color;
    }
    public Move getMove(CheckerBoard board ){
        // Get the player's move
        // This is a placeholder implementation that just returns a random move
        List<Move> moves = board.getValidMoves(color);
        int randomIndex = (int) (random() * moves.size());
        return moves.get(randomIndex);
    }
}