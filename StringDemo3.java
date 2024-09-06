import java.io.*;

class StringDemo3{
public static void main(String args[]) throws IOException{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("Enter the string:");
String name = ds.readLine();
System.out.println("Enter the index:");
int index = Integer.parseInt(ds.readLine());
char result = name.charAt(index-1);
System.out.println("char at "+index+" is "+result);
}
}