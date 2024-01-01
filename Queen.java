/**
 * Represents a queen chess piece, which is a type of major piece.
 * Extends the MajorPiece class and provides specific properties for queens.
 */
public class Queen extends MajorPiece {
    /**
     * Constructs a queen chess piece with the specified color.
     *
     * @param color The color of the queen piece (1 for white, 2 for black).
     */
    public Queen(byte color) {
        super(color);
    }

    /**
     * Gets the letter representation of the queen ("Q").
     *
     * @return The letter "Q" indicating a queen.
     */
    public String getLetter() {
        return "Q";
    }

    /**
     * Gets the relative value of the queen based on its color.
     *
     * @return The relative value of the queen (+9 for white, -9 for black).
     */
    public byte getValue() {
        if (getColor() == 1) {
            return 9;
        } else {
            return -9;
        }
    }
}
