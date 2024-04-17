
//grade ques in onlyif
import java.util.Scanner;
class onlyif
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
double sub1=sc.nextDouble();
double sub2=sc.nextDouble();
double sub3=sc.nextDouble();
double sub4=sc.nextDouble();
double sub5=sc.nextDouble();
double sum=sub1+sub2+sub3+sub4+sub5;
double pr=(sum/500)*100;
if (pr>=60)
{
System.out.println("1st division");
}
if(pr<60&&pr>=50)
{
System.out.println("2nd division");
}
if(pr<50&&pr>=40)
{
System.out.println("3rd division");
}
if(pr<40)
{
System.out.println("fail,work hard");
}
}
}


