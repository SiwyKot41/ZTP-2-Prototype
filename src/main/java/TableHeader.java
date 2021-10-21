public abstract class TableHeader {
    String type;
    TableData tableData;

    public TableHeader() {
    }

    public String toString() {
        return type;
    }

    public abstract TableData copyTableData();
}

class TableHeaderInt extends TableHeader {

    public TableHeaderInt() {
        tableData = new TableDataInt();
        type = "INT";
    }

    @Override
    public TableDataInt copyTableData() {
        return (TableDataInt) tableData.makeCopy();
    }
}
class TableHeaderDouble extends TableHeader {
    public TableHeaderDouble() {
        tableData = new TableDataDouble();
        type = "DOUBLE";
    }

    @Override
    public TableDataDouble copyTableData() {
        return (TableDataDouble) tableData.makeCopy();
    }
}

class TableHeaderChar extends TableHeader {
    public TableHeaderChar() {
        tableData = new TableDataChar();
        type = "CHAR";
    }

    @Override
    public TableDataChar copyTableData() {
        return (TableDataChar) tableData.makeCopy();
    }
}

class TableHeaderBoolean extends TableHeader {
    public TableHeaderBoolean() {
        tableData = new TableDataBoolean();
        type = "BOOLEAN";
    }

    @Override
    public TableDataBoolean copyTableData() {
        return (TableDataBoolean) tableData.makeCopy();
    }
}
