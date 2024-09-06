class X{
void show(){
System.out.println("Hello, Java");
	}
}
class Y extends X{
}
class Z extends Y{
Z(){
super.show();
	}
}
public class Demo extends Z{
public static void main(String args[]){
Z obj = new Z();
	}
}