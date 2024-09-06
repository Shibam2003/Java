class Test1
{
int a,b;
double c;
char d;
void disp()
{
System.out.println("The values are:"+a+" "+b+" "+c+" "+d);
}
}
class Test5
{
public static void main(String a[])
{
Test1 ob1=new Test1();
ob1.disp();
}
}