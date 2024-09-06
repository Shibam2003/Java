import java.io.*;
class Thread6{
public static void main(String args[]) throws IOException{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("Enter the first no.:");
int a = Integer.parseInt(ds.readLine());
System.out.println("Enter the second no.:");
int b = Integer.parseInt(ds.readLine());
int result = a + b;
try{
Thread.sleep(10000);
System.out.println("The result is:"+result);

}
catch(InterruptedException e){

	}

}
}