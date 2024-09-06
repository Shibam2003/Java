//WAP to display use of inner class(non static)
class Outer
{
int a=10;
static int c=9;
void disp1()
{
System.out.println(a);
Inner ob=new Inner();
ob.disp2();
}
class Inner
{
int b=20;
void disp2()
{
System.out.println(b);
System.out.println(a);
System.out.println(c);
}
}
}
class Nestedclass
{
public static void main(String args[])
{
Outer ob = new Outer();
ob.disp1();
}
}