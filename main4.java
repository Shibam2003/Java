class Hello
{
	int x,i,count;//instance variable
	void input()
	{
		x=3;
		count=0;
	}
	void check()
	{
		for(i=2;i<x;i++){
			if(x%i==0){
				count=1;
				break;
			}
		}
	}
	void disp()
	{
		if(count==1){
		System.out.println(x+" is not a prime no.");
		}
		else{
		System.out.println(x+" is  a prime no.");
		}
	}
}
class Main4
{
	public static void main(String args[])
	{	
		Hello ob=new Hello();
		ob.input();
		ob.check();
		ob.disp();
	}
}