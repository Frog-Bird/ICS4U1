import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class project02 {
    public static void main(String[] args) throws IOException {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("C:/Users/aavin/Desktop/ICS4U1/Arrays01/src/test.xlsx"));
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            sheet.getRow(1).getCell(1).setCellValue(8);
            FileOutputStream outputStream = new FileOutputStream("test2.xlsx");
            workbook.write(outputStream);
            workbook.close();
        } catch (NoClassDefFoundError e){
            e.printStackTrace();
        }
    }
}