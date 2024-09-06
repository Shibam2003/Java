import java.util.*;
class sum2{
int count=0;
int v;
int rem3=0;
int digit(int n){
int rem;
 v = n;
while(n>0){
rem = n%10;
count++;
n=n/10;
}
return count;
}
int arm(int a){
int rem2,read;
while(a>0){
rem2 = a%10;
read = (int)(Math.pow(rem2,count));
rem3 = rem3+ read;
a=a/10;
}
return rem3;
}
void display(){
if(v==rem3){System.out.println(v+" is an armstrong no.");} 
else{System.out.println(v+" is not an armstrong no.");}
}

public static void main(String args[]){
int a,q;
int p;
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
//b= sc.next();//
sum2 ob = new sum2();
q = ob.digit(a);
System.out.println(q);
p = ob.arm(a);
System.out.println(p);
 ob.display();
}
}