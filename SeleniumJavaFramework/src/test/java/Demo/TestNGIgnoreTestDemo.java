package Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class TestNGIgnoreTestDemo {
	
	@Test
	public void Test1() {

		System.out.println("I am inside test1");
	}
	@Test
	public void Test2() {

		System.out.println("I am inside test2");
	}
}
