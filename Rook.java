/**
 * Represents a rook chess piece, which is a type of major piece.
 * Extends the MajorPiece class and provides specific properties for rooks.
 */
public class Rook extends MajorPiece {
    /**
     * Constructs a rook chess piece with the specified color.
     *
     * @param color The color of the rook piece (1 for white, 2 for black).
     */
    public Rook(byte color) {
        super(color);
    }

    /**
     * Gets the letter representation of the rook ("R").
     *
     * @return The letter "R" indicating a rook.
     */
    public String getLetter() {
        return "R";
    }

    /**
     * Gets the relative value of the rook based on its color.
     *
     * @return The relative value of the rook (+5 for white, -5 for black).
     */
    public byte getValue() {
        if (getColor() == 1) {
            return 5;
        } else {
            return -5;
        }
    }
}
