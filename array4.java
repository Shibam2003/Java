//checking an arry is palindrome or not
import java.util.*;

class rev{
int start=0,n,count=0;
int arr[];
void input(){
System.out.println("Enter the no. of elements:");
Scanner ob = new Scanner(System.in);
n = ob.nextInt();
arr=new int[n];
System.out.println("Please enter the elements in the array:");
for(int i = 0; i<n; i++){
arr[i]=ob.nextInt();
		}

	}
void swap1(){
int end= n-1;
while(start<end){
if(arr[start]!=arr[end]){
count = 1;
break;
}
start++; 
end--;
}
}
void disp(){
if(count==1){
System.out.println("The no. is not a palindrome");
}
else{
System.out.println("The no. is  a palindrome");
}
}
}




class array4{
public static void main(String args[]){
rev ob = new rev();
ob.input();
ob.swap1();
ob.disp();
}
}