package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	public static void main(String[] args) {
		test(null);
	}
	@Test
	@Parameters({"MyName"})
	public static void test(@Optional String name) {
		
		System.out.println("My Name Is:"+name);
	}

}
