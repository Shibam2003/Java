import java.util.*;

class rev{
int n,temp;
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
void sort(){
for (int i = 0; i < n; i++) {     
for (int j = i+1; j < n; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }  
   
    }  
}
}
void disp(){
for (int i = 0; i <n; i++) {     
System.out.print(arr[i] + " ");    
}   
}
}
class array8{
public static void main(String args[]){
rev ob = new rev();
ob.input();
ob.sort();
ob.disp();
}
}