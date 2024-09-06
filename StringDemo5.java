class StringDemo5{
public static void main(String args[]){
String str = new String("This is really not immutable");
boolean retVal;
retVal = str.endsWith("immutable");
System.out.println(retVal);
retVal = str.endsWith("immu");
System.out.println(retVal);
}
}