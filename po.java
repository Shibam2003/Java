import java.util.*;
class point{
int x,y;

point(){
x=0;
y=0;
}

void input(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the x-coordinate:");
x = sc.nextInt();
System.out.println("Enter the y-coordinate:");
y = sc.nextInt();
}
point midpoint(point a, point b){
point temp=new point();
temp.x = (a.x + b.x)/2;
temp.y = (a.y + b.y)/2;
temp.disp();
return temp;
}
void disp(){
System.out.println("x = "+x);
System.out.println("y = "+y);

	}
}
class po{
public static void main(String args[]){
point ob = new point();
point ob2 = new point();
ob.input();
ob2.input();
point ob3 = ob.midpoint(ob,ob2);
}
}