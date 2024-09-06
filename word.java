import java.util.*;

class hello2{
String s;
void input(){
Scanner sc = new Scanner(System.in);
s = sc.nextLine();
	}
void check(){
s.toLowerCase();
for(int j = 0; j < s.length(); j++){
char p = s.charAt(j);
if(p == 'a' || p == 'e' || p == 'i' || p == 'o'|| p == 'u'){
	int b = p + 1;
	char n = (char)b;
	s = s.replace(p, n);
			}
		}
	}
void display(){
System.out.println(s);
}
}

class word{
public static void main(String args[]){
	hello2 ob = new hello2();
	ob.input();
	ob.check();
	ob.display();
	}
}
