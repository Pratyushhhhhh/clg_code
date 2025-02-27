import java.util.*;

class Bank {
    double accbal;

    Bank() {
        accbal = 10000;
    }

    void display() {
        System.out.println("Updated Balance is: " + accbal);
    }

    void deposit(double m) {
        accbal += m;
        display();
    }

    void withdraw(double w) {
        if (w > accbal) {
            System.out.println("Invalid amount, Low balance");
        } else {
            accbal -= w;
            display();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Bank obj = new Bank(); 
        while (true) {
            System.out.println("\nEnter:");
            System.out.println("1 to see the balance");
            System.out.println("2 for deposit");
            System.out.println("3 for withdrawal");
            System.out.println("Any other number to exit");

            int ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                    obj.display();
                    break;

                case 2:
                    System.out.println("Enter amount to be deposited:");
                    double amt = sc.nextDouble();
                    obj.deposit(amt);
                    break;

                case 3:
                    System.out.println("Enter amount to be withdrawn:");
                    double withdrawAmt = sc.nextDouble();
                    obj.withdraw(withdrawAmt);
                    break;

                default:
                    System.out.println("Exiting...");
                    sc.close(); // Closing scanner
                    System.exit(0); // Fixed exit statement
            }
        }
    }
}
