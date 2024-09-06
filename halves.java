
import java.util.*;

class low{
Scanner sc = new Scanner(System.in);
int arr[][];
int m,n; 
void input(){
System.out.println("Enter the row:");
m = sc.nextInt();
System.out.println("Enter the col:");
n = sc.nextInt();
arr = new int[m][n];
System.out.println("Enter the data in the "+m+"X"+n+" matrix");
for(int row = 0; row < m; row++){
for(int col = 0; col < n; col++){
arr[row][col] = sc.nextInt();
}
}
	}
void upper_halves(){
for(int row = 0; row < m; row++){
for(int col = 0; col < n; col++){
if(row > col){System.out.print("  "); continue;}
System.out.print(arr[row][col]+" ");
}
System.out.println();
}
}

}

class halves{
public static void main(String args[]){
low ob = new low();
ob.input();
System.out.println("output is:");
ob.upper_halves();
}
}