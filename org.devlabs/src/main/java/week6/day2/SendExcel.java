package week6.day2;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SendExcel {

		public static String[][] main(String Ebook) throws IOException {
			// TODO Auto-generated method stub
			
			
			//String Ebook = "New Default Notifications.xlsx";
			
			XSSFWorkbook EXbook = new XSSFWorkbook("./test-data/"+Ebook);
			
			int sheetNum = EXbook.getNumberOfSheets();
			

			System.out.println("No of sheets" +sheetNum);
			String givename[][] = new String[0][0];

			for(int i=1; i<sheetNum; i++)
			{
				System.out.println(i);
				XSSFSheet Sheets = EXbook.getSheetAt(i);
				
				int rows = Sheets.getPhysicalNumberOfRows();
				
				System.out.println("rows: " +rows);
				int cols = Sheets.getRow(0).getLastCellNum();
				
				System.out.println("cols: " +cols);
				
				givename = new String[rows][cols];
				
				
				for (int j=0; j<=rows; j++)
				{
					XSSFRow CurrRow = Sheets.getRow(j);
					for (int k=0; k<cols; k++)
					{
						XSSFCell cell = CurrRow.getCell(k);
						DataFormatter format = new DataFormatter();
						String formattedCellValue = format.formatCellValue(cell);
						System.out.println(formattedCellValue);
						givename[j][k] = formattedCellValue;
						
					}

				}
				
				
			}
			EXbook.close();
			return givename;
			
			
			}
}





