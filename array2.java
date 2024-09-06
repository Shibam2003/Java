import java.util.*;//this is the package which conatin the Scanner class 
class sum1{
int sum,n;
sum1(){
sum = 0;
}
int arr[];
void input(){
System.out.println("Enter the no. of elements:");
Scanner ob = new Scanner(System.in);
n = ob.nextInt();

arr=new int[n];


System.out.println("Please enter the elements in the array:");
for(int i = 0; i<n;i++){
arr[i]=ob.nextInt();
}
}
void cal(){
for(int i = 0; i<n;i++){
sum = sum+arr[i];
}
}
void disp(){
System.out.println("sum of all the elements is: "+sum);
}
}
class array2{
public static void main(String args[]){
sum1 ob = new sum1();
ob.input();
ob.cal();
ob.disp();
}
}