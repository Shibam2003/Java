class A
{
int x=2;
}
class B extends A//B is the child class of A
{
int b=3;
}
class C extends B//C is the grand child of A
{
void display()
{
int c=1;
for(int i=0;i<b;i++){
c=c*x;
}
System.out.println("The value is="+c);

}
}
class Multi_inherit2
{
public static void main(String args[])
{
C ob = new C();//creating object of class C to call all values of function & variables from both (A&B)
ob.display();
}
}