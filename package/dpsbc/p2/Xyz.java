package p2;
import p1.*;

public class Xyz extends Abc{
	public void display(){
		//System.out.println("Value of a is "+a);//default can't be accessed because here pakage is different
		//System.out.println("Value of b is "+b);//private can't be accessed
		System.out.println("Value of c is "+c);
		System.out.println("Value of d is "+d);
	
	}
}