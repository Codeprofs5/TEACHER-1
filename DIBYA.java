import java.util.Scanner;
class dibi
{
	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two nos between which sum is to be taken out");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("divisibe by");
	int num=sc.nextInt();
	int s=0;
	if((b>a)&&(num>0))
	{
		for(int i=a;i<=b;i++)
		{
			if(i%num==0)
			{
				s=s+i;
			}
		}
		
			System.out.println(s+" is the sum of the nos between "+a+"and"+b+" and are also divisible by 7");
		
	}
	else
	{
		System.out.println("invalid inputs");
	}
}
}

		