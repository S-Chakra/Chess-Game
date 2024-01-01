/**
 * Represents a knight chess piece, which is a type of minor piece.
 * Extends the MinorPiece class and provides specific properties for knights.
 */
public class Knight extends MinorPiece {
    /**
     * Constructs a knight chess piece with the specified color.
     *
     * @param color The color of the knight piece (1 for white, 2 for black).
     */
    public Knight(byte color) {
        super(color);
    }

    /**
     * Gets the letter representation of the knight ("N").
     *
     * @return The letter "N" indicating a knight.
     */
    public String getLetter() {
        return "N";
    }

    /**
     * Gets the relative value of the knight based on its color.
     *
     * @return The relative value of the knight (+3 for white, -3 for black).
     */
    public byte getValue() {
        if (getColor() == 1) {
            return 3;
        } else {
            return -3;
        }
    }
}
