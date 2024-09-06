import java.util.*;


class d2point
{
double x,y;
d2point()
{
x=0;
}
d2point(double nx,double ny)
{
x=nx;
y=ny;
}
double distance2d(d2point b)
{
double a1=(b.x-x);
a1=a1*a1;
double a2=(b.y-y)*(b.y-y);
System.out.println(a1+" "+a2);
double a=a1+a2;
double d=Math.sqrt(a);
return d;
}
}

class d3point extends d2point
{
double x,y,z;
d3point()
{
z=0;
}
d3point(double nx,double ny,double nz)
{
super(nx,ny);
z=nz;
}
double distance3d(d3point b)
{
double a1=(b.x-x)*(b.x-x);
double a2=(b.y-y)*(b.y-y);
double a3=(b.z-z)*(b.z-z);
double a=a1+a2+a3;
double d=Math.sqrt(a);
return d; 
}
}

class dadu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
d2point d1=new d2point();
double m=sc.nextDouble();
double n=sc.nextDouble();
d2point d2=new d2point(30.0,40.0);
System.out.println("distance in 2d plane: "+d1.distance2d(d2));

d3point d3=new d3point();
double p=sc.nextDouble();
d3point d4=new d3point(5.0,10.0,15.0);
System.out.println("distance in 3d plane: "+d3.distance3d(d4));
}
}