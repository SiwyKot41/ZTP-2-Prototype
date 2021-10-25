public class TableHeader {
    String type;
    TableData tableData;

    public TableHeader(String type, TableData tableData) {
        this.tableData = tableData;
        this.type = type;
    }

    public String toString() {
        return type;
    }

    public TableData createTableData() {
        return tableData.makeCopy();
    }
}

