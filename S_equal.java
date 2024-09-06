class S_equal{
public static void main(String args[]){
String str1 = new String("This is not really immutable");
String str2 = str1;
String str3 = new String("This is not really immutable");
String str4 = new String("This is NOT REALLY IMMUTABLE");
boolean retVal;

retVal = str1.equals(str2);
System.out.println("Returned value ="+retVal);
retVal = str1.equals(str3);
System.out.println("Returned value ="+retVal);
retVal = str1.equalsIgnoreCase(str4);
System.out.println("Returned value ="+retVal);
}
}