public class TableDataChar implements TableData {
    private char data;
    public TableDataChar() {
    }

    public String toString() {
        return Character.toString(data);
    }

    public TableData makeCopy() {
        TableData obj = null;
        try {
            obj = (TableData) super.clone();
            data = (char) ('a' + rnd.nextInt(26));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}

