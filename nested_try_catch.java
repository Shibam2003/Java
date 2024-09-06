class nested_try_catch{
public static void main(String args[]){
int x = 12;
int y = 2;
int p[] = {10,4,6,2};
try{
int z = x/y;
System.out.println("The result is "+z);
try{
p[17] = 10;
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array index out of bound");
	}

}

catch(ArithmeticException e){
System.out.println("This results to infinity");
	}
}
}