class A
{
int a=50;
}
class B extends A//B is the child class of A
{
int b=a*a;
}
class C extends B//C is the grand child of A
{
void display()
{
System.out.println("The value of a="+a);
System.out.println("The value of b="+b);
}
}
class Multi_inherit
{
public static void main(String args[])
{
C ob = new C();//creating object of class C to call all values of function & variables from both (A&B)
ob.display();
}
}