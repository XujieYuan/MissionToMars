import java.io.IOException;
import java.util.Scanner;

public class MissionToMarsSystemForAdmin {

    /**
    public Shuttle selectShuttle1() {
        UserInterfaceForAdmin uiA = new UserInterfaceForAdmin();
        Shuttle st = new Shuttle();
        uiA.displayShuttleInfo();
        System.out.println("*******************************************************");
        System.out.println("Please enter an ID to select a shuttle for the mission!");
        System.out.println("*******************************************************");
        System.out.println();
        Scanner console = new Scanner(System.in);
        try {
            int choice = console.nextInt();
            st.setShuttleId(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[0]));
            st.setShuttleName(st.readFileByLines().get(choice - 1).split(",")[1]);
            st.setManufactureYear(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[2]));
            st.setFuelCapacity(Double.parseDouble(st.readFileByLines().get(choice - 1).split(",")[3]));
            st.setPassengerCapacity(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[4]));
            st.setCargoCapacity(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[5]));
            st.setTravelSpeed(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[6]));
        } catch (Exception e) {
            System.out.println("********************************************");
            System.out.println("You must input a number! Please enter again!");
            System.out.println("********************************************");
            System.out.println();
            selectShuttle();
        }
        System.out.println("You have selected shuttle " + st.getShuttleId() + '\n' + "Shuttle Name is " + st.getShuttleName());
        return st;
    }
     */

    public Shuttle selectShuttle() {
        UserInterfaceForAdmin uiA = new UserInterfaceForAdmin();
        Shuttle st = new Shuttle();
        int choice = 0;
        uiA.displayShuttleInfo();
        System.out.println("*******************************************************");
        System.out.println("Please enter an ID to select a shuttle for the mission!");
        System.out.println("*******************************************************");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                st.setShuttleId(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[0]));
                st.setShuttleName(st.readFileByLines().get(choice - 1).split(",")[1]);
                st.setManufactureYear(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[2]));
                st.setFuelCapacity(Double.parseDouble(st.readFileByLines().get(choice - 1).split(",")[3]));
                st.setPassengerCapacity(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[4]));
                st.setCargoCapacity(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[5]));
                st.setTravelSpeed(Integer.parseInt(st.readFileByLines().get(choice - 1).split(",")[6]));
                break;
            } else {
                System.out.println("********************************************");
                System.out.println("You must input a number! Please enter again!");
                System.out.println("********************************************");
                System.out.println();
                scanner.next();
            }
        }
        System.out.println("You have selected shuttle " + st.getShuttleId() + '\n' + "Shuttle Name is " + st.getShuttleName());
        return st;
    }
}
