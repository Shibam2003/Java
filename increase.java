import java.util.*;

class abc{
Scanner sc = new Scanner(System.in);
int no;
void input(){
System.out.println("Enter the series:");
no = sc.nextInt();
	}
boolean incresing(int no){
int rem1, rem2;
rem1 = no % 10;
no = no / 10;
while(no > 0){
rem2 = no % 10;
if(rem1 < rem2){
return false;
	}
else{
rem1 = rem2;
no = no /10;
}

}
return true;

} 
boolean decresing(int no){
int rem1, rem2;
rem1 = no % 10;
no = no / 10;
while(no > 0){
rem2 = no % 10;
if(rem1 > rem2){
return false;
	}
else{
rem1 = rem2;
no = no /10;
}

}
return true;

} 


void check(){

if(incresing(no)){
System.out.println("It  is in the increasing order");
}
else if(decresing(no)){
System.out.println("It  is in the decreasing order");
}
else{
System.out.println("Not in a order");
}
	}


}



class increase{
public static void main(String args[]){
abc ob = new abc();
ob.input();
ob.check();

}
}