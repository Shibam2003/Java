import java.util.*;

class rev{
int n,check,count=0,pos,start=0;
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
System.out.println("Enter the no. to be check:");

check = ob.nextInt();
	}
void check(){
for(int i = 0; i<n ; i++){
if(arr[i]== check){
pos = i+1;
count++;
int arr2[] = new int[n];
arr2[start]=pos;
start++;
}
}
}
void disp(){
if(count==0){
System.out.println("element not found");
}
else{
System.out.println("element found "+count+" times");
}
}
}
class array6{
public static void main(String args[]){
rev ob = new rev();
ob.input();
ob.check();
ob.disp();
}
}