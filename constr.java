class Rectangle{
double h;
double w;
Rectangle(int hi, int wi){
h = hi;
w = wi;
}
double area(){
return (h * w);
}
}

class constr{
public static void main(String args[]){
Rectangle ob1 = new Rectangle(10,20);
Rectangle ob2 = new Rectangle(3,6);
System.out.println("Area of the 1st rectangle is "+ ob1.area());
System.out.println("Area of the 2nd rectangle is "+ ob2.area());
}
}