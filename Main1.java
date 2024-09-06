class Hello
{
	int a,b,c;//instance variable
	void input()
	{
		a=10;
		b=20;
	}
	void add()
	{
		c=a+b;
	}
	void disp()
	{
		System.out.println("The result is "+c);
	}
}
class Main1
{
	public static void main(String args[])
	{	
		Hello ob=new Hello();
		ob.input();
		ob.add();
		ob.disp();
	}
}