package Demo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j_Demo {
	
	private static Logger logger = LogManager.getLogger(log4j_Demo.class);

	public static void main(String[] args) {
		
		System.out.println("Hello Varsha....\n");
		
		logger.trace("This is trace message");
		
		logger.info("This is an information message");

		logger.error("This is an Error message");
		
		logger.fatal("This is fatal message");
		
		logger.warn("This is warn message");
		
		System.out.println("\n completed"); 
		
		}

}
