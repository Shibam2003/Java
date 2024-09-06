import java.io.*;

class StringDemo7{
public static void main(String args[]) throws IOException{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("Enter the string:");
String name = ds.readLine();
boolean retVal;
System.out.println("Enter the string you want to check startsWith :");
String str2 = ds.readLine();
retVal = name.startsWith(str2);
System.out.println("match: "+retVal);
}
}