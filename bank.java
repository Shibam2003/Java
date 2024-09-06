import java.util.*;
class bank_account{
Scanner ob = new Scanner(System.in);
String name;
String address;
int accno;
float amount;

bank_account(){
name = "";
address = "";
accno = 0;
amount = 0;
	}
void input(){
System.out.println("Enter the name:");
name = ob.nextLine();
System.out.println("Enter the address:");
address = ob.nextLine();
System.out.println("Enter the account no.:");
accno = ob.nextInt();
System.out.println("Enter the amount.:");
amount = ob.nextFloat();

}
void deposit(){
System.out.println("Are you want to deposit? press 1 for yes: ");
int a = ob.nextInt();
if(a == 1){
System.out.println("Enter the amount you want to add");
float deposit = ob.nextFloat();
amount = amount + deposit;
System.out.println("Your bank balance now:"+amount);
	}
}
void withdraw(){
System.out.println("Are you want to withdraw press 1 for yes: ");
int a = ob.nextInt();
if(a == 1){
System.out.println("Enter the amount you want to withdraw:");
float with = ob.nextFloat();
if(with > amount){
System.out.println("Insufficient balance please check your balance and try again.");
}
else{
System.out.println(with+" amount is withdrawl by you from account no. "+accno);
amount = amount - with;
	}
System.out.println("Your bank balance now:"+amount);
}
}
void display(){
System.out.println(name+" your account "+accno+ "has current balance  "+amount+"/-");
	}
}

class bank{
public static void main(String args[]){
bank_account ob = new bank_account();
ob.input();
ob.deposit();
ob.withdraw();
	} 
}