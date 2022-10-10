/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1Ex5;

import java.util.ArrayList;

/**
 *
 * @author MUON
 */
public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name){
        // Initialize name to parameter and earnings to zero
        name = this.name;
        earnings = 0;
        // Initialize itemList as a new ArrayList
        ArrayList<Item> itemList = new ArrayList();
        // add 'this' store to storeList
        storeList.add(this);
    }

    public String getName(){
        return name;
    }
    public double getEarnings(){
        return earnings;
    }
    public void sellItem(int index){
        // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
        // get Item at index from itemList and add its cost to earnings
        // print statement indicating the sale
        if(index < itemList.size()){
            earnings += itemList.get(index).getCost();
            System.out.println(itemList.get(index).getName() + " has been sold!");
        }
        else {
            System.out.println("There are only " + itemList.size() + " items in the store.");
        }      
    }
    public void sellItem(String name){
        // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
        // get Item from itemList and add its cost to earnings
        // print statement indicating the sale
        name = this.name;
        for (Item s : itemList){
            if(s.getName().equals(name)){
                earnings += s.getCost();
                System.out.println(name + " has been sold!");
            }
        }
        //how to put the else statement??
    }
    public void sellItem(Item i){
        // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
        // get Item i from itemList and add its cost to earnings
        // print statement indicating the sale
        for (Item s : itemList){
            if(s.equals(i)){
                earnings += s.getCost();
                System.out.println(name + " has been sold!");
            }
        }
    }
    public void addItem(Item i){
        // add Item i to store's itemList
        //there's a problem here apparently?
        itemList.add(i);
    }
    public void filterType(String type){
        // loop over itemList and print all items with the specified type
        for (Item i : itemList){
            if(type == i.getType()){
                System.out.println(i);                
            }
        }
    }
    public void filterCheap(double maxCost){
        // loop over itemList and print all items with a cost lower than or equal to the specified value
        for (Item i : itemList){
            if(maxCost >= i.getCost()){
                System.out.println(i);                
            }
        }
    }
    public void filterExpensive(double minCost){
        // loop over itemList and print all items with a cost higher than or equal to the specified value
        for (Item i : itemList){
            if(minCost <= i.getCost()){
                System.out.println(i);                
            }
        }
    }
    public static void printStats(){
        // loop over storeList and print the name and the earnings'Store.java'
        for (Store s : storeList){
            System.out.println("Name of Store: " + s.getName());
            System.out.println("Earnings: " + s.getEarnings());
        }
    }
}
