//PROGRAM TO CHECK A YEAR IS LEAP-YEAR OR NOT
class hello
{
int a,b,count=0;
void input(int n){
a=n;
}
void disp(){
if(a%400==0 || ((a%4==0)&&(a%100!=0)))
{
System.out.println(a+" is a leap year");
}
else{
System.out.println(a+" is not a leap year");
}
}
}


class command5
{
public static void main(String args[])
{
int x;
x=Integer.parseInt(args[0]);
hello ob1=new hello();
ob1.input(x);
ob1.disp();
}
}