import java.util.*;
class sum1{
public int Add(int a, int b){
for(int i=1;i<=b;i++){
a++;
}
return a;
}
public static void main(String args[]){
int a,b,p;
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b= sc.nextInt();
sum1 ob = new sum1();
p= ob.Add(a,b);
System.out.println("The sum of two nos. "+p);
}
}