package bo;

import java.util.Objects;

public class Piece {
    private final String symbol;
    private Position position;

    private Piece(String symbol) {
        this.symbol = symbol;
    }

    private Piece(Piece piece) {
        this.symbol = piece.symbol;
    }

    public Piece clone() {
        return new Piece(this);
    }

    public static Piece of(String symbol) {
        return new Piece(symbol);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return Objects.equals(symbol, piece.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }

    @Override
    public String toString() {
        return symbol;
    }
}
