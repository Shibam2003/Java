package p1;

public class Xyz extends Abc{
	public void display(){

		System.out.println("Value of a is "+a);
		//System.out.println("Value of b is "+b);//here b is not accessable because a private variable is not inherited to the child class
		System.out.println("Value of c is "+c);
		System.out.println("Value of d is "+d);
	
	}
}