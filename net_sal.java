interface hra{
double calc_hra(double b);
}
interface da{
double calc_da(double b);
}
interface pf{
double calc_pf(double b);
}
class salary implements hra,da,pf{
public double calc_hra(double b){
return (b*0.2);
}
public double calc_da(double b){
return (b*0.1);
}
public double calc_pf(double b){
return (b*0.05);
}
}
class net_sal{
public static void main(String a[]){
double basic=10000.0;
hra h = new salary();
da d = new salary();
pf p = new salary();
double hra1 = h.calc_hra(basic);
double da1 = d.calc_da(basic);
double pf1 = p.calc_pf(basic);
double net = basic + hra1 + da1 + pf1;
System.out.println("The net salary is :"+net);
}
}