import java.util.Scanner;

public class CoordinatorControl {

    public void chooseAction() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hi Coordinator, what you want to do?");
            System.out.println("Press 1 to create a mission");
            System.out.println("Press 2 to edit missions");
            System.out.println("Press 3 to log out");
            try {
                String choice = scan.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("*********************");
                        System.out.println("* This is feature 1 *");
                        System.out.println("*********************");
                        //createMission();
                        break;
                    case "2":
                        System.out.println("Please select the mission you want to edit");
                        //editMission
                        break;
                    case "3":
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

    //public void createMission(){}

}
