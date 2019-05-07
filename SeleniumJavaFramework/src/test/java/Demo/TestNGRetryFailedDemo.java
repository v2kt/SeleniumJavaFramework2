package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	@Test
	public static void test1() {

		System.out.println("I am inside test1...");
	}
	@Test
	public static void test2() {

		System.out.println("I am inside test2...");
		int i=1/0;
	}
	@Test
	public static void test3() {

		System.out.println("I am inside test3...");
		Assert.assertTrue(0>1);
	}

}
