package Data;

import com.sun.media.sound.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderInitializaiton {
    static Sheet sheet;
    static Workbook book;

    public static String Test_Data_Path = "/Users/selenium/IdeaProjects/DataProviderWithGoogleTest/src/main/java/Utilities/GoogleSearchData.xlsx";

    public static Object [][] getTestData(String sheetName){
        FileInputStream file = null;
        try {
            file = new FileInputStream(Test_Data_Path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int o = 0; o < sheet.getRow(0).getLastCellNum(); o++){
                data [i][o] = sheet.getRow(i + 1).getCell(o).toString();
            }
        }
        return data;

    }
}
