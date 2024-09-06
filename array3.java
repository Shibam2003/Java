import java.util.*;

class rev{
int start=0,n;
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
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++; 
end--;
}
}
void disp(){
System.out.println("After reversing the array is:\n");
for(int i = 0; i<n;i++){
System.out.println(arr[i]+" ");
}
}
}




class array3{
public static void main(String args[]){
rev ob = new rev();
ob.input();
ob.swap1();
ob.disp();
}
}