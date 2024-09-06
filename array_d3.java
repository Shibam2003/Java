import java.util.*;
class arr_2d{
int n,m,sum;
arr_2d(){
sum = 0;
	}
int arr[][];
void input(){
System.out.println("Enter row:");
Scanner ob = new Scanner(System.in);
m = ob.nextInt();
System.out.println("Enter column:");
n = ob.nextInt();
arr=new int[m][n];
System.out.println("Please enter the elements in the "+m+"X"+n+" 2d array:");
for(int r = 0; r<m; r++){
	for(int c = 0; c<n; c++){
			arr[r][c] = ob.nextInt();
			}
		}
}
void sum1(){
for(int r = 0; r<m; r++){
for(int c = 0; c<n; c++){
sum += arr[r][c];
		}
System.out.println("Sum of "+r+" row is: "+sum);
sum=0;
	}
}
void disp(){
System.out.println("Sum of the array elements is: "+sum);
}
}
class array_d3{
public static void main(String args[]){
arr_2d ob2 = new arr_2d();
ob2.input();
ob2.sum1();
//ob2.disp();
}
}