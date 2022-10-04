package lab3;

public class Wall extends Block{
    Wall(int row, int col, String color) {
        super(row, col, color);
    }

    Wall(int row, int col){
        super(row, col);
        this.color = "Black";
    }

    public void draw(){
        System.out.println("draw wall");
    }
}
