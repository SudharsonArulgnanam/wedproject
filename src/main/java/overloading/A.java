package overloading;

public  class A {
	
	int add(int a, int b)
	{
		
		return(a+b);
	}
    
	double add(double a,double b, double c)
	{
		return(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj= new A();
		
		System.out.println(obj.add(1,7));
		System.out.println(obj.add(5,30000.56666,6.7));
		System.out.println("sudharsom");
		System.out.println("Muthu");

		
		
		System.out.println("arun");
	}
		
		

	}


