import java.io.*;
class add{
int sum, avg;
add(){
sum = 0;
avg = 0;
}
void sum(int a, int b, int c){
sum = a + b + c;
}
void avg(int a, int b, int c){
avg = sum / 3;
}
void display(){
System.out.println("sum is "+sum);
System.out.println("average is "+avg);
}
}

class Throwseg2{
public static void main(String args[]) throws IOException
{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("input 3 nos.");
int a = Integer.parseInt(ds.readLine());
int b = Integer.parseInt(ds.readLine());
int c = Integer.parseInt(ds.readLine());
add ob = new add();
ob.sum(a,b,c);
ob.avg(a,b,c);
ob.display();

}
}