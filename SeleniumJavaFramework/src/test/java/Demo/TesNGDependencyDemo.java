//How to add dependencies

package Demo;

import org.testng.annotations.Test;

public class TesNGDependencyDemo {
	
	@Test(dependsOnMethods= {"test2","test3"})
	public void test1() {

		System.out.println("i am inside test1...");
	}
	@Test
	public void test2() {

		System.out.println("i am inside test2...");
	}
	@Test(priority=2)
	public void test3() {

		System.out.println("i am inside test3...");
	}

}
