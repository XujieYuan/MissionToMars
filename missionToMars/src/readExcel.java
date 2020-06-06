import java.io.*;
import java.util.ArrayList;

public class readExcel {

    public ArrayList<String> readCsvFile(String fileName) {
        ArrayList<String> content = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            reader.readLine();
            String line = null;
            //ArrayList<String> content = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String[] item = line.split("，");
                String last = item[item.length - 1];
                content.add(last);
                //int value = Integer.parseInt(last);
                //System.out.println(last);
            }
            //System.out.println(content);
            //System.out.println("There are " + content.size() + " lines");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }


    public void writeCSV(String fileName, String content) {
        try {
            File csv = new File(fileName);
            BufferedWriter bw = new BufferedWriter(new FileWriter(csv,true));
            bw.write(content);
            //bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


