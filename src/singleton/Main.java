package singleton;

public class Main {
    public static void main(String []args){
        Database database = Database.getInstance();

        database.setDatabaseUsages(5);
        System.out.println(database + " has been used " + database.getDatabaseUsages() + " times.");

        Database newDatabase = Database.getInstance();

        newDatabase.setDatabaseUsages(4);
        System.out.println(newDatabase + " has been used " + newDatabase.getDatabaseUsages() + " times.");

        System.out.println(database + " has been used " + database.getDatabaseUsages() + " times.");


    }
}
