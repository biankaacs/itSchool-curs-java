package org.example.session34;

class DatabaseConnection {
    private String connectionString;
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        connectionString = "jdbc:postgress://localhost:3306/db";
        // Private constructor to prevent instantiation
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database: " + connectionString);
    }
}

public class Singleton {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();
        System.out.println(db);
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();
        System.out.println(db2);
    }
}
