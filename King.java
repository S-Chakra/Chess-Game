/**
 * Represents a king chess piece.
 * Extends the Piece class and provides specific properties for kings.
 */
public class King extends Piece {
    /**
     * Constructs a king chess piece with the specified color.
     *
     * @param color The color of the king piece (1 for white, 2 for black).
     */
    public King(byte color) {
        super(color);
    }

    /**
     * Gets the letter representation of the king ("K").
     *
     * @return The letter "K" indicating a king.
     */
    public String getLetter() {
        return "K";
    }

    /**
     * Gets the relative value of the king based on its color.
     *
     * @return The relative value of the king (+9 for white, -9 for black).
     */
    public byte getValue() {
        if (getColor() == 1) {
            return 9;
        } else {
            return -9;
        }
    }
}
