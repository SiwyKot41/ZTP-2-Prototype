public class TableDataInt implements TableData {
    private int data;
    public TableDataInt() {
    }

    public String toString() {
        return Integer.toString(data);
    }

    public TableData makeCopy() {
        TableData obj = null;
        try {
            obj = (TableData) super.clone();
            data = rnd.nextInt(100);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
