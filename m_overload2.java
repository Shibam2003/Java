class func_overload
{

void area(float x, int y)
{
float c;
c=0.5f*x*y;
System.out.println("Area of the triangle is :"+c);
}
void area(int x, int y)
{
float c;
c=x*y;
System.out.println("Area of the rectangle is:"+c);
}
void area(int x)
{
float c;
c=3.14f*x*x;
System.out.println("Area of the circle is:"+c);
}
}
class m_overload2
{
public static void main(String args[])
{
func_overload ob=new func_overload();
ob.area(12.5f,11);
ob.area(2,3);
ob.area(3);
}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   