class hello
{
int a,c;
void input(int n){
a=n;
c=a;
}
void cal(){
int b=0,r;
while(a!=0){
r=n%10;
b=b*10+r;
a=a/10;
}
}
void disp(){
if(b==c){
System.out.println("The no. is palindrome");
}
else{
System.out.println("The no. is not a palindrome");
}
}
}


class command4
{
public static void main(String args[])
{
int x;
x=Integer.parseInt(args[0]);
hello ob1=new hello();
ob1.input(x);
ob1.cal();
ob1.disp();
}
}