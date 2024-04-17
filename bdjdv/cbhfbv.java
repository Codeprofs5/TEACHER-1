//find fractional of division operation using code reusability
class fractional
{
float num1,num2;
float div(float a,float b)
{
return a/b;
}
float fraction(float x,float y)
{
float fract=div(x,y)%1;
return fract;
}
public static void main(String args[])
{
fractional obj = new fractional();
obj.num1=10;
obj.num2=3;
if (obj.num2!=0)
{
System.out.println(obj.fraction(obj.num1,obj.num2));
}
}
}