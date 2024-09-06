import java.util.*;

class rev{
int n,check,count=0,pos,start=0;
int arr[],arr2[];
void input(){
System.out.println("Enter the no. of elements:");
Scanner ob = new Scanner(System.in);
n = ob.nextInt();
arr=new int[n];
arr2 = new int[n];
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
System.out.println("element found "+count+" times in the position ");
for(int i = 0; i< count; i++){
System.out.println(arr2[i]+" ");
}
}
}
}
class array7{
public static void main(String args[]){
rev ob = new rev();
ob.input();
ob.check();
ob.disp();
}
}