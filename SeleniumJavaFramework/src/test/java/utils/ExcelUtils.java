package utils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook  workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName){

		try {



			workbook = new XSSFWorkbook(excelPath);

			sheet = workbook.getSheet(sheetName);//create reference for sheet
		}catch(Exception e) {


			e.printStackTrace();
		}


	}

	public static void main(String args[]) {
		getRowCount();
		getColCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public static int getRowCount() {
		int rowCount = 0;

		try {

			rowCount=sheet.getPhysicalNumberOfRows();	

			System.out.println("Row Count is equal to no of rows="+rowCount);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();

		}

		return rowCount;
	}



	public static int getColCount() {
		int colCount = 0;
		try {

			colCount=sheet.getRow(0).getPhysicalNumberOfCells();	

			System.out.println("Column Count is equal to no of Col="+colCount);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();

		}
		return colCount;
	}



	public static String getCellDataString(int rowNum, int colNum) {

		String cellData=null;
		try {


			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

			System.out.println(cellData);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();

		}
		return cellData;
	}

	public static void getCellDataNumber(int rowNum, int colNum ) {

		try {


			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

			System.out.println(cellData);

		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();

		}
	}

}
