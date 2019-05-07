package Demo;

import org.testng.annotations.Test;

@Test(groups= {"AllClassTest"})
public class TestNGGroupsDemo {
	
	
	@Test(groups={"sanity"})
	public void test1(){

		System.out.println("This is Test1...");

	}
	@Test(groups={"windows.regression"})
	public void test2(){

		System.out.println("This is Test2...");

	}
	@Test(groups={"linux.regression"}) 
	public void test3(){

		System.out.println("This is Test3...");

	}
	@Test
	public void test4(){

		System.out.println("This is Test4...");

	}

}

