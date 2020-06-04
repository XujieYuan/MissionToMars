import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UserInterfaceForAdmin {

    public ArrayList<Shuttle> displayShuttleInfo() throws ParseException {
        //Shuttle st = new Shuttle();
        int shuttleNumber = 0;
        int shuttleId = 0;
        String shuttleName = "";
        //String manufactureYear = "";
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date manufactureYear = null;
        String mYear = "";
        int fuelCapacity = 0;
        int passengerCapacity = 0;
        int cargoCapacity = 0;
        int travelSpeed = 0;
        String origin = "";
        readExcel excel = new readExcel();
        ArrayList<Shuttle> shuttles = new ArrayList<>();
        for (int i = 0; i <= excel.readCsvFile("shuttle.csv").size() - 1; i++) {
            Shuttle st = new Shuttle();
            shuttleId = Integer.parseInt(excel.readCsvFile("shuttle.csv").get(i).split(",")[0]);
            shuttleName = excel.readCsvFile("shuttle.csv").get(i).split(",")[1];
            mYear = excel.readCsvFile("shuttle.csv").get(i).split(",")[2];
            manufactureYear = format.parse(mYear);
            fuelCapacity = Integer.parseInt(excel.readCsvFile("shuttle.csv").get(i).split(",")[3]);
            passengerCapacity = Integer.parseInt(excel.readCsvFile("shuttle.csv").get(i).split(",")[4]);
            cargoCapacity = Integer.parseInt(excel.readCsvFile("shuttle.csv").get(i).split(",")[5]);
            travelSpeed = Integer.parseInt(excel.readCsvFile("shuttle.csv").get(i).split(",")[6]);
            origin = excel.readCsvFile("shuttle.csv").get(i).split(",")[7];
            //set shuttle
            st.setShuttleId(shuttleId);
            st.setShuttleName(shuttleName);
            st.setManufactureYear(manufactureYear);
            st.setFuelCapacity(fuelCapacity);
            st.setPassengerCapacity(passengerCapacity);
            st.setCargoCapacity(cargoCapacity);
            st.setTravelSpeed(travelSpeed);
            st.setOrigin(origin);
            shuttles.add(st);
            System.out.println("============================================================");
            System.out.println("Shuttle ID is " + shuttleId);
            System.out.println("Shuttle Name is " + shuttleName);
            System.out.println("Manufacturing Year is " + manufactureYear);
            System.out.println("Fuel Capacity is " + fuelCapacity + " litres");
            System.out.println("Passenger Capacity is " + passengerCapacity);
            System.out.println("Cargo Capacity is " + cargoCapacity + " kgs");
            System.out.println("Travel Speed is " + travelSpeed + " kms/hr");
            System.out.println("Origin is " + origin);
            System.out.println();
        }
        return shuttles;
    }

    /**
     public void displayShuttleInfo()
     {
     Shuttle st = new Shuttle();
     int shuttleNumber = st.countLines();
     int shuttleId = 0;
     String shuttleName = "";
     int manufactureYear = 0;
     double fuelCapacity = 0;
     int passengerCapacity = 0;
     int cargoCapacity = 0;
     int travelSpeed = 0;
     for (int i = 0; i <= shuttleNumber - 1; i++)
     {
     shuttleId = Integer.parseInt(st.readFileByLines().get(i).split(",")[0]);
     shuttleName = st.readFileByLines().get(i).split(",")[1];
     manufactureYear = Integer.parseInt(st.readFileByLines().get(i).split(",")[2]);
     fuelCapacity = Double.parseDouble(st.readFileByLines().get(i).split(",")[3]);
     passengerCapacity = Integer.parseInt(st.readFileByLines().get(i).split(",")[4]);
     cargoCapacity = Integer.parseInt(st.readFileByLines().get(i).split(",")[5]);
     travelSpeed = Integer.parseInt(st.readFileByLines().get(i).split(",")[6]);
     System.out.println("============================================================");
     System.out.println("Shuttle ID is " + shuttleId);
     System.out.println("Shuttle Name is " + shuttleName);
     System.out.println("Manufacturing Year is " + manufactureYear);
     System.out.println("Fuel Capacity is " + fuelCapacity + " million pounds");
     System.out.println("Passenger Capacity is " + passengerCapacity);
     System.out.println("Cargo Capacity is " + cargoCapacity + " kg");
     System.out.println("Travel Speed is " + travelSpeed + " kilometers per hour");
     System.out.println();
     }
     }
     */

}
