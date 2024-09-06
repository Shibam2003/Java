import java.util.*;
class arr_2d{
int n,m,sum,sumd;
arr_2d(){
sum = 0;
sumd = 0;
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
if(r == c){
sumd += arr[r][c];
}
else{
sum += arr[r][c];
	}
	}
}
}
void disp(){
System.out.println("Sum of the diagonal elements is: "+sumd);
System.out.println("Sum of the non diagonal elements is: "+sum);
}
}
class array_d4{
public static void main(String args[]){
arr_2d ob2 = new arr_2d();
ob2.input();
ob2.sum1();
ob2.disp();
}
}