package testcases;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		System.out.println(8/0);

	}catch(ArithmeticException e)
		{
		System.out.println(e.toString());
		}

}}
