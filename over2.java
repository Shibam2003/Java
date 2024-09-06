//trying out super.super:)
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
class C extends B{
int a=20;
void disp1()
{
System.out.println(a);
System.out.println(super.super.a);
}
}
class over2
{
public static void main(String a[])
{
B ob = new B();
ob.disp();
C ob1=new C();
ob1.disp1();
}
}                                                       