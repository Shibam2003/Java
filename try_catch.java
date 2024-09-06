 class try_catch{
public static void main(String args[]){
int x = 12;
int y = 0;

try{
int z = x/y;
System.out.println("The result is "+z);
	}
catch(ArithmeticException e){
System.out.println("Divisible with zero is not possible... please try with another number");
	}
}
}