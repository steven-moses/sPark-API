package spark.spark;
public enum VehicleStatus {

    OUTSIDE("Outside"),
    INSIDE("Inside");

    private final String type;

    private VehicleStatus(String type){
        this.type=type;
    }

    @Override
    public String toString() {
        return type;
    }
}
