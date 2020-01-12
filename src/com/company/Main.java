package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); //clear the buffer
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItemList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }
    public static void printInstructions(){
        System.out.println("\nPress  ");
        System.out.println(" \t 0 - To print choice options.");
        System.out.println(" \t 1 - To print the list of Grocery Item");
        System.out.println(" \t 2 - To add an item to the list");
        System.out.println(" \t 3 - To modify the item in the list");
        System.out.println(" \t 4 - To remove an item in the list");
        System.out.println(" \t 5 - To search for an item in the list");
        System.out.println(" \t 6 - To quit the application");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter item name: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter replacement item name: ");
        String newItme = scanner.nextLine();
        groceryList.modifyGroceryListItem(oldItem ,newItme);
    }
    public static void removeItem(){
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem) ){
            System.out.println("Fount " + searchItem + " in our grocery list");
        }else {
            System.out.println(searchItem + " is not found in the shopping list");
        }

    }
}
