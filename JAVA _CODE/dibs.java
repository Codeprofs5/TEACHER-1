//leap year in if satement
import java.io.*;
class lyrif
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader bfr=new BufferedReader(isr);
int yr=Integer.parseInt(bfr.readLine());
if ((yr%100==0)&&(yr%400==0)||(yr%4==0)&&(yr%100!=0))
{
System.out.println("leap year");
}
else
{
System.out.println("not a leap year");
}
}
}

