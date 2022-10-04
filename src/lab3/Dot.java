package lab3;


public class Dot extends Block{
    private boolean is_eaten;
    Dot(int row, int col, String color) {
        super(row, col, color);
        this.is_eaten = false;
    }
    Dot(int row, int col) {
        super(row, col);
        this.is_eaten = false;
        this.color = "yellow";
    }
    public void hasBeenEaten(){
        color = "white";
        is_eaten = true;
    }

    public boolean isEaten(){
        return is_eaten;
    }

    public void draw(){
        System.out.println("Draw dot");
    }
}
