import java.util.*;
public class demo
{
int size,age;
int marks[];
String name,department;

demo(int s,int a, String n, String dep)
{
size=s;
age=a;
name=n;
department=dep;
marks=new int[size];
}

void mark()
{
System.out.println("Enter marks ");
Scanner sc=new Scanner(System.in);
for(int i=0;i<marks.length;i++)
marks[i]=sc.nextInt();
}
	

int average()
{
int sum=0;
for(int i=0;i<marks.length;i++)
	sum+=marks[i];
return (sum/marks.length);
}

void display()
{
int avg=average();
System.out.println("Name is : "+name+"\nDepartment is : "+department+"\nAge and average is : "+age+" "+avg);
}

public static void main(String []Args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Input size , age , name , dep");
int size=sc.nextInt();
int age=sc.nextInt();
sc.nextLine();
String name=sc.nextLine();
String dep=sc.nextLine();
demo obj=new demo(size,age,name,dep);
obj.mark();
obj.display();

}
}