class Throweg{
void check(String s1){
char ch;
ch = s1.charAt(0);
if(ch == 'A'){
System.out.println("Valid id");
}
else{
try{
throw new ArithmeticException();//generating an exception
	}
catch(ArithmeticException e){
System.out.println("Invalid id");
}
}
	}
}

class TCT{
public static void main(String args[]){
Throweg ob = new Throweg();
ob.check("Ayan");
}
}