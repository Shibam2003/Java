//use of super keyword 
class A//parent class
{
int a=10;
}
class B extends A//inheriting a parent class
{
int a=20;
void disp()
{
int c=a+super.a;
float avg=c/2;
System.out.println("sum is:"+c);
System.out.println("Average is:"+avg);
}
}
class over3
{
public static void main(String a[])
{
B ob = new B();
ob.disp();
}
}                   