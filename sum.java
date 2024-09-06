import java.util.*;
class sum{
public int Add(int a, int b){
int s=0;
s=a+b;
return s;
}
public static void main(String args[]){
int a,b,p;
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b= sc.nextInt();
sum ob = new sum();
p= ob.Add(a,b);
System.out.println("The sum of two nos. "+p);
}
}