import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MissionToMarsSystemForAdmin {

    public void chooseAction() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hi Administrator, what you want to do?");
            System.out.println("Press 1 to edit missions");
            System.out.println("Press 2 to select a shuttle");
            System.out.println("Press 3 to create criteria");
            System.out.println("Press 4 to select best 'N' candidates");
            System.out.println("Press 5 to confirm mission is ready");
            System.out.println("Press 6 to log out");
            try {
                String choice = scan.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("*********************");
                        System.out.println("* This is feature 1 *");
                        System.out.println("*********************");
                        //editMission()
                        break;
                    case "2":
                        System.out.println("*********************");
                        System.out.println("* This is feature 2 *");
                        System.out.println("*********************");
                        selectShuttle();
                        break;
                    case "3":
                        System.out.println("Feature 3 is not included");
                        break;
                    case "4":
                        System.out.println("*********************");
                        System.out.println("* This is feature 4 *");
                        System.out.println("*********************");
                        //findBestNCandidates()
                        break;
                    case "5":
                        System.out.println("Feature 5 is not included");
                        break;
                    case "6":
                        System.out.println("**************************");
                        System.out.println("* Log out to main window *");
                        System.out.println("**************************");
                        LoginToMissionToMars loginToMissionToMars = new LoginToMissionToMars();
                        loginToMissionToMars.startProgram();
                        break;
                    default:
                        System.out.println("Invalid choice, please select again");
                        //scanner.nextLine();
                        continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                //scanner.nextLine();
                continue;
            }
        }
    }

    public Shuttle selectShuttle() throws ParseException {
        UserInterfaceForAdmin uiA = new UserInterfaceForAdmin();
        Shuttle st = new Shuttle();
        ArrayList<Shuttle> sts = uiA.displayShuttleInfo();
        ArrayList<Integer> stids = new ArrayList<>();
        for (Shuttle value : sts) {
            stids.add(value.getShuttleId());
            //System.out.println(stid);
        }
        //int choice = 0;
        System.out.println("*******************************************************");
        System.out.println("Please enter an ID to select a shuttle for the mission!");
        System.out.println("*******************************************************");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (stids.contains(choice)) {
                    for (Shuttle shuttle : sts) {
                        if (choice == shuttle.getShuttleId()) {
                            System.out.println("You have selected shuttle " + shuttle.getShuttleId() + '\n' + "Shuttle Name is " + shuttle.getShuttleName() + '\n');
                            st = shuttle;
                        }
                    }
                } else {
                    System.out.println("Not find the ID, please select again");
                    //scanner.next();
                    continue;
                }
                break;
            } else {
                System.out.println("********************************************");
                System.out.println("You must input a number! Please enter again!");
                System.out.println("********************************************");
                scanner.next();
            }
        }
        return st;
    }
}
