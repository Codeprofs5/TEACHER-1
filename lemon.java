=
//swap using multiplication and division,instance variable and formal parameters shouldnot be same
class swapm
{
int a,b;
void swap(int i,int j)
{
if(j>0)
{
i=i*j;
j=i/j;
i=i/j;
System.out.println("after swaping"+i+" "+j);
}
else
System.out.println("invalid");
}
public static void main(String args[])
{
int num1=20;
int num2=30;
System.out.println("before swaping"+num1+" "+num2);
swapm obj =new swapm();
obj.swap(num1,num2);

}
}
