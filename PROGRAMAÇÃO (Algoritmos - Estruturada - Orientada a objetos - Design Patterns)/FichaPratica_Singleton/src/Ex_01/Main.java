package Ex_01;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection databaseConnection3306 = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydatabase");
        DatabaseConnection databaseConnection8000 = DatabaseConnection.getInstance("databaseConnection8000");
        DatabaseConnection databaseConnection9600 = DatabaseConnection.getInstance("databaseConnection9600");

        databaseConnection3306.connect();
        databaseConnection8000.connect();
        databaseConnection9600.connect();

        databaseConnection3306.disconnect();
        databaseConnection8000.disconnect();
        databaseConnection9600.disconnect();
    }
}
