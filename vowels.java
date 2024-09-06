import java.util.*;
class vowels{
public static void main(String args[]){
System.out.println("Eneter the string:");
Scanner ob = new Scanner(System.in);
String st = ob.next();
char ch;
int count=0;
for(int i = 0; i<st.length(); i++){
	ch = st.charAt(i);
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		count++;
		}
	}
System.out.println("No. of vowels: "+count);
}
}