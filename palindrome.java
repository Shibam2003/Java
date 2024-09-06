import java.util.*;
class A{


int  n,m;
int num = 0;
void input(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no.:");
n = sc.nextInt();
m = n;
}


//reversing the number
void palin(){
int rem;
while(n > 0){
	rem = n % 10;
	num = (num * 10) + rem;
	n = n / 10;
	}
}



//checking and displaying the result(palindrome or not)
void disp(){
if(m == num){System.out.println(m+" is a palindrome");}
else{System.out.println(m+" is not a palindrome");}
}
}



class palindrome{
public static void main(String Args[]){
A ob = new A();
ob.input();
ob.palin();
ob.disp();
}
}