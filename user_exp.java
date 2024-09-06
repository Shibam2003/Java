class nomatch extends Exception{//user defined exception 

}
class Throweg{
void check(String s1){
	char ch;
 	ch = s1.charAt(0);
	if(ch == 'M'){
	System.out.println("valid id");
}
	else{
	try{

	throw new nomatch();
	}
catch(nomatch e){

System.out.println("invalid id");
}
}
	}
}
class user_exp{
public static void main(String args[]){
Throweg ob = new Throweg();
ob.check("Ayan");
}
}