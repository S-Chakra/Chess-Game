/**
 * Represents a pawn chess piece.
 * Extends the Piece class and provides specific properties for pawns.
 */
public class Pawn extends Piece {
    /**
     * Constructs a pawn chess piece with the specified color.
     *
     * @param color The color of the pawn piece (1 for white, 2 for black).
     */
    public Pawn(byte color) {
        super(color);
    }

    /**
     * Gets the letter representation of the pawn (" ").
     *
     * @return A space character indicating a pawn.
     */
    public String getLetter() {
        return " ";
    }

    /**
     * Gets the relative value of the pawn based on its color.
     *
     * @return The relative value of the pawn (+1 for white, -1 for black).
     */
    public byte getValue() {
        if (getColor() == 1) {
            return 1;
        } else {
            return -1;
        }
    }
}
