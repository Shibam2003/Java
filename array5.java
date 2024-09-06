import java.util.*;

class rev{
int start=0,n,check,count=0,pos;
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
break;
}
}
}
void disp(){
if(count == 1){
System.out.println("element found in the position " +pos);
}
else{
System.out.println("element not found");
}
}
}
class array5{
public static void main(String args[]){
rev ob = new rev();
ob.input();
ob.check();
ob.disp();
}
}