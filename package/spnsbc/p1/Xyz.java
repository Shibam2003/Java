package p1;

public class Xyz{
	public void display(){
		Abc obj = new Abc();

		System.out.println("Value of a is "+obj.a);
		//System.out.println("Value of b is "+obj.b);//private can't be accessed
		System.out.println("Value of c is "+obj.c);
		System.out.println("Value of d is "+obj.d);
	}
}