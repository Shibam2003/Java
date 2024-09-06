import java.io.*;

class S_equal2{
public static void main(String args[]) throws IOException{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("Enter the string1");
String str1 = ds.readLine();
System.out.println("Enter the string2");
String str2 = ds.readLine();
boolean retVal;

retVal = str1.equals(str2);
System.out.println("Returned value for equals ="+retVal);
retVal = str1.equalsIgnoreCase(str2);
System.out.println("Returned value for equals ignore case ="+retVal);

}
}