/**
 * Abstract class representing a minor chess piece, such as a bishop or knight.
 * It extends the Piece class and inherits common piece properties.
 */
public abstract class MinorPiece extends Piece {
    /**
     * Constructs a minor chess piece with the specified color.
     *
     * @param color The color of the minor piece (1 for white, 2 for black).
     */
    public MinorPiece(byte color) {
        super(color);
    }
}
