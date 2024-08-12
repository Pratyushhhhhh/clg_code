#include<stdio.h>
#include<stdlib.h>
#define MAX 5
void push(int[],int*,int);
void pop(int[],int*);
void display(int[],int*);
int main()
{
int a[MAX],top,i,ch,n;
top=-1;
do
{
printf("\nEnter your choice\n1 for push \n2 for pop \n3 for display and \n4 exit");
scanf("%d",&ch);
switch(ch)
{
case 1:{
printf("Enter value to be added");
scanf("%d",&n);
push(a,&top,n);
break;
}
case 2:{
pop(a,&top);
break;
}
case 3:{
display(a,&top);

break;
}
case 4:{
exit(0);
}
default:
printf("Wrong input");
}
}while(1);


}

void push(int x[],int *top,int num)
{
if(*top==(MAX-1))
printf("Stack is full");
else
{
*top=*top+1;
x[*top]=num;
}
}

void pop(int x[],int *top)
{
if(*top==-1)
printf("Stack is empty");
else{
printf("value at top is %d",x[*top]);
*top=*top-1;
}
}

void display(int x[],int *top)
{
for(int i=*top;i>=0;i--)
printf("%d\t",x[i]);
}


