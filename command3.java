class command3
{
public static void main(String args[])
{
int x,y=0;
for(int i=0;i<args.length;i++)
{
x=Integer.parseInt(args[i]);
y=y+x;

}
System.out.println("The result is:"+y);
}
}