/**
 * This abstract class represents a chess piece. It includes methods and
 * properties
 * common to all chess pieces, such as color, position, and value.
 */
public abstract class Piece {
    private byte color;

    /**
     * Constructs a chess piece with the specified color.
     *
     * @param color The color of the chess piece (1 for white, 2 for black).
     */
    public Piece(byte color) {
        // Ensure the color is either 1 (white) or 2 (black).
        if (color == 1 || color == 2) {
            this.color = color;
        } else {
            this.color = color; // If an invalid color is provided, it defaults to 0.
        }
    }

    /**
     * Gets the color of the chess piece.
     *
     * @return The color of the chess piece (1 for white, 2 for black).
     */
    public byte getColor() {
        return color;
    }

    /**
     * Gets the algebraic chess notation representation of the piece's location.
     *
     * @return The location of the piece in algebraic notation (e.g., "a1").
     */
    public String getStringLocation() {
        int row = -1;
        int column = -1;
        Piece[][] board = Board.getPieces();

        // Find the piece's location on the board.
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == this) {
                    row = i;
                    column = j + 1;
                    break;
                }
            }
        }

        if (row != -1 && column != -1) {
            char file = (char) ('a' + row);
            return String.valueOf(file) + column;
        }

        return null;
    }

    /**
     * Abstract method to get the letter representing the piece.
     *
     * @return A one-character string representing the piece type (e.g., "K" for
     *         king).
     */
    public abstract String getLetter();

    /**
     * Abstract method to get the relative value of the piece.
     *
     * @return The relative value of the piece.
     */
    public abstract byte getValue();

    /**
     * Computes the adjusted value of the piece based on its position on the board.
     *
     * @return The adjusted value of the piece.
     */
    public double computeAdjustedValue() {
        double distanceX = 0;
        double distanceY = 0;
        double adjustedValue = 0;
        Piece[][] board = Board.getPieces();

        // Find the piece's location on the board.
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == this) {
                    distanceX = Math.abs(i - 3.5);
                    distanceY = Math.abs(j - 3.5);
                    adjustedValue = (getValue()) * (5 - distanceX) * (5 - distanceY);
                    break;
                }
            }
        }
        return adjustedValue;
    }

    /**
     * Returns a string representation of the piece including its type and location.
     *
     * @return A string representation of the piece (e.g., "Kc3" for a white king at
     *         c3).
     */
    public String toString() {
        return getLetter() + getStringLocation();
    }
}
