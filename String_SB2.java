import java.io.*;

class String_SB2{
public static void main(String args[]) throws IOException{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("Enter the string1:");
String str = ds.readLine();
System.out.println("Enter the string2:");
String str2 = ds.readLine();

StringBuffer sb = new StringBuffer(str);
sb.append(str2);
System.out.println(sb);

}
}