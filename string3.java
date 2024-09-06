//use of indexOf() and charAt() function
import java.io.*;

class string3{
public static void main(String args[]) throws IOException{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("Enter the string:");
String str = ds.readLine();
System.out.println("Enter the character you want to search:");
String str2 = ds.readLine();
char ch = str2.charAt(0);

System.out.println("Found index");
System.out.println(str.indexOf(ch));

}
}