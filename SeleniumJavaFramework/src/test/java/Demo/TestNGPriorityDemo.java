package Demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	public static void main(String[] args) {
		one();
		two();
		three();
	}
	@Test()
	public static void one(){
		
		System.out.println("i am inside test 1" );
		
	}
	@Test()
	public static void two() {
		
		System.out.println("i am inside test 2" );
	}
	@Test()
	public static void three() {
		
		System.out.println("i am inside test 3" );
	}

}
