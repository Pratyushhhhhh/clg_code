import java.util.Scanner;
class stringcount
{
String str1;
int count1,count2;
stringcount(String s)
{
str1=s;
count1=0;
count2=0;
}

void count()
{
int n=str1.length();
str1=str1+" ";
char ch;
for(int i=0;i<=n;i++)
{
ch=str1.charAt(i);
count1++;
if(ch==' ')
count2++;
}
System.out.println("No of letters are "+count1);
System.out.println("No of words are "+count2);
}

public static void main(String Args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str=sc.nextLine();

stringcount obj=new stringcount(str);
obj.count();
}
}



