import java.util.Random;

interface TableData extends Cloneable {
    Random rnd = new Random();
    public TableData makeCopy();
}
