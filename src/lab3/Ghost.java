package lab3;

public abstract class Ghost extends Entity {

    Ghost(int row, int col) {
        super(row, col);
    }

    public abstract void chase();

}
