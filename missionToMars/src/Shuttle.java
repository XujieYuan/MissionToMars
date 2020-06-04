import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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

    /**
     * main
     */
    public void start()
    {
        System.out.print(readFileByLines().get(0));
        System.out.println(readFileByLines().get(1).split(","));
    }


    /**
     * read file contents
     */
    public ArrayList<String> readFileByLines()
    {
        String fileName = "./src/shuttle.txt";
        ArrayList<String> shuttles = new ArrayList<String>();
        try
        {
            FileReader fileReader = new FileReader(fileName);
            try
            {
                Scanner parser = new Scanner(fileReader);
                while (parser.hasNextLine())
                {
                    shuttles.add(parser.nextLine());
                }
            }
            finally
            {
                fileReader.close();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(fileName + " not found when reading file");
            System.exit(0);
        }
        catch (IOException e)
        {
            System.out.println("Unexpected I/O error occured");
        }
        return shuttles;
    }

    /**
     * calculate file lines
     */
    public int countLines()
    {
        String fileName = "./src/shuttle.txt";
        int linesNumber = 0;
        try
        {
            FileReader fileReader = new FileReader(fileName);
            try
            {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((bufferedReader.readLine()) != null)
                {
                    linesNumber++;
                }
            }
            finally
            {
                fileReader.close();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(fileName + " not found when counting lines");
        }
        catch (IOException e)
        {
            System.out.println("Unexpected I/O error occured");
        }
        return linesNumber;
    }


}
