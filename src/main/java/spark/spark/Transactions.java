package spark.spark;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Transactions {
    private int id;
    private int userId;
    private String plateNumber;
    private Calendar entryTime;
    private Calendar exitTime;
    private VehicleStatus vehicleStatus;
    private int fee;

    public Transactions(int id, int userId, String plateNumber, VehicleStatus vehicleStatus) {
        this.id = id;
        this.userId = userId;
        this.plateNumber = plateNumber;
        this.entryTime = new GregorianCalendar();
        this.vehicleStatus = vehicleStatus;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public Calendar getEntryTime() {
        return entryTime;
    }

    public Calendar getExitTime() {
        return exitTime;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        if (exitTime==null) {
            return "Transactions{" +
                    "id=" + id +
                    ", userId=" + userId +
                    ", plateNumber='" + plateNumber + '\'' +
                    ", entryTime=" + sdf.format(entryTime.getTime()) +
                    ", vehicleStatus=" + vehicleStatus +
                    ", fee=" + fee +
                    '}';
        }
        return "Transactions{" +
                "id=" + id +
                ", userId=" + userId +
                ", plateNumber='" + plateNumber + '\'' +
                ", entryTime=" + sdf.format(entryTime.getTime()) +
                ", exitTime=" + sdf.format(exitTime.getTime()) +
                ", vehicleStatus=" + vehicleStatus +
                ", fee=" + fee +
                '}';
    }
}
