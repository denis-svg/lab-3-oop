package lab3;

public class Lava extends Block{
    private boolean is_active;

    Lava(int row, int col, String color) {
        super(row, col, color);
        this.is_active = false;
    }
    Lava(int row, int col) {
        super(row, col);
        this.is_active = false;
        // applying a default color
        this.color = "red";
    }

    public void draw(){
        System.out.println("drawing lava");
    }

    public void activateLava(){
        is_active = true;
        color = "red";
    }
    public void deactivateLava(){
        is_active = false;
        color = "white";
    }
}
