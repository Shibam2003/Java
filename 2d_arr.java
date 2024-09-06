import java.util.*;
class arr_2d{
public static void main(String args[]){
int arr[][] = new int[3][3];
Scanner ob = new Scanner(System.in);
System.out.println("Please ente the elements in the 2d array:/n");
for(int r = 0; r<3; r++){
for(int c = 0; c<3; c++){
arr[r][c] = ob.nextInt();
		}
	}
System.out.println("The array elements are:\n");
for(int r = 0; r<3; r++){
for(int c = 0; c<3; c++){
System.out.println(arr[r][c]+" ");
		}
System.out.println();
	}
}
}