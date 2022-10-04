package lab3;

public class PacMan extends Entity{
    PacMan(int row, int col){
        super(row, col);
        System.out.println("Initializing pacman entity");
    }

    public void draw(){
        System.out.print("draw pacman at position: ");
        System.out.print(this.getLocation().getRow());
        System.out.print(" ");
        System.out.println(this.getLocation().getCol());
    }
}
