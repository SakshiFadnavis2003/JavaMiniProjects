import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApplication {
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String task = scanner.next();
                    addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task to remove: ");
                    String taskToRemove = scanner.next();
                    removeTask(taskToRemove);
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public static void removeTask(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Task not found!");
        }
    }

    public static void displayTasks() {
        if (!tasks.isEmpty()) {
            System.out.println("Tasks:");
            for (String task : tasks) {
                System.out.println(task);
            }
        } else {
            System.out.println("No tasks found!");
        }
    }
}
