import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class e {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("C:/Users/aavin/Desktop/a/Template for code project.xlsx"));
        XSSFSheet sheet = null;
        int month;
        int productNumber;
        String profit;
        String[] b;
        File file = new File("C:/Users/aavin/Desktop/a/Project02Data.txt");
        Scanner scanner = new Scanner(file);

        month = 0;
        productNumber = 0;
        profit = "0";

        while (scanner.hasNextLine()) {
            b = scanner.nextLine().split(",");
            if (b.length > 2) {
                sheet = workbook.getSheetAt(sheetName(b[0]));
                month = month(b[1]);
                productNumber = productNumber(b[2]);
                profit = b[3];
            }
            double temp;
            assert sheet != null;
            String cellContents;
            try {
                cellContents = sheet.getRow(productNumber).getCell(month).getRawValue();
            } catch (NullPointerException e) {
                cellContents = "0";
            }
            try {
                temp = Double.parseDouble(profit) + Double.parseDouble(cellContents);
                temp = Math.round(temp * 100);
                temp = temp / 100;
            } catch (NullPointerException e) {
                temp = Double.parseDouble(b[3]);
            }

            try {
                sheet.getRow(productNumber).getCell(month).setCellValue(temp);
            } catch (NullPointerException e) {
                System.out.println("Finished");
            }
        }
        workbook.write(new FileOutputStream("C:/Users/aavin/Desktop/a/output.xlsx"));
        workbook.close();
    }

    private static int sheetName(String x){
        String[] a = {"101", "102", "103", "201", "202", "301", "302", "303", "304", "305", "401", "402", "403", "404", "405"};
        int b = 0;
        for (int i = 0; i < a.length; i++) {if (x.equals(a[i])){b = i;}}
        return b;
    }
    private static int month(String x){
        int pOne = Integer.parseInt(String.valueOf(x.charAt(4))) * 10;
        int pTwo = Integer.parseInt(String.valueOf(x.charAt(5)));
        return pOne + pTwo;
    }
    private static int productNumber(String x) {
        String[] a = {"0", "1", "2", "PR121", "PR122", "PR123", "PR124", "PR231", "PR331", "PR441", "PR511", "PR512", "PR513", "PR661", "PR701", "PR811"};
        int b = 0;
        for (int i = 0; i < a.length; i++) {if (x.equals(a[i])){b = i;}}
        return b;
    }
}
