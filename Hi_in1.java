class A
{
int x,y;
A(){
 x=2;
y=3;
}
}
class B extends A
{
int c;

void disp1(){
c=x+y;
System.out.println("Addition result is "+c);
}
}
class C extends A
{int c;

void disp2(){
c=x*y;
System.out.println("Multiplication result is "+c);
}
}
class Hi_in1
{
public static void main(String args[])
{
B ob = new B();
ob.disp1();
C ob1=new C();
ob1.disp2();

}
}                                                                                                                                                                                                                                      