import java.util.*;
class search{
public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int f=0;
	char ch;
	String sen2 = "";
	String word;
	String sen;
	String word1 = "";
	System.out.println("Enter the string: ");
	sen = ob.nextLine();
	System.out.println("Enter the word  to search:");

	word = ob.nextLine();
	String sen1 = sen.toLowerCase();
	word1=word1+word.toLowerCase();
	for(int i = 0; i<sen.length(); i=i+word.length()){
		while(sen.charAt(i)!=' '){
			ch = sen.charAt(i);
			sen2 = sen2+ch;
			}
			if(sen2.compareTo(word1)==0){
			f=f+1;
			}
	if(f==1){
System.out.println("The word is present  in the string "+i);
break;}
		}

	}
}