package com.company;

import com.sun.net.httpserver.Authenticator;

import java.util.*;

public class Main {
// I made my scanner and array list public static for ease of use
    public static Scanner inpute = new Scanner(System.in);
    public static ArrayList<String> ToDo = new ArrayList<>();

    // below is the add method allowing the user to add a task
    public static void addTask(){
        Scanner inpute = new Scanner(System.in);

        System.out.println("Adding Task:");
        String task = inpute.nextLine();
        ToDo.add(task);
        System.out.println("------SUCCESS------");
    }

    // below is the remove method which also displays the list before removing so the user chooses
    public static void removeTask(){
        Scanner inpute = new Scanner(System.in);

        System.out.println(ToDo);
        System.out.println("Removing Task Number:");
        int taskNum = inpute.nextInt();
        int taskIndex = taskNum - 1;
        ToDo.remove(taskIndex);
        System.out.println("------SUCCESS------");
    }
    // below is the update method which uses the same lines of the add/remove methods but altered a little
    public static void updateTask(){
        Scanner inpute = new Scanner(System.in);
        System.out.println("-----UPDATING-----");
        System.out.println(ToDo);

        System.out.println("Updating Task Number:");
        int taskNum = inpute.nextInt();
        int taskIndex = taskNum - 1;
        ToDo.remove(taskIndex);

        inpute = new Scanner(System.in);
        System.out.println("Insert Replacement Task:");
        String task = inpute.nextLine();
        ToDo.add(task);
        System.out.println("------SUCCESS------");
    }

    public static void main(String[] args) {
        int user = 10;
        ToDo.add("Trash errands");
        ToDo.add("ice cream sunday");
        ToDo.add("Dancing Robot");

        // the menu
        System.out.println("---MENU-------MENU-------MENU----");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");

        System.out.println("what do you want to do?");
        user = inpute.nextInt();

        // a switch case nested inside while loop
        while (user !=0) {

            switch (user) {
                case 1:
                    addTask();
                    System.out.println("what else do you wanna do? (1)add, (2)remove, (3)update, (4)list, (0)exit ");
                    user = inpute.nextInt();
                    break;
                case 2:
                    removeTask();
                    System.out.println("what else do you wanna do? (1)add, (2)remove, (3)update, (4)list, (0)exit ");
                    user = inpute.nextInt();
                    break;
                case 3:
                    updateTask();
                    System.out.println("what else do you wanna do? (1)add, (2)remove, (3)update, (4)list, (0)exit ");
                    user = inpute.nextInt();
                    break;
                case 4:
                    System.out.println(ToDo);
                    System.out.println("what else do you wanna do? (1)add, (2)remove, (3)update, (4)list, (0)exit ");
                    user = inpute.nextInt();
                    break;
                case 0:
                    System.out.println("-----EXITING-----");
                    break;

            }
        }
    }
}
