class A//parent class
{
int a=15,b=30;
void display(){
int c=a+b;
System.out.println("The sum is "+c);
}
}
class B extends A//inheriting a parent class
{
void display()
{
super.display();//calling the method display from parent class
int d=a*b;
System.out.println("The product is "+d);
}
}
class m_over
{
public static void main(String a[])
{
B ob = new B();
ob.display();
}
}