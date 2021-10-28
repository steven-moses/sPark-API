package spark.spark;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;

public class DatabaseTransactions {
    public static boolean insertTransaction(Transactions transactions) {
        Connection c = null;
        Statement stat = null;
        try {
            c = DatabaseConnection.connection();
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stat = c.createStatement();

            String sql = "INSERT INTO transactions (id, userid, platenumber, hourin, minin, status) VALUES (" +
                    transactions.getId() + ", " +
                    transactions.getUserId() + ", '" +
                    transactions.getPlateNumber() + "', " +
                    transactions.getEntryTime().get(Calendar.HOUR) + ", " +
                    transactions.getEntryTime().get(Calendar.MINUTE) + ", '" +
                    transactions.getVehicleStatus().toString() + "');";

            stat.executeUpdate(sql);

            stat.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return true;
    }}
