package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_script_to_fetch_data_from_excel
{
public static String ddt(String Sheet, int Row,int Cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fil = new FileInputStream("./excel/Book1.xlsx");
	Workbook book = WorkbookFactory.create(fil);
	Sheet sheet = book.getSheet(Sheet);
	Row row = sheet.getRow(Row);
	Cell cell = row.getCell(Cell);
	String value = cell.toString();
	return value;
}
}
