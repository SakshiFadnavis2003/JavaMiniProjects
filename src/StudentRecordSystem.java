import java.util.Scanner;

public class StudentRecordSystem {
    static String[] names = new String[100];
    static int[] ages = new int[100];
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nStudent Record System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    addStudent(name, age);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addStudent(String name, int age) {
        names[count] = name;
        ages[count] = age;
        count++;
        System.out.println("Student added successfully.");
    }

    public static void displayStudents() {
        System.out.println("Student Records:");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
        }
    }
}
