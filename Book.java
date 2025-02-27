import java.util.*;
class Book
{
	void getdata(Scanner sc)
	{
	//Scanner sc=new Scanner(System.in);
	String title=sc.nextLine();
	String author=sc.nextLine();
	double price=sc.nextDouble();
	}
	
	void showdata()
	{
	System.out.println("Book name is "+title);
	System.out.println("Book author is "+author);
	System.out.println("Book price is "+price);
	}
}

class main1
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            books[i] = new Book();
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i].setData(sc);
        }

        System.out.println("\nBook Details:");
        for (Book book : books) book.getData();

        Book maxBook = books[0];
        double total = 0;
        for (Book book : books) {
            if (book.price > maxBook.price) maxBook = book;
            total += book.price;
        }

        System.out.println("\nMost Expensive Book:");
        maxBook.getData();
        System.out.println("Total Price: $" + total);
    }
}
