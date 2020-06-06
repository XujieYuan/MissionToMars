import java.io.*;
import java.util.ArrayList;

import jxl.*;
import jxl.read.biff.BiffException;

public class readExcel {


    public void test1() {
        try {
            jxl.Workbook wb = null;
            InputStream is = new FileInputStream("missionToMarsData.xls");
            wb = Workbook.getWorkbook(is);

            int sheetSize = wb.getNumberOfSheets();
            Sheet sheet = wb.getSheet(0);
            int row_total = sheet.getRows();
            for (int j = 0; j < row_total; j++) {
                if (j == 0) {
                    Cell[] cells = sheet.getRow(j);

                    System.out.println(cells[0].getContents());
                    System.out.println(cells[1].getContents());
                    //System.out.println(cells[2].getContents());
                }
            }
        } catch (IOException | BiffException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<String> readCsvFile(String fileName) {
        ArrayList<String> content = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));//换成你的文件名
            reader.readLine();//第一行信息，为标题信息，不用，如果需要，注释掉
            String line = null;
            //ArrayList<String> content = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String[] item = line.split("，");//CSV格式文件为逗号分隔符文件，这里根据逗号切分
                String last = item[item.length - 1];//这就是你要的数据了
                content.add(last);
                //int value = Integer.parseInt(last);//如果是数值，可以转化为数值
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


