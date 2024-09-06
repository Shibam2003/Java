
class String_trim{
public static void main(String args[]){
String Str = new String(" Welcome Shibam ");
int len = Str.length();
System.out.println("Before trimming length is:"+len);
String Str1 = Str.trim();
len = Str1.length();
System.out.println("After trimming length is:"+len);
}
}