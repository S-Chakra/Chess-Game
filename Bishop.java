/**
 * Represents a bishop chess piece, which is a type of minor piece.
 * Extends the MinorPiece class and provides specific properties for bishops.
 */
public class Bishop extends MinorPiece {
    /**
     * Constructs a bishop chess piece with the specified color.
     *
     * @param color The color of the bishop piece (1 for white, 2 for black).
     */
    public Bishop(byte color) {
        super(color);
    }

    /**
     * Gets the letter representation of the bishop ("B").
     *
     * @return The letter "B" indicating a bishop.
     */
    public String getLetter() {
        return "B";
    }

    /**
     * Gets the relative value of the bishop based on its color.
     *
     * @return The relative value of the bishop (+3 for white, -3 for black).
     */
    public byte getValue() {
        if (getColor() == 1) {
            return 3;
        } else {
            return -3;
        }
    }
}
