import java.util.ArrayList;

public class TaskName {
    private static String taskName;
    private String dueDate;
    public int num;


    ArrayList<String> task = new ArrayList<>();
    ArrayList<String> task1 = new ArrayList<>();

    public TaskName(String taskName, String dueDate) {
        TaskName.taskName = taskName;
        this.dueDate = dueDate;

    }

    public void getTaskName() {
        System.out.println("Please enter your task name");
        taskName = System.console().readLine();
        task.add(taskName);

    }

    public void getDueDate() {
        System.out.println("Please enter your time");
        dueDate = System.console().readLine();
        task1.add(dueDate);

    }

    public String setTaskName() {
        return taskName;
    }

    public String setDueDate() {
        return dueDate;
    }

    public void removeTaskName() {
        printTaskName();
        System.out.println("which task you want to remove?");
        num = Integer.parseInt(System.console().readLine());
        for (int j = 1; j <= task.size(); j++) {
            if (j == num) {
                task.remove(j);
                task1.remove(j);
            }
        }
    }

    public void updateTaskName() {
        System.out.println("which task you want to update?");
        num = Integer.parseInt(System.console().readLine());
        for (int j = 0; j <= task.size(); j++) {
            if (j == num) {
                System.out.println("what do you want to update? (name/time)");
                String up = System.console().readLine();
                if (up.equals("name")) {
                    System.out.println("please enter new task name");
                    String newName = System.console().readLine();
                    task.set(j, newName);
                } else if (up.equals("time")) {
                    System.out.println("please enter new time");
                    String newTime = System.console().readLine();
                    task1.set(j, newTime);
                }

            }
        }
    }



        public void printTaskName () {
            System.out.println("this is your tasks");
            for (int i = 0; i < task.size(); i++) {
                System.out.println(i + ". " + task.get(i) + "->" + task1.get(i));

            }
        }

    }

