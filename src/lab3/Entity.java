package lab3;

public abstract class Entity {
    private final Point location;
    public String color = null;
    Entity(int row, int col){
        this.location = new Point(row, col);
    }
    public Point getLocation(){
        return this.location;
    }
    public void moveUp(){
        System.out.println("Entity has moved up");
        this.location.setRow(this.getLocation().getRow() - 1);
    }
    public void moveDown(){
        System.out.println("Entity has moved down");
        this.location.setRow(this.getLocation().getRow() + 1);
    }
    public void moveLeft(){
        System.out.println("Entity has moved left");
        this.location.setRow(this.getLocation().getCol() - 1);
    }
    public void moveRight(){
        System.out.println("Entity has moved right");
        this.location.setRow(this.getLocation().getCol() + 1);
    }

    public abstract void draw();
}
