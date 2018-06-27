package overriding;

public class B extends A {
	
	

    public int add()
    {
    	 int b=50,c=50;
    	int a=b+c;
        return(a);
    }
    public static void main(String args[])
    {
    	A obj = new B();
    	int add = obj.add();
    	System.out.println(add);
    }
}
