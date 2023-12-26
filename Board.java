/**
 * This class represents a chessboard and helps manage chess pieces on it.
 * It has methods to place and retrieve pieces, and to calculate the board's
 * evaluation.
 *
 */
public class Board {
    private static Piece[][] pieces;

    /**
     * Creates an empty chessboard with no pieces on it.
     */
    public Board() {
        pieces = new Piece[8][8];
    }

    /**
     * Creates a chessboard with a specified arrangement of pieces.
     *
     * @param pieces A 2D array representing the initial piece setup.
     */
    public Board(Piece[][] pieces) {
        Board.pieces = pieces;
    }

    /**
     * Places a chess piece on the board at the specified position.
     *
     * @param piece The piece to be put on the board.
     * @param x     The column number (1-8) where the piece is placed.
     * @param y     The row number (1-8) where the piece is placed.
     */
    public void setPiece(Piece piece, int x, int y) {
        if (x >= 1 && x <= 8 && y >= 1 && y <= 8) {
            pieces[x - 1][y - 1] = piece;
        }
    }

    /**
     * Retrieves the current configuration of the chessboard.
     *
     * @return A 2D array representing the current board setup.
     */
    public static Piece[][] getPieces() {
        return pieces;
    }

    /**
     * Calculates a score indicating the relative value of pieces on the board.
     *
     * @return The relative evaluation score of the board.
     */
    public double relativeEvaluation() {
        double sum = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (pieces[i][j] != null) {
                    sum += pieces[i][j].getValue();
                }
            }
        }
        return sum;
    }

    /**
     * Calculates a score indicating the adjusted value of pieces on the board.
     *
     * @return The adjusted evaluation score of the board.
     */
    public double adjustedEvaluation() {
        double sum = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (pieces[i][j] != null) {
                    sum += pieces[i][j].computeAdjustedValue();
                }
            }
        }
        return sum;
    }

    /**
     * Provides a summary of the board's current state, including the counts of
     * different types of pieces.
     *
     * @return A string with information about the board's configuration.
     */
    public String toString() {
        int numKings = 0;
        int numPawns = 0;
        int numMajorPieces = 0;
        int numMinorPieces = 0;

        for (int x = 1; x <= 8; x++) {
            for (int y = 1; y <= 8; y++) {
                if (pieces[x - 1][8 - y] instanceof King) {
                    numKings++;
                } else if (pieces[x - 1][8 - y] instanceof Pawn) {
                    numPawns++;
                } else if (pieces[x - 1][8 - y] instanceof MajorPiece) {
                    numMajorPieces++;
                } else if (pieces[x - 1][8 - y] instanceof MinorPiece) {
                    numMinorPieces++;
                }
            }
        }

        return "Number of Kings: " + numKings +
                "\nNumber of Pawns: " + numPawns +
                "\nNumber of Major Pieces: " + numMajorPieces +
                "\nNumber of Minor Pieces: " + numMinorPieces;
    }
}
