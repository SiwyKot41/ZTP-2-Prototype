public class TableDataDouble implements TableData {
    private double data;
    public TableDataDouble() {
    }

    public String toString() {
        return Double.toString(data);
    }

    public TableData makeCopy() {
        TableData obj = null;
        try {
            obj = (TableData) super.clone();
            data = rnd.nextDouble();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}

