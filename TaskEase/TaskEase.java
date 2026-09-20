import java.util.ArrayList;
import java.util.Scanner;

public class TaskEase {

    static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<Boolean> completed = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=================================");
        System.out.println("            TASK EASE");
        System.out.println("        Simple Task Manager");
        System.out.println("=================================");

        do {
            System.out.println();
            System.out.println("---------- MENU ----------");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Edit Task");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();

                    tasks.add(task);
                    completed.add(false);

                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("\n---------- YOUR TASKS ----------");

                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {

                            String status;

                            if (completed.get(i)) {
                                status = "[DONE]";
                            } else {
                                status = "[PENDING]";
                            }

                            System.out.println(
                                (i + 1) + ". " +
                                status + " " +
                                tasks.get(i)
                            );
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to complete.");
                    } else {
                        System.out.print("Enter task number to complete: ");
                        int taskNumber = scanner.nextInt();

                        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                            completed.set(taskNumber - 1, true);
                            System.out.println("Task marked as completed!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.print("Enter task number to delete: ");
                        int taskNumber = scanner.nextInt();

                        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            completed.remove(taskNumber - 1);

                            System.out.println("Task deleted successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 5:
    if (tasks.isEmpty()) {
        System.out.println("No tasks to edit.");
    } else {
        System.out.print("Enter task number to edit: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            System.out.print("Enter new task: ");
            String newTask = scanner.nextLine();

            tasks.set(taskNumber - 1, newTask);

            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
    break;

case 6:
    System.out.println("\nThank you for using TaskEase!");
    break; System.out.println("\nThank you for using TaskEase!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        scanner.close();
    }
}