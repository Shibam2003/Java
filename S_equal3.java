import java.io.*;

class S_equal3{
public static void main(String args[]) throws IOException{
DataInputStream ds = new DataInputStream(System.in);
String email = new String("shibamc55@gmail.com");
String pass = new String("123@456");
System.out.println("Enter the email:");
String email2 = ds.readLine();
System.out.println("Enter the password:");
String pass2 = ds.readLine();

if(email.equalsIgnoreCase(email2)){
if(pass.equals(pass2)){
System.out.println("Valid login");
}
else{
System.out.println("invalid login");

}
}
else{
System.out.println("invalid login");

}

}
}