
interface items_price{
	double calc(int item, int price);
}
interface current_item{
	double cur_i(int prev,int left);
}
interface cur_item_price{
	double cur_i_p(double cur_item, int price_per_item);
}
class Hello implements items_price,current_item,cur_item_price{
				public double calc(int item, int price){
								return (item*price);
								}
				public double cur_i(int prev, int left){
								return (prev-left);
								}
				public double cur_i_p(double cur_item, int price_per_item){
								return (cur_item*price_per_item);
								}
}
class stock_left{
public static void main(String a[]){
int item = 100;
System.out.println("items are present  at first:"+item);
int price_per_item = 200;
System.out.println("price per item:"+price_per_item);
items_price i_p = new Hello();
double price = i_p.calc(item,price_per_item);
System.out.println("total price of the item:"+price);
int items_left = 50;
current_item c_i = new Hello();
double current = c_i.cur_i(item,items_left);
cur_item_price cur_p = new Hello();
double stock_l_p = cur_p.cur_i_p(current,price_per_item);

System.out.println("Now after some items left from the stock");
System.out.println("Stock left:"+items_left+" now stock have "+current+" items of price: "+stock_l_p);

}
}