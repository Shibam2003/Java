class Hello
{
	int x,y,r;//instance variable
	void input()
	{
		x=4;
		y=2;
		r=1;
	}
	void cal()
	{
		while(y!=0){
		r=r*x;
		y--;
		}
	}
	void disp()
	{
		System.out.println("The result is "+r);
	}
}
class Main3
{
	public static void main(String args[])
	{	
		Hello ob=new Hello();
		ob.input();
		ob.cal();
		ob.disp();
	}
}