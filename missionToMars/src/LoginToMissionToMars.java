import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Author: Xujie yuan
 * version: 1.0
 */

public class LoginToMissionToMars {

    /**
    private ArrayList<Integer> coordinatorID;
    private ArrayList<Integer> adminID;
    private ArrayList<Integer> candiID;
    private ArrayList<Administrator> admin;
    private ArrayList<Coordinator> coordinator;

    public LoginToMissionToMars() {
        //adminID = new ArrayList<>();
        //coordinatorID = new ArrayList<>();
        // candiID = new ArrayList<>();
        coordinatorID = readCoordinatorID();
        adminID = readAdminId();
        candiID = readCandiId();
        //admin = readAdmin();
        admin = new ArrayList<Administrator>();
        //coordinator = readCoordinator();
        coordinator = new ArrayList<Coordinator>();
    }

    public LoginToMissionToMars(ArrayList<Integer> newCoordinatorID, ArrayList<Integer> newAdminID, ArrayList<Integer> newCandiID, ArrayList<Administrator> newAdmin, ArrayList<Coordinator> newCoordinator) {
        coordinatorID = newCoordinatorID;
        adminID = newAdminID;
        candiID = newCandiID;
        admin = newAdmin;
        coordinator = newCoordinator;
    }

    public ArrayList<Integer> getCoordinatorID() {
        return coordinatorID;
    }

    public ArrayList<Integer> getAdminID() {
        return adminID;
    }

    public ArrayList<Integer> getCandiID() {
        return candiID;
    }

    public ArrayList<Administrator> getAdmin() {
        return admin;
    }

    public ArrayList<Coordinator> getCoordinator() {
        return coordinator;
    }

    public void setCoordinatorID(ArrayList<Integer> coordinatorID) {
        this.coordinatorID = coordinatorID;
    }

    public void setAdminID(ArrayList<Integer> adminID) {
        this.adminID = adminID;
    }

    public void setCandiID(ArrayList<Integer> candiID) {
        this.candiID = candiID;
    }

    public void setAdmin(ArrayList<Administrator> admin) {
        this.admin = admin;
    }

    public void setCoordinator(ArrayList<Coordinator> coordinator) {
        this.coordinator = coordinator;
    }
     */

    public void startProgram() {
        while (true) {
            System.out.println("********************************************");
            System.out.println("* Welcome to Mission to Mars!              *");
            System.out.println("* Please select from the following options *");
            System.out.println("* Press 1 to register an Coordinator       *");
            System.out.println("* Press 2 for a Coordinator to login       *");
            System.out.println("* Press 3 to register an Administrator     *");
            System.out.println("* Press 4 for an Administrator to login    *");
            System.out.println("* Press 5 to register a Candidate          *");
            System.out.println("* Press 6 for a candidate to login         *");
            System.out.println("* Press 7 to do a test                     *");
            System.out.println("* Press 8 to exit                          *");
            System.out.println("********************************************");
            Scanner console = new Scanner(System.in);
            String option = console.nextLine();
            System.out.println();
            switch (option) {
                case "1":
                    registerCoordinator();
                    break;
                case "2":
                    coordinatorLogin();
                    break;
                case "3":
                    registerAdmin();
                    break;
                case "4":
                    adminLogin();
                    break;
                case "5":
                    registerCandidate();
                    break;
                case "6":
                    System.out.println("Only feature 5 needs candidate login function but our team's tasks is feature 1,2,4,6, so that we did not cover this" + '\n');
                    break;
                case "7":
                    test();
                    break;
                case "8":
                    System.out.println("*****Exit*****");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please choose again!");
                    break;
            }
        }
    }

    public void registerCoordinator() {
        ArrayList<Integer> coordinatorID =readCoordinatorID();
        //System.out.println(coordinatorID);
        RandomNumber rng = new RandomNumber();
        int identifyNo = rng.getRandomNumber(5000, 4000);
        System.out.println("ID: " + identifyNo);
        while (coordinatorID.contains(identifyNo)) {
            System.out.println("Repeat ID");
            identifyNo = rng.getRandomNumber(5000, 4000);
            System.out.println("New ID is " + identifyNo);
        }
        coordinatorID.add(identifyNo);
        ArrayList<String> coordinator = new ArrayList<>();
        coordinator.add(Integer.toString(identifyNo));
        coordinator.add(regName());
        coordinator.add(regPassword());
        readExcel excel2 = new readExcel();
        String content = StringUtils.join(coordinator, ",");
        excel2.writeCSV("coordinator.csv", "\n" + content);
        System.out.println("Register success! As a COORDINATOR, Your identifyNo is " + identifyNo);
        System.out.println();
    }

