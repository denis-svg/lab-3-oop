package lab3;

public abstract class Block {
    public String color = null;
    public Point location = null;
    Block(int row, int col, String color){
        this.location = new Point(row, col);
        this.color = color;
    }
    Block(int row, int col){
        this.location = new Point(row, col);
    }
    public abstract void draw();
}
