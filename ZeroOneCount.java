import java.util.*;
class ZeroOneCount
{
	public int count(String str)
	{
	int f1=0,f2=0,c=0;
	for (char ch : str.toCharArray())
	{
		if(ch=='0')
		{
		f1=1;
			if(f2==1)
			{
			c++;
			f2=0;
			}
		continue;
		}
		if(f1==1&&ch=='1')
		{
			f2=1;
		}
	}
	return c;
	}
}
class main1
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
	ZeroOneCount obj=new ZeroOneCount();
	int n=obj.count(str);
	System.out.println("There are "+n+"   0(1+)0");
	}
}

		