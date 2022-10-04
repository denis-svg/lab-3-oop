package lab3;

public class Blinky extends Ghost{

    Blinky(int row, int col) {
        super(row, col);
        this.color = "Red";
    }

    public void chase(){
        System.out.println("Chassing PacMan agressively");
    }
    public void draw(){
        System.out.println("Draw blinky");
    }
}
