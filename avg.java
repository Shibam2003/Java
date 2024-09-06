import java.util.*;

class avg{
public static void main(String args[]){
int sum = 0;
Scanner ob = new Scanner(System.in);
System.out.println("Enter no. of element");
int n = ob.nextInt();

int arr[] = new int[n];
for(int i = 0; i < n; i++){
arr[i] = ob.nextInt();
	}
System.out.println("How many value you want to add");
int m = ob.nextInt();
if(m < n){
for(int i = 0; i < m; i++){
sum += arr[i];
	}
float avg = sum / n;
System.out.println("Sum of the elements is:"+sum);
System.out.println("average is:"+avg);
}
else{
System.out.println("you can add upto "+n+" numbers");
}

}
}
