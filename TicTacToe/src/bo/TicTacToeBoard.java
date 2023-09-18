package bo;

import java.util.HashMap;
import java.util.Map;

public class TicTacToeBoard implements Board {

    private Piece[][] board;
    private final int size;

    public TicTacToeBoard(int size) {
        this.size = size;
    }

    @Override
    public void initilize() {
        //Getting Input About the Size of Board
        board = new Piece[size][size];
    }

    @Override
    public boolean isOccupied(Position position) {
        return board[position.getX()][position.getY()] != null;
    }

    @Override
    public boolean isValid(Position position) {
        return (position.getX() >= 0 && position.getX() < size && position.getY() >= 0 && position.getY() < size);
    }

    @Override
    public void place(Piece piece) {
        Position position = piece.getPosition();
        board[position.getX()][position.getY()] = piece;
    }

    @Override
    public Piece getPiece(Position position) {
        return board[position.getX()][position.getY()];
    }

    @Override
    public int getSize() {
        return size;
    }
}
