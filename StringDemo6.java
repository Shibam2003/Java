import java.io.*;

class StringDemo6{
public static void main(String args[]) throws IOException{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("Enter the string:");
String name = ds.readLine();
boolean retVal;
retVal = name.endsWith("immutable");
System.out.println(retVal);
}
}