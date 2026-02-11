package Interfaces;

public class Main2 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        King k = new King();
        k.moves();
    }
}

interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen Moves : up , down , left, right, diagonal(in all 4 directions)");
    }
}

class Rock implements ChessPlayer{
    public void moves(){
        System.out.println("Rock Moves : up , down , left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("King Moves : up , down , left, right , diagonal -(By 1 step)");
    }
}