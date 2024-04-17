//parameterized constructor
class substract
{
int a,b;
substract(int x,int y)
{
a=x;
b=y;

}
public static void main(String args[])
{
substract d1 = new substract(90,50);
int sub =d1.a-d1.b;
System.out.println(sub);
}
}