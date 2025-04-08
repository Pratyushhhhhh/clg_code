/*1.Implement a java program to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely rectangleArea() taking two parameters, squareArea() and circleArea() taking one parameter each. 
Now create another class ‘Area’ containing all the three methods rectangleArea(),squareArea() and circleArea() for printing the area of rectangle, square and circle respectively. Create an object of class Area and call all the three methods.
(Use Runtime Polymorphism)*/

import java.util.*;
abstract class shape
{
	void rectangleArea(int l,int b){};
	void squareArea(int s){};
	void circleArea(int r){};
}
class area extends shape
{

	void rectangleArea(int l, int b)
	{
		int a = l*b;	
		System.out.println("Rectangle Area : "+a);
	}
	void squareArea(int s){
		System.out.println("Square Area :" +(s*s));
	}
	void circleArea(int r){
		System.out.println("Circle Area :" +(3.14*r*r));
	}
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter l b s r ");
	int l = sc.nextInt();
	int b = sc.nextInt();
	int s = sc.nextInt();
	int r = sc.nextInt();
	area ob = new area();
	ob.rectangleArea(l,b);
	ob.squareArea(s);
	ob.circleArea(r);
	}
}
	


