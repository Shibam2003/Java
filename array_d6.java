import java.util.*;
class arr_2d{
int n,m;
arr_2d(){
	}
int arr[][];
int arr2[][];
void input(){
System.out.println("Enter row:");
Scanner ob = new Scanner(System.in);
m = ob.nextInt();
System.out.println("Enter column:");
n = ob.nextInt();
arr=new int[m][n];
arr2= new int[m][n];
System.out.println("Please enter the elements in the 1st "+m+"X"+n+" 2d array:");
for(int r = 0; r<m; r++){
	for(int c = 0; c<n; c++){
			arr[r][c] = ob.nextInt();
			}
		}
System.out.println("Please enter the elements in the 2nd "+m+"X"+n+" 2d array:");
for(int r = 0; r<m; r++){
	for(int c = 0; c<n; c++){
			arr2[r][c] = ob.nextInt();
			}
		}
}
void sum1(){
for(int r = 0; r<m; r++){
for(int c = 0; c<n; c++){
arr[r][c]= arr[r][c] + arr2[r][c];
		}
	}
}
void disp(){
System.out.println("Sum of the two matrices is: ");
for(int r = 0; r<m; r++){
for(int c = 0; c<n; c++){
System.out.print(arr[r][c]+" ");
		}
System.out.println();
	}
}
}
class array_d6{
public static void main(String args[]){
arr_2d ob2 = new arr_2d();
ob2.input();
ob2.sum1();
ob2.disp();
}
}