package Configue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static String projectPath =System.getProperty("user.dir");
	static Properties prop = new Properties();

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}
	public static void getProperties() {


		try {

			InputStream input = new FileInputStream(projectPath+"\\src\\test\\java\\Configue\\confige.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);


		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void setProperties() {
		
		try {
			OutputStream output = new FileOutputStream(projectPath+"\\src\\test\\java\\Configue\\confige.properties");
			prop.setProperty("bowser","chrome");
			prop.store(output, null);
			
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
}
