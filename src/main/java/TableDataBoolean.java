public class TableDataBoolean implements TableData {
    private boolean data;
    public TableDataBoolean() {
    }

    public String toString() {
        return Boolean.toString(data);
    }

    public TableData makeCopy() {
        TableData obj = null;
        try {
            obj = (TableData) super.clone();
            data = rnd.nextBoolean();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}

