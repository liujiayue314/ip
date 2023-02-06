package main;

import java.util.ArrayList;

import task.Task;

/**
 * Class the takes input from user and output messages to user.
 */
public class Ui {
    private static StringBuilder str;
    /**
     * Constructs Ui.
     */
    public Ui() {
        str = new StringBuilder();
    }

    /**
     * Output goodbye messages to users when programme ends.
     */
    public static void outputExit() {
        str.append("Bye. Hope to see you again soon!\n");
    }


    /**
     * Output a first blank line.
     */
    public void startOfInput() {
        str.setLength(0);
    }

    /**
     * Output a last blank line.
     * @return A stringBuilder that contains all output to be printed.
     */
    public String endOfInput() {
        return str.toString();
    }

    /**
     * Outputs details of the task that is added.
     * @param t Task that is added.
     */
    public void outputAddTask(Task t) {
        str.append("Got it. I've added this task:\n");
        str.append(t + "\n");
    }

    /**
     * Outputs details of the task that is marked as done.
     * @param t Task that is marked as done.
     */
    public void outputTaskDone(Task t) {
        str.append("Nice! I've marked this task as done:\n");
        str.append(t + "\n");
    }

    /**
     * Outputs details of the task that is marked as not done.
     * @param t Task that is marked as not done.
     */
    public void outputTaskNotDone(Task t) {
        str.append("OK, I've marked this task as not done yet:\n");
        str.append(t + "\n");
    }

    /**
     * Outputs details of the task that is deleted.
     * @param t Task that is deleted.
     */
    public void outputDeleteTask(Task t) {
        str.append("Noted. I've removed this task:\n");
        str.append(t + "\n");;
    }

    /**
     * Outputs details of all the tasks.
     * @param taskList List of tasks.
     */
    public void outputListTask(TaskList taskList) {
        str.append("You have ").append(taskList.getTotalNumberOfTask()).append(" tasks in the list.\n");
        for (int i = 0; i < taskList.getTotalNumberOfTask(); i++) {
            str.append(i + 1 + "." + taskList.getTaskAtIndex(i) + "\n");
        }
    }

    /**
     * Outputs details of tasks that is searched.
     *
     * @param taskList List of tasks searched.
     */
    public void outputFindTask(ArrayList<Task> taskList) {
        str.append("Here are the matching tasks in your list:\n");
        for (int i = 0; i < taskList.size(); i++) {
            str.append(i + 1 + "." + taskList.get(i) + "\n");
        }
    }

    /**
     * Outputs details of why an exception is raised.
     * @param message Details of why an exception is raised.
     */
    public void outputError(String message) {
        str.append(message);
    }
}
