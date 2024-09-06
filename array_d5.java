import java.util.*;
class arr_2d{
int n,m,count;
arr_2d(){
count = 0;
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
void check(){
for(int r = 0; r<m; r++){
for(int c = 0; c<n; c++){
if(r == c){
if(arr[r][c]!=1){
count = 1;
break;}
}
else{
if(arr[r][c]!=0){
count = 1;
break;
}
}
	}
	}
}
void disp(){
if(count == 0){
System.out.println("The matrix is an identity matrix");
}
else{
System.out.println("The matrix is not an identity matrix");
}
}
}
class array_d5{
public static void main(String args[]){
arr_2d ob2 = new arr_2d();
ob2.input();
ob2.check();
ob2.disp();
}
}