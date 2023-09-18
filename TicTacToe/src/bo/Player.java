package bo;

public class Player {
    private final Piece piece;
    private String id;

    public Player(Piece piece, String id) {
        this.piece = piece;
        this.id = id;
    }

    public Piece getPiece() {
        return piece;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
