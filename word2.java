import java.util.*;

class hello2{
String s;
int arr[] = new int[26];
int count = 0;
void input(){
Scanner sc = new Scanner(System.in);
s = sc.nextLine();
	}
void check(){
for(int j = 0; j < s.length(); j++){
	char p = s.charAt(j);
	int b = (int)p;
	int index = p - 'a';
	arr[index]++;
	}
for(int i = 0; i < 26; i++){
	if(arr[i] > 1){
	count++;
	break;
	}
	}
}
void display(){
if(count == 0){
System.out.println("unique string");}
else{
System.out.println("not unique");
	}
}
}

class word2{
public static void main(String args[]){
	hello2 ob = new hello2();
	ob.input();
	ob.check();
	ob.display();
	}
}
