//program to  display use of static nested class
class Outer
{
static int a=10;
int c=30;
void disp1()
{

Inner ob=new Inner();
ob.disp2();
}
static class Inner
{
int b=20;
void disp2()
{
System.out.println(b);
System.out.println(a);
Outer ob2=new Outer();
System.out.println(ob2.c);
}
}
}
class Nestedclass3
{
public static void main(String args[])
{
Outer ob=new Outer();
ob.disp1();
//Outer.disp1();

}
}