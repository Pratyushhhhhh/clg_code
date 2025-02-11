import java.util.*;
class Task2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for Term Deposit \n2 for Recuring Deposit");
int ch=sc.nextInt();
switch(ch)
{
case 1:
	System.out.println("Enter Principal");
	double p=sc.nextDouble();
	System.out.println("Enter rate of interest");
	double r=sc.nextDouble();
	System.out.println("Enter Time period in years");
	double t=sc.nextDouble();
	double a=p*(1+r/100)*t;
	System.out.println("Maturity Amount is :"+a);
	break;

case 2:
	System.out.println("Enter Monthly Instalment");
	p=sc.nextDouble();
	System.out.println("Enter rate of interest");
	r=sc.nextDouble();
	System.out.println("Enter Time period in months");
	t=sc.nextDouble();
	a=p*t+p*t*(t+1)/2*r/100*1/12;
	System.out.println("Maturity Amount is :"+a);
	break;

default:
	System.out.println("Wrong input");
}
}
}
	

	