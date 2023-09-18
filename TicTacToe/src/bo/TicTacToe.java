package bo;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe implements Game{

    List<Player> players = new ArrayList<>();
    private Board board;
    @Override
    public void addPlayer() {
        //Player Adding Logic from Input
        players.add(new Player(Piece.of("X"), "Kanno"));
//        players.add(new Player(Piece.of("O"), "Pushkal"));
    }

    @Override
    public void startGame() {
        board.initilize();
        boolean isFinished = false;
        int index = 0;
        while (!isFinished) {
            Player player = players.get(index);
            boolean isWinner = turn(player);
            print();
            if(isWinner) {
                System.out.println("Winner is "+player);
                isFinished = true;
            }
            index = (index+1)%players.size();
        }
    }

    private boolean turn(Player player) {
        Piece piece = player.getPiece().clone();
        //Some input from user
        piece.setPosition(Position.of(0,0));
        if(board.isOccupied(piece.getPosition()) && !board.isValid(piece.getPosition())) {
            System.err.println("Incorrect Input, Missed Your Chance!!");
            return false;
        } else {
            board.place(piece);
        }
        return isWinner(piece);
    }

    private boolean isWinner(Piece piece) {

        return isLeftDiagonal(piece) ||
            isRightDiagonal(piece) ||
            isHorizontal(piece) ||
            isVertical(piece);
    }

    private boolean isLeftDiagonal(Piece piece) {
        //Logic to check for Left Diagonal
        return false;
    }

    private boolean isRightDiagonal(Piece piece) {
        //Logic to check for Right Diagonal
        return false;
    }

    private boolean isHorizontal(Piece piece) {
        //Logic to check for Right Diagonal
        return false;
    }

    private boolean isVertical(Piece piece) {
        //Logic to check for Vertical
        return false;
    }

    private void print() {
        for(int i = 0; i < board.getSize(); i++) {
            for(int j = 0; j < board.getSize(); j++) {
                Piece piece = board.getPiece(Position.of(i,j));
                if(piece == null) System.out.print("_");
                else System.out.println(piece);
            }
            System.out.println();
        }
    }

    @Override
    public void endGame() {
        System.out.println("1 2 123 3 5 4 32 2 246 246 4 2 2 47 57 7777777777");
    }
}
