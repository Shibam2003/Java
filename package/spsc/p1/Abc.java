package p1;//declaring the name of the package which contains the Abc.java file
public class Abc
{
	int a = 10;//this variable has default access specifier or package access specifier
	private int b = 20;
	protected int c = 30;
	public int d = 40;
	public void display(){
	System.out.println("value of a is "+a);
	System.out.println("value of b is "+b);
	System.out.println("value of c is "+c);
	System.out.println("value of d is "+d);
	}
}