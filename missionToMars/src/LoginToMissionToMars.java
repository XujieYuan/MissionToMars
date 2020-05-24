import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LoginToMissionToMars {

    private ArrayList<Integer> adminID;
    private ArrayList<Integer> candiID;

    public LoginToMissionToMars()
    {
        //adminID = new ArrayList<>();
        adminID = readAdminId();
        candiID = new ArrayList<>();
    }

    public LoginToMissionToMars(ArrayList<Integer> newAdminID, ArrayList<Integer> newCandiID)
    {
        adminID = newAdminID;
        candiID = newCandiID;
    }

    public ArrayList<Integer> getAdminID() {
        return adminID;
    }

    public ArrayList<Integer> getCandiID() {
        return candiID;
    }

    public void setAdminID(ArrayList<Integer> adminID) {
        this.adminID = adminID;
    }

    public void setCandiID(ArrayList<Integer> candiID) {
        this.candiID = candiID;
    }

    public void startProgram() {
        while (true) {
            System.out.println("********************************************");
            System.out.println("* Welcome to Mission to Mars!              *");
            System.out.println("* Please select from the following options *");
            System.out.println("* Press 1 to register an Administrator     *");
            System.out.println("* Press 2 for an Administrator to login    *");
            System.out.println("* Press 3 to register a Candidate          *");
            System.out.println("* Press 4 for a candidate to login         *");
            System.out.println("* Press 5 to do a test                     *");
            System.out.println("* Press 6 to exit                          *");
            System.out.println("********************************************");
            Scanner console = new Scanner(System.in);
            String option = console.nextLine();
            System.out.println();
            switch (option) {
                case "1":
                    registerAdmin();
                    break;
                case "2":
                    System.out.println("Please enter your administrator identifyNo");
                    System.out.println("Please enter your password");
                    break;
                case "3":
                    registerCandidate();
                    break;
                case "4":
                    System.out.println("Please enter your candidate identifyNo");
                    System.out.println("Please enter your password");
                    break;
                case "5":
                    test();
                    break;
                case "6":
                    System.out.println("*****Exit*****");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please choose again!");
                    break;
            }
        }
    }

    public int registerAdmin() {
        System.out.println(adminID);
        RandomNumber rng = new RandomNumber();
        int identifyNo = rng.getRandomNumber(99999, 11111);
        System.out.println("ID: " + identifyNo);
        while (adminID.contains(identifyNo)) {
            System.out.println("Repeat ID");
            identifyNo = rng.getRandomNumber(99999, 11111);
            System.out.println("New ID is " + identifyNo);
        }
        adminID.add(identifyNo);
        String fileName = "./src/administrator.txt";
        String content = "";
        ArrayList<String> admin = new ArrayList<>();
        admin.add(Integer.toString(identifyNo));
        admin.add(regAdminId());
        admin.add(regAdminName());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        admin.add(format.format(regAdminDOB()));
        admin.add(regAdminAddress());
        admin.add(regAdminGender());
        admin.add(regAdminEmail());
        admin.add(regAdminNationality());
        admin.add(regAdminPassword());
        content = StringUtils.join(admin, ",");
        appendMethod(fileName, content);
        appendMethod(fileName, "\n");
        System.out.println("Register success! As an administrator, Your identifyNo is " + identifyNo);
        System.out.println();
        return identifyNo;
    }

    public int registerCandidate() {
        RandomNumber rng = new RandomNumber();
        int identifyNo = rng.getRandomNumber(999999, 111111);
        System.out.println("Register success! As a candidate, Your identifyNo is " + identifyNo);
        System.out.println();
        return identifyNo;
    }

    public String regAdminId() {
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

    public String regAdminName() {
        String employeeName = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your userName");
        while (true) {
            try {
                employeeName = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
        }
        return employeeName;
    }

    public Date regAdminDOB() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        String dateOfBirth = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your date of birth");
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

    public String regAdminAddress() {
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

    public String regAdminGender() {
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

    public String regAdminEmail() {
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

    public String regAdminNationality() {
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

    public String regAdminPassword() {
        String password = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password");
        while (true) {
            try {
                password = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again:");
                scanner.nextLine();
            }
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

    public ArrayList<String> readFileByLines()
    {
        String fileName = "./src/administrator.txt";
        ArrayList<String> admins = new ArrayList<String>();
        try
        {
            FileReader fileReader = new FileReader(fileName);
            try
            {
                Scanner parser = new Scanner(fileReader);
                while (parser.hasNextLine())
                {
                    admins.add(parser.nextLine());
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
        return admins;
    }

    public int countLines()
    {
        String fileName = "./src/administrator.txt";
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

    public ArrayList<Integer> readAdminId()
    {
        int id = 0;
        ArrayList<Integer> file = new ArrayList<>();
        //System.out.println(readFileByLines());
        for(int i = 0; i <= countLines() - 1; i++){
            id = Integer.parseInt(readFileByLines().get(i).split(",")[0]);
            file.add(id);
        }
        //System.out.println(file);
        return file;
    }

    public void test()
    {

    }
}
