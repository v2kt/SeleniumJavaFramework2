package utils;

public class excelUtilDemo {

	public static void main(String[] args) {
		
		String projectPath=System.getProperty("user.dir");
		
		ExcelUtils excel = new ExcelUtils(projectPath+"/excel/data.xlsx","sheet1");
		
		excel.getRowCount();
		excel.getColCount();
		excel.getCellDataString(0,0);
		ExcelUtils.getCellDataNumber(1,1);
		
		

	}

}
