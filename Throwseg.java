//use of throws keyword

import java.io.*;
class Throwseg{
public static void main(String args[]) throws IOException
{
DataInputStream ds = new DataInputStream(System.in);
System.out.println("input 3 nos.");
int a = Integer.parseInt(ds.readLine());
float b = Float.parseFloat(ds.readLine());
double c = Double.parseDouble(ds.readLine());

System.out.println("Enter a string");
String ch = ds.readLine();
System.out.println("string="+ch);
System.out.println("3 Nos="+a+" "+b+" "+c);

}
}