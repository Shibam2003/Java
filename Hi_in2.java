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
int c=12;

void disp1(){
System.out.println("value:"+c);
}

}
class C extends A
{int c;

void disp2(){
c=x*y;
System.out.println("Multiplication result is "+c);
}
}
class D extends B
{int d;
void disp3(){
d=c+2;
System.out.println("value+2:"+d);
}
}
class Hi_in2
{
public static void main(String args[])
{
B ob = new B();
ob.disp1();
C ob1=new C();
ob1.disp2();
D ob2= new D();
ob2.disp3();

}
}                                                                                                                                                                                                                                      