import java.util.*;
class abc{
Scanner sc = new Scanner(System.in);
int no, count = 0;
void input(){
System.out.println("Enter the series:");
no = sc.nextInt();
	}
void check(){
int num = no;
int nrem,prem;

nrem = num % 10;
num = num / 10;
if(nrem % 2 == 0){
prem = 1;
}
else{
prem = 2;
}
while(num > 0){
nrem = num % 10;
if(nrem % 2 == 0){
if(prem == 1){
System.out.println("hi"+nrem);
count = 1;
break;
}
else{

prem = 1;
}
	}
else{
if(prem == 2){
count = 1;
break;
}
else{
prem = 2;
	}
}
if(count == 1){break;}

num = num /10;
}
	}


void display(){

if(count == 0){System.out.println("The series is in the sequence");}
else{System.out.println("The series is not in the sequence");}
}

}



class digit{
public static void main(String args[]){
abc ob = new abc();
ob.input();
ob.check();
ob.display();

}
}