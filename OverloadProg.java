import java.util.*;

class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    
    Student(String n) {
        name = n;
        age = 18; 
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class OverloadProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Student s1 = new Student();

        System.out.print("Enter name for student 2: ");
        String name2 = sc.nextLine();
        Student s2 = new Student(name2);

        System.out.print("Enter name for student 3: ");
        String name3 = sc.nextLine();
        System.out.print("Enter age for student 3: ");
        int age3 = sc.nextInt();
        Student s3 = new Student(name3, age3);

        System.out.println("\nStudent Details:");
        s1.display();
        s2.display();
        s3.display();

        sc.close();
    }
}
