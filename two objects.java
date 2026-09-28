import java.util.Scanner;

class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter student 1 name:");
        s1.name = sc.nextLine();

        System.out.println("Enter student 1 marks:");
        s1.marks = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter student 2 name:");
        s2.name = sc.nextLine();

        System.out.println("Enter student 2 marks:");
        s2.marks = sc.nextInt();

        System.out.println("\nStudent 1");
        s1.display();

        System.out.println("\nStudent 2");
        s2.display();
    }
}