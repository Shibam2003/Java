 class A//parent class
{
int a=10;
}
class B extends A//inheriting a parent class
{
int a=20;
void disp()
{
System.out.println(a);
System.out.println(super.a);
}
}
class over
{
public static void main(String a[])
{
B ob = new B();
ob.disp();
}
}                                                       