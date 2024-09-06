//WAP to program in java how to read and display in an array
import java.util.*;//this is the package which conatin the Scanner class 
class array{
public static void main(String args[]){
Scanner ob = new Scanner(System.in);//Scanner class is used to take input from the user
int arr[] = new int[5];
System.out.println("Please enter the elements in the array:");
for(int i = 0; i<5;i++){
arr[i]=ob.nextInt();//this is how we accept a no. from the user
}
System.out.println("The elements inside the array are:");
for(int i = 0; i<5;i++){
System.out.println(arr[i]+" ");
}
}
}