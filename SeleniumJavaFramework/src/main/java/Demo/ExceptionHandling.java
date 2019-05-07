package Demo;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void demo() throws Exception{

		//try 
		{

			System.out.println("Hello World...!");
			throw new ArithmeticException("This operation is not valid...");
			//int i= 1/0;
			//System.out.println("Completed...");

		}

		/*catch(Exception exp){

			System.out.println("i am inside the catch block");
			System.out.println("Message is :"+exp.getMessage());
			System.out.println("Message is :"+exp.getCause());
			System.out.println("Message is :"+exp.getStackTrace());

		}*/

		/*finally {

			System.out.println("I am inside finally block...");


		}*/

	}
	
}