    public void registerAdmin() {
        ArrayList<Integer> adminID = readAdminId();
        //System.out.println(adminID);
        RandomNumber rng = new RandomNumber();
        int identifyNo = rng.getRandomNumber(99, 1);
        System.out.println("ID: " + identifyNo);
        while (adminID.contains(identifyNo)) {
            System.out.println("Repeat ID");
            identifyNo = rng.getRandomNumber(99, 1);
            System.out.println("New ID is " + identifyNo);
        }
        adminID.add(identifyNo);
        String fileName = "./src/administrator.txt";
        String content = "";
        ArrayList<String> admin = new ArrayList<>();
        admin.add(Integer.toString(identifyNo));
        //admin.add(regId());
        admin.add(regName());
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        admin.add(format.format(regDOB()));
        admin.add(regAddress());
        admin.add(regGender());
        admin.add(regEmail());
        admin.add(regNationality());
        admin.add(regPassword());
        content = StringUtils.join(admin, ",");
        appendMethod(fileName, content);
        appendMethod(fileName, "\n");
        System.out.println("Register success! As an ADMINISTRATOR, Your identifyNo is " + identifyNo);
        System.out.println();
    }

    public void registerCandidate() {
        ArrayList<Integer> candiID = readCandiId();
        //System.out.println(candiID);
        RandomNumber rng = new RandomNumber();
        int identifyNo = rng.getRandomNumber(2999, 2000);
        System.out.println("ID: " + identifyNo);
        while (candiID.contains(identifyNo)) {
            System.out.println("Repeat ID");
            identifyNo = rng.getRandomNumber(2999, 2000);
            System.out.println("New ID is " + identifyNo);
        }
        candiID.add(identifyNo);
        ArrayList<String> candidate = new ArrayList<>();
        candidate.add(Integer.toString(identifyNo));
        candidate.add(regName());
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        candidate.add(format.format(regDOB()));
        candidate.add(regStreet());
        candidate.add(regCity());
        candidate.add(regPostcode());
        candidate.add(regNationality());
        candidate.add(regPhoneNo());
        candidate.add(regIDType());
        candidate.add(regGender());
        candidate.add(regAllergies());
        candidate.add(regPreferFood());
        candidate.add(regQualification());
        candidate.add(regExperienceYear());
        candidate.add(regOccupation());
        candidate.add(regComputerSkill());
        candidate.add(regLanguage());
        candidate.add(regPassword());
        readExcel excel = new readExcel();
        String content = StringUtils.join(candidate, ",");
        excel.writeCSV("candidate.csv", "\n" + content);
        System.out.println("Register success! As a CANDIDATE, Your identifyNo is " + identifyNo);
        System.out.println();
    }

    /**
    public String regId() {
        String employeeId = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your userID");
        while (true) {
            try {
                employeeId = Integer.toString(scanner.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return employeeId;
    }
     */

    public String regName() {
        String employeeName = "";
        Scanner console = new Scanner(System.in);
        while (!validateName(employeeName)) {
            System.out.println("Please enter your name");
            employeeName = console.nextLine();
        }
        /**
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter your name");
         while (true) {
         try {
         employeeName = scanner.nextLine();
         break;
         } catch (Exception e) {
         System.out.println("Invalid input, please enter again:");
         scanner.nextLine();
         }
         }
         */
        return employeeName;
    }

    public Date regDOB() {
        //DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = null;
        String dateOfBirth = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your date of birth (MM/dd/yyyy)");
        while (true) {
            try {
                dateOfBirth = scanner.nextLine();
                date = format.parse(dateOfBirth);
                System.out.println("dob: " + date);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
            }
        }
        //return dateOfBirth;
        return date;
    }

