package lab3;

public class Clyde extends Ghost{

    Clyde(int row, int col) {
        super(row, col);
        this.color = "orange";
    }

    public void chase(){
        System.out.println("Chassing PacMan randomly");
    }
    public void draw(){
        System.out.println("Draw Clyde");
    }
}
