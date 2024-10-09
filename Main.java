import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String taskName = "";
        String dueDate = "";
        //boolean vc = true;
        TaskName tn = new TaskName(taskName, dueDate);

        System.out.println("please enter your name");
        String name = sc.nextLine();
        System.out.println("Welcome to Todo list app, " + name);



            do {
                System.out.println("choose an option: ");
                System.out.println("1. enter a task");
                System.out.println("2. remove a task");
                System.out.println("3. update a task");
                System.out.println("4. list all tasks");
                System.out.println("5. exit");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("enter number of tasks");
                        int i = sc.nextInt();
                        for (int j = 0; j < i; j++) {
                            tn.getTaskName();
                            //sc.nextLine();
                            tn.getDueDate();
                        }
                        break;
                    case 2:
                        System.out.println("remove a task");
                        tn.removeTaskName();
                        break;
                    case 3:
                        tn.updateTaskName();
                        break;
                    case 4:
                        tn.printTaskName();
                        break;
                    case 5:
                        System.out.println("exit");
                        System.exit(0);
                }
            } while(true);
        }


    }

