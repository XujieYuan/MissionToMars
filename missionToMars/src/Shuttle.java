import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
    private int manufactureYear;
    private double fuelCapacity;
    private int passengerCapacity;
    private int cargoCapacity;
    private int travelSpeed;

    /**
     * default constructor
     */
    public Shuttle()
    {
        shuttleId = 0;
        shuttleName = "";
        manufactureYear = 0;
        fuelCapacity = 0;
        passengerCapacity = 0;
        cargoCapacity = 0;
        travelSpeed = 0;
    }

    /**
     * non-default constructor
     */
    public Shuttle(int newShuttleId, String newShuttleName, int newManufactureYear, double newFuelCapacity, int newPassengerCapacity, int newCargoCapacity, int newTravelSpeed)
    {
        shuttleId = newShuttleId;
        shuttleName = newShuttleName;
        manufactureYear = newManufactureYear;
        fuelCapacity = newFuelCapacity;
        passengerCapacity = newPassengerCapacity;
        cargoCapacity = newCargoCapacity;
        travelSpeed = newTravelSpeed;
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

    public int getManufactureYear() {
        return manufactureYear;
    }

    public double getFuelCapacity() {
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

    /**
     * Mutator
     */
    public void setShuttleId(int shuttleId) {
        this.shuttleId = shuttleId;
    }

    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setFuelCapacity(double fuelCapacity) {
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
