package patterns.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavApplicationToDatabase();
        database.insert();
        database.update();
        database.remove();
        database.select();

    }
}
