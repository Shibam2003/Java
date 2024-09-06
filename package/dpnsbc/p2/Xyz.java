package p2;
import p1.*;

public class Xyz{
	Abc obj = new Abc();
	public void display(){
		//System.out.println("Value of a is "+obj.a);//default can't be accessed because here pakage is different
		//System.out.println("Value of b is "+obj.b);//private can't be accessed
		//System.out.println("Value of c is "+obj.c);//protected can't be accessed
		System.out.println("Value of d is "+obj.d);
	
	}
}