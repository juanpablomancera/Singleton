package singleton;

public class Database {
    private static Database instance;
    int DatabaseUsages = 0;

    private Database() {}

    public static Database getInstance(){
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static void setInstance(Database instance) {
        Database.instance = instance;
    }

    public int getDatabaseUsages() {
        return DatabaseUsages;
    }

    public void setDatabaseUsages(int databaseUsages) {
        DatabaseUsages = databaseUsages;
    }
}
