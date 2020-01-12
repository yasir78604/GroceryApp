package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryItemList(){
        System.out.println("You Have " + groceryList.size() + " item in your Grocery List");
        for (int i = 0 ; i < groceryList.size() ;i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryListItem(String currentItem , String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryListItem(position,newItem);
        }
    }
    private void modifyGroceryListItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery List " + (position+1) + " has been modified");
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }
    private int  findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position>=0){
            return true;
        }
        return false;
    }
}
