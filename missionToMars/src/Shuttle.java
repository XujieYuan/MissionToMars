import java.util.Date;


/**
 * Author: Xujie yuan
 * version: 1.0
 */

public class Shuttle {

    /**
     * Fields
     */
    private int shuttleId;
    private String shuttleName;
    private Date manufactureYear;
    private int fuelCapacity;
    private int passengerCapacity;
    private int cargoCapacity;
    private int travelSpeed;
    private String origin;

    /**
     * default constructor
     */
    public Shuttle()
    {
        shuttleId = 0;
        shuttleName = "";
        manufactureYear = null;
        fuelCapacity = 0;
        passengerCapacity = 0;
        cargoCapacity = 0;
        travelSpeed = 0;
        origin = "";
    }

    /**
     * non-default constructor
     */
    public Shuttle(int newShuttleId, String newShuttleName, Date newManufactureYear, int newFuelCapacity, int newPassengerCapacity, int newCargoCapacity, int newTravelSpeed, String newOrigin)
    {
        shuttleId = newShuttleId;
        shuttleName = newShuttleName;
        manufactureYear = newManufactureYear;
        fuelCapacity = newFuelCapacity;
        passengerCapacity = newPassengerCapacity;
        cargoCapacity = newCargoCapacity;
        travelSpeed = newTravelSpeed;
        origin = newOrigin;
    }

    /**
     * Accessor
     */
    public int getShuttleId() {
        return shuttleId;
    }

    public String getShuttleName() {
        return shuttleName;
    }

    public Date getManufactureYear() {
        return manufactureYear;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public String getOrigin() {
        return origin;
    }

    /**
     * Mutator
     */
    public void setShuttleId(int shuttleId) {
        this.shuttleId = shuttleId;
    }

    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }

    public void setManufactureYear(Date manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setTravelSpeed(int travelSpeed) {
        this.travelSpeed = travelSpeed;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