    public String regAddress() {
        String address = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your address");
        while (true) {
            try {
                address = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return address;
    }

    public String regStreet() {
        String street = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your address of street");
        while (true) {
            try {
                street = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return street;
    }

    public String regCity() {
        String city = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your address of city");
        while (true) {
            try {
                city = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return city;
    }

    public String regPostcode() {
        String postcode = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your postcode");
        while (true) {
            try {
                postcode = Integer.toString(scanner.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return postcode;
    }

    public String regGender() {
        String gender = "";
        String output = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender" + "\n" + "Press 'm' for 'male', press 'f' for 'female'");
        while (true) {
            try {
                gender = scanner.nextLine();
                if (gender.equals("m") || gender.equals("M")) {
                    output = "Male";
                } else if (gender.equals("f") || gender.equals("F")) {
                    output = "Female";
                } else {
                    output = "Unknown";
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return output;
    }

    public String regEmail() {
        String email = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your email");
        while (true) {
            try {
                email = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return email;
    }

    public String regNationality() {
        String nationality = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your nationality");
        while (true) {
            try {
                nationality = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return nationality;
    }

    public String regPhoneNo() {
        String phoneNo = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your phone number");
        while (true) {
            try {
                phoneNo = Integer.toString(scanner.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return phoneNo;
    }

    public String regIDType() {
        while (true) {
            String id = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select your identification type");
            System.out.println("Press 1 for PAN");
            System.out.println("Press 2 for SSN");
            System.out.println("Press 3 for ABN");
            System.out.println("Press 4 for ADHARR");
            System.out.println("Press 5 for TFN");
            try {
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        id = "PAN";
                        break;
                    case "2":
                        id = "SSN";
                        break;
                    case "3":
                        id = "ABN";
                        break;
                    case "4":
                        id = "ADHARR";
                        break;
                    case "5":
                        id = "TFN";
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
            return id;
        }
    }

    public String regAllergies() {
        while (true) {
            String allergies = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select your allergies");
            System.out.println("Press 1 for cereals");
            System.out.println("Press 2 for pork");
            System.out.println("Press 3 for peanuts");
            System.out.println("Press 4 for pasta");
            System.out.println("Press 5 for beef");
            System.out.println("Press 6 for any nuts");
            System.out.println("Press 7 for lactose");
            System.out.println("Press 8 for seafood");
            System.out.println("Press 9 for none");
            try {
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        allergies = "cereals";
                        break;
                    case "2":
                        allergies = "pork";
                        break;
                    case "3":
                        allergies = "peanuts";
                        break;
                    case "4":
                        allergies = "pasta";
                        break;
                    case "5":
                        allergies = "beef";
                        break;
                    case "6":
                        allergies = "any nuts";
                        break;
                    case "7":
                        allergies = "lactose";
                        break;
                    case "8":
                        allergies = "seafood";
                        break;
                    case "9":
                        allergies = "none";
                        break;
                    default:
                        System.out.println("Invalid choice, please select again");
                        //scanner.nextLine();
                        //regAllergies();
                        continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                //scanner.nextLine();
                continue;
            }
            return allergies;
        }
    }

    public String regPreferFood() {
        while (true) {
            String preferFood = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select your food preferences");
            System.out.println("Press 1 for vegan");
            System.out.println("Press 2 for kosher");
            System.out.println("Press 3 for halal");
            System.out.println("Press 4 for vegetarian");
            System.out.println("Press 5 for none");
            try {
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        preferFood = "vegan";
                        break;
                    case "2":
                        preferFood = "kosher";
                        break;
                    case "3":
                        preferFood = "halal";
                        break;
                    case "4":
                        preferFood = "vegetarian";
                        break;
                    case "5":
                        preferFood = "none";
                        break;
                    default:
                        System.out.println("Invalid choice, please select again");
                        //scanner.nextLine();
                        //regPreferFood();
                        continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                //scanner.nextLine();
                continue;
            }
            return preferFood;
        }
    }

    public String regQualification() {
        String qualification = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your qualification");
        while (true) {
            try {
                qualification = scanner.nextLine();
                if (qualification.equals("ME") || qualification.equals("MDS") || qualification.equals("MIT") || qualification.equals("BDS") || qualification.equals("MS") || qualification.equals("MBA") || qualification.equals("BE") || qualification.equals("MBBS")) {
                    break;
                } else {
                    System.out.println("Invalid input, please enter from 'ME', 'MDS', 'MIT', 'BDS', 'MS', 'MBA', 'BE', 'MBBS'");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return qualification;
    }

    public String regExperienceYear() {
        String experienceYear = "";
        String output = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your working experience year");
        while (true) {
            try {
                experienceYear = Integer.toString(scanner.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        output = experienceYear + "yr";
        return output;
    }

    public String regOccupation() {
        String occupation = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your occupation");
        while (true) {
            try {
                occupation = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return occupation;
    }

    public String regComputerSkill() {
        while (true) {
            String computerSkill = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select your computer skill level");
            System.out.println("Press 1 for expert");
            System.out.println("Press 2 for advanced");
            System.out.println("Press 3 for intermediate");
            System.out.println("Press 4 for novice");
            try {
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        computerSkill = "expert";
                        break;
                    case "2":
                        computerSkill = "advanced";
                        break;
                    case "3":
                        computerSkill = "intermediate";
                        break;
                    case "4":
                        computerSkill = "novice";
                        break;
                    default:
                        System.out.println("Invalid choice, please select again");
                        //scanner.nextLine();
                        //regComputerSkill();
                        continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                //scanner.nextLine();
                continue;
            }
            return computerSkill;
        }
    }

    public String regLanguage() {
        String language = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your language knows");
        while (true) {
            try {
                language = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return language;
    }

    public String regPassword() {
        String password = "";
        Scanner console = new Scanner(System.in);
        while (!validatePassword(password)) {
            System.out.println("Please enter your password");
            password = console.nextLine();
        }
        return password;
    }

    public void appendMethod(String fileName, String content) {
        try {
            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件,如果为 true，则将字节写入文件末尾处，而不是写入文件开始处
            FileWriter writer = new FileWriter(fileName, true);
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Unable to save to " + fileName);
        }
    }

    public ArrayList<String> readTxtFileByLines(String fileName) {
        //fileName = "./src/administrator.txt";
        ArrayList<String> admins = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(fileName);
            try {
                Scanner parser = new Scanner(fileReader);
                while (parser.hasNextLine()) {
                    admins.add(parser.nextLine());
                }
            } finally {
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " not found when reading file");
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Unexpected I/O error occured");
        }
        return admins;
    }

    public int countTxtLines(String fileName) {
        //String fileName = "./src/administrator.txt";
        int linesNumber = 0;
        try {
            FileReader fileReader = new FileReader(fileName);
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((bufferedReader.readLine()) != null) {
                    linesNumber++;
                }
            } finally {
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " not found when counting lines");
        } catch (IOException e) {
            System.out.println("Unexpected I/O error occured");
        }
        return linesNumber;
    }

    public ArrayList<Integer> readCoordinatorID() {
        int id1 = 0;
        readExcel excel = new readExcel();
        ArrayList<Integer> file = new ArrayList<>();
        //System.out.println(readFileByLines());
        for (int i = 0; i <= excel.readCsvFile("coordinator.csv").size() - 1; i++) {
            id1 = Integer.parseInt(excel.readCsvFile("coordinator.csv").get(i).split(",")[0]);
            file.add(id1);
        }
        //System.out.println(file);
        return file;
    }

    public ArrayList<Coordinator> readCoordinator() {
        int cid = 0;
        String password = "";
        readExcel excel = new readExcel();
        ArrayList<Coordinator> coordinators = new ArrayList<>();
        //System.out.println(readFileByLines());
        for (int i = 0; i <= excel.readCsvFile("coordinator.csv").size() - 1; i++) {
            Coordinator cd = new Coordinator();
            cid = Integer.parseInt(excel.readCsvFile("coordinator.csv").get(i).split(",")[0]);
            password = excel.readCsvFile("coordinator.csv").get(i).split(",")[2];
            cd.setId(cid);
            cd.setPassword(password);
            coordinators.add(cd);
        }
        //System.out.println(file);
        return coordinators;
    }

    public ArrayList<Integer> readAdminId() {
        int aid = 0;
        ArrayList<Integer> file = new ArrayList<>();
        //System.out.println(readFileByLines());
        for (int i = 0; i <= countTxtLines("./src/administrator.txt") - 1; i++) {
            aid = Integer.parseInt(readTxtFileByLines("./src/administrator.txt").get(i).split(",")[0]);
            file.add(aid);
        }
        //System.out.println(file);
        return file;
    }

    public ArrayList<Administrator> readAdmin() {
        int aid = 0;
        String password = "";
        ArrayList<Administrator> administrators = new ArrayList<>();
        //System.out.println(readFileByLines());
        for (int i = 0; i <= countTxtLines("./src/administrator.txt") - 1; i++) {
            Administrator ad = new Administrator();
            aid = Integer.parseInt(readTxtFileByLines("./src/administrator.txt").get(i).split(",")[0]);
            password = readTxtFileByLines("./src/administrator.txt").get(i).split(",")[7];
            ad.setId(aid);
            ad.setPassword(password);
            administrators.add(ad);
        }
        //System.out.println(file);
        return administrators;
    }

    public ArrayList<Integer> readCandiId() {
        int id2 = 0;
        readExcel excel = new readExcel();
        ArrayList<Integer> file = new ArrayList<>();
        for (int i = 0; i <= excel.readCsvFile("candidate.csv").size() - 1; i++) {
            id2 = Integer.parseInt(excel.readCsvFile("candidate.csv").get(i).split(",")[0]);
            file.add(id2);
        }
        return file;
    }

    public boolean validateName(String name) {
        if (name.trim().length() >= 30 || name.trim().length() == 0)
            return false;
        else {
            for (int i = 0; i < name.trim().length(); i++) {
                if (name.toUpperCase().charAt(i) > 'Z' || name.toUpperCase().charAt(i) < 'A')
                    return false;
            }
        }
        return true;
    }

    public boolean validatePassword(String password) {
        return password.trim().length() < 30 && password.trim().length() != 0;

    }

    public void adminLogin() {
        MissionToMarsSystemForAdmin adminControl = new MissionToMarsSystemForAdmin();
        //System.out.println(adminID);
        int id = 0;
        String password = "";
        System.out.println("*********************");
        System.out.println("Please enter your ID!");
        System.out.println("*********************");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                break;
            } else {
                System.out.println("********************************************");
                System.out.println("You must input a number! Please enter again!");
                System.out.println("********************************************");
                scanner.next();
            }
        }
        System.out.println("***************************");
        System.out.println("Please enter your password!");
        System.out.println("***************************");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            if (scan.hasNextLine()) {
                password = scan.nextLine();
                break;
            } else {
                System.out.println("**********************************");
                System.out.println("Invalid input! Please enter again!");
                System.out.println("**********************************");
                scanner.next();
            }
        }
        if (checkAdminLogin(id, password))
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("+ login success, welcome~ +");
            System.out.println("+++++++++++++++++++++++++++" + '\n');
            adminControl.chooseAction();
        }
        else
        {
            System.out.println("ID or password error, cannot login. Please try again!");
        }
    }

    public void coordinatorLogin() {
        CoordinatorControl cc = new CoordinatorControl();
        //System.out.println(coordinatorID);
        int id = 0;
        String password = "";
        System.out.println("*********************");
        System.out.println("Please enter your ID!");
        System.out.println("*********************");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                break;
            } else {
                System.out.println("********************************************");
                System.out.println("You must input a number! Please enter again!");
                System.out.println("********************************************");
                scanner.next();
            }
        }
        System.out.println("***************************");
        System.out.println("Please enter your password!");
        System.out.println("***************************");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            if (scan.hasNextLine()) {
                password = scan.nextLine();
                break;
            } else {
                System.out.println("**********************************");
                System.out.println("Invalid input! Please enter again!");
                System.out.println("**********************************");
                scanner.next();
            }
        }
        if (checkCoordinatorLogin(id, password))
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("+ login success, welcome~ +");
            System.out.println("+++++++++++++++++++++++++++" + '\n');
            cc.chooseAction();
        }
        else
        {
            System.out.println("ID or password error, cannot login. Please try again!");
        }
    }

    public boolean checkAdminLogin(int id, String password) {
        ArrayList<Administrator> admin = readAdmin();
        //admin = readAdmin();
        boolean login = false;
        for (int b = 0; b < admin.size(); b++) {
            //System.out.println("id1: " + admin.get(b).getId());
            //System.out.println("id2: " + id);
            //System.out.println("password1: " + admin.get(b).getPassword());
            //System.out.println("password2: " + password);
            if ((admin.get(b).getId() == id) && admin.get(b).getPassword().equals(password)) {
                login = true;
            }
        }
        return login;
    }

    public boolean checkCoordinatorLogin(int id, String password) {
        ArrayList<Coordinator> coordinator = readCoordinator();
        //coordinator = readCoordinator();
        boolean login = false;
        for (int b = 0; b < coordinator.size(); b++) {
            //System.out.println("id1: " + coordinator.get(b).getId());
            //System.out.println("id2: " + id);
            //System.out.println("password1: " + coordinator.get(b).getPassword());
            //System.out.println("password2: " + password);
            if ((coordinator.get(b).getId() == id) && coordinator.get(b).getPassword().equals(password)) {
                login = true;
            }
        }
        return login;
    }

    public void test() {
        System.out.println("This is a method for test");
    }
}
