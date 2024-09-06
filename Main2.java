class Hello
{
	int a,r;//instance variable
	void input()
	{
		a=21;
	}
	void check()
	{
		r=a%2;
	}
	void disp()
	{
		if(r==0){
		System.out.println(a+" is a even no.");
		}
		else{
		System.out.println(a+" is a odd no.");
		}
	}
}
class Main2
{
	public static void main(String args[])
	{	
		Hello ob=new Hello();
		ob.input();
		ob.check();
		ob.disp();
	}
}