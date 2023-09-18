package bo;

public interface Board {
    void initilize();
    boolean isOccupied(Position position);
    boolean isValid(Position position);
    void place(Piece piece);
    Piece getPiece(Position position);
    int getSize();
}
