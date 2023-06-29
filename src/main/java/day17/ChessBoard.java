package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print() {
        for(ChessPiece[] line: board) {
            for(ChessPiece figure: line) {
                System.out.print(figure);
            }
            System.out.println();
        }
    }
}
