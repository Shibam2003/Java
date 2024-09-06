import java.io.*;

class StringDemo2{
public static void main(String args[]) throws IOException{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("Enter your first name:");
String name = ds.readLine();
System.out.println("Enter your last name:");
String surname = ds.readLine();
int len1 = name.length();
int len2 = surname.length();
int len = len1 + len2;
System.out.println("Total length is "+len);
}
}