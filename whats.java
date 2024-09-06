import java.util.*;
class whats
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the capacity of the array:");
int n=sc.nextInt();
int arr[]=new int[n];

void input()
{
System.out.println("How many input you want to enter:");
int m=sc.nextInt();
for(int i=0;i<m;i++)
arr[i]=sc.nextInt();
}

void sa()
{
int s=0;
double avg=0.0;
for(int i=0;i<m;i++)
s=s+arr[i];
avg=s/m;
}

void display()
{
System.out.println("the sum and average is "+s+"and "+avg);
}

public static void main(String args[])
{
whats a=new whats();
a.input();
a.sa();
a.display();
}

}