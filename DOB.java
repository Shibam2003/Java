//program to calculate age 
import java.util.*;
class date{

void calculate(int y, int m, int d, int y2, int m2, int d2){
	int currY = y2;
	boolean leapYear = false;
	//checking for leapyear
	if(currY % 400 == 0 || (currY % 4 == 0 && currY % 100 != 0)){
		leapYear = true;
		}



	int currM = m2;
	int currD = d2;
	//checking  current day is lesser than given date or not
	if(currD < d){
	int m1 = currM - 1;
	if(m1 == 2){
		if(leapYear){ currD += 29;}
		else{
		currD += 28;
		}
		}
	if( m1 == 0 || m1 == 1 || m1 == 3 || m1 == 5 || m1 == 7 || m1 == 8 || m1 == 10 || m1 == 12){
		currD += 31;
		} 
	if(m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11){
	currD += 30;
		}
	currM = currM - 1;
	}
	int date = Math.abs(currD - d);

	//month calculation starts here

	if(currM < m){
	currM += 12;
	currY = currY -1;
	}
	int month = Math.abs(currM - m);

	//year calculation starts here

	int year = currY - y;

	System.out.println(year+" years "+month+" month "+date); 
}


}
class DOB{




public static void main(String args[]){
Scanner ob = new Scanner(System.in);
System.out.println("Enter the dob:");
System.out.println("Enter the year:");
int y = ob.nextInt();
System.out.println("Enter the month:");
int m = ob.nextInt();
System.out.println("Enter the date:");
int d = ob.nextInt();
System.out.println("Enter the current yy/mm/dd");
System.out.println("Enter the current year:");
int currY = ob.nextInt();
System.out.println("Enter the current month:");
int currM = ob.nextInt();
System.out.println("Enter the current days:");
int currD = ob.nextInt();
date ob1 = new date();
ob1.calculate(y, m, d, currY, currM, currD);



}
}