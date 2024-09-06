import java.util.*;
class library{
String name,author;
double p;
library(String name, String author, double p){
this.name = name ;
this.author = author;
this.p = p;
	}
void show(){
System.out.println("Name of the book:"+name);
System.out.println("Name of the author is:"+author);
System.out.println("Price of the book:"+p);
	}
}

class Compute extends library{
int d;
double f;
Compute(String name, String author, double p, int d){
super(name, author, p);
this.d = d;
	}
void fine(){
int ex = d - 10;
if(ex < 1) f = 0;
else f = ex * 51;
	}
void disp(){
super.show();
System.out.println("Return after "+d+" days");
System.out.println("amount of fine charged  "+f);
System.out.println("Total amount "+((0.02)*p*d+f));
	}
}

class burima{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the book name:");
String name = sc.nextLine();
System.out.println("Enter the author name:");
String auth = sc.nextLine();
System.out.println("Enter the price:");
double p = sc.nextDouble();
System.out.println("Enter the last date:");
int d = sc.nextInt();
Compute ob = new Compute(name, auth, p, d);
ob.fine();
ob.disp();

}
}