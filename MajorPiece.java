/**
 * Abstract class representing a major chess piece, such as a queen or rook.
 * It extends the Piece class and inherits common piece properties.
 */
public abstract class MajorPiece extends Piece {
    /**
     * Constructs a major chess piece with the specified color.
     *
     * @param color The color of the major piece (1 for white, 2 for black).
     */
    public MajorPiece(byte color) {
        super(color);
    }
}
