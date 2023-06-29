package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] board0 = new ChessPiece[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                board0[i][j] = ChessPiece.EMPTY;
            }
        }
        board0[0][0] = ChessPiece.ROOK_BLACK;
        board0[0][5] = ChessPiece.ROOK_BLACK;
        board0[0][6] = ChessPiece.KING_BLACK;
        board0[1][1] = ChessPiece.R0OK_WHITE;
        board0[1][4] = ChessPiece.PAWN_BLACK;
        board0[1][5] = ChessPiece.PAWN_BLACK;
        board0[1][7] = ChessPiece.PAWN_BLACK;
        board0[2][0] = ChessPiece.PAWN_BLACK;
        board0[2][2] = ChessPiece.KNIGHT_BLACK;
        board0[2][6] = ChessPiece.PAWN_BLACK;
        board0[3][0] = ChessPiece.QUEEN_BLACK;
        board0[3][3] = ChessPiece.BISHOP_WHITE;
        board0[4][3] = ChessPiece.BISHOP_BLACK;
        board0[4][4] = ChessPiece.PAWN_WHITE;
        board0[5][4] = ChessPiece.BISHOP_WHITE;
        board0[5][5] = ChessPiece.PAWN_WHITE;
        board0[6][0] = ChessPiece.PAWN_WHITE;
        board0[6][0] = ChessPiece.PAWN_WHITE;
        board0[6][3] = ChessPiece.QUEEN_WHITE;
        board0[6][5] = ChessPiece.PAWN_WHITE;
        board0[6][7] = ChessPiece.PAWN_WHITE;
        board0[7][5] = ChessPiece.R0OK_WHITE;
        board0[7][6] = ChessPiece.KING_WHITE;

        ChessBoard board = new ChessBoard(board0);
        board.print();
    }
}
