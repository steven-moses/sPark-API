package spark.spark;
public class main {

    public static void main(String[] args) {
        Transactions transactions = new Transactions(1, 1,"B1234AB", VehicleStatus.INSIDE);
        System.out.println(transactions);
        DatabaseTransactions.insertTransaction(transactions);
    }
}
