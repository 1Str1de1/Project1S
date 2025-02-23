package OOP.New;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class ToDoListMain {
    public static void main(String[] args) {

        String command;
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<String> completedTasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList(tasks, completedTasks, scanner);

        System.out.println("Добро пожаловать в To-Do-List!");

        do {
            System.out.println("Выберите команду: \n" +
                    "1: Просмотреть список задач.\n" +
                    "2: Добавить новую задачу.\n" +
                    "3: Пометить задачу как выполненную. \n" +
                    "4: Удалить задачу.\n" +
                    "5: Просмотреть список выполненных задач.\n" +
                    "0: Выйти из программы.");

            command = scanner.nextLine();
            switch (command) {

                case "1":
                    System.out.println(tasks);
                    break;

                case "2":
                    toDoList.addTask();
                    break;

                case "3":
                    toDoList.markCompleted();
                    break;

                case "4":
                    toDoList.removeTask();
                    break;

                case "5":
                    System.out.println(completedTasks);
                    break;

                default:
                    System.out.println("Команда не распознана. Попробуйте ещё раз.");
            }
        } while(!(command.equals("0")));

    }
}
class ToDoList {

    ArrayList<String> taskList;
    ArrayList<String> completedList;
    Scanner sc;

    ToDoList(ArrayList<String> taskList, ArrayList<String> completedList, Scanner sc) {
        this.taskList = taskList;
        this.completedList = completedList;
        this.sc = sc;
    }

    public void addTask() {

        System.out.println("Введите название задачи. ");

        taskList.add(sc.nextLine());

    }

    public void markCompleted() {

        System.out.println("Текущие задачи: \n" + taskList + "\nВведите полное название задачи, которую вы выполнили. ");

        String temp = sc.nextLine();

        for (String strings: taskList) {

            if (temp.equalsIgnoreCase(strings)) {
                taskList.remove(strings);
                completedList.add(temp);
                temp = "";
                System.out.println("Задача успешно выполнена!");
                break;
            }
        }

        if (!temp.isEmpty()) {
            System.out.println("Задача не найдена или произошла ошибка. Попробуйте ещё раз.");
        }

    }

    public void removeTask() {

        System.out.println("Текущие задачи: \n" + taskList + "\nВведите полное название задачи, которую вы хотите удалить. ");

        String temp = sc.nextLine();

        for (String strings : taskList) {

            if (temp.equalsIgnoreCase(strings)) {

                taskList.remove(strings);
                temp = "";
                System.out.println("Задача успешно удалена!");
                break;
            }
        }

        if (!temp.isEmpty()) {
            System.out.println("Задача не найдена или произошла ошибка. Попробуйте ещё раз.");
        }
    }
}
