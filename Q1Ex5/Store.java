/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1Ex5;

import java.util.ArrayList;

/**
 *
 * @author Athena Kimwell
 */
public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList = new ArrayList();
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name){
        this.name = name;
        earnings = 0;
        ArrayList<Item> itemList;
        storeList.add(this);
    }

    public String getName(){
        return name;
    }
    public double getEarnings(){
        return earnings;
    }
    public void sellItem(int index){
        if(index < itemList.size()){
            earnings += itemList.get(index).getCost();
            System.out.println(itemList.get(index).getName() + " has been sold!");
        }
        else {
            System.out.println("There are only " + itemList.size() + " items in the store.");
        }      
    }
    public void sellItem(String name){
        boolean found = false;
        for (Item i : itemList){
            if(i.getName().equals(name)){
                earnings += i.getCost();
                System.out.println(name + " has been sold!");
                found = true;
            }
        }
        if(!found){
            System.out.println("Sorry, Item was not found.");
        }
    }
    public void sellItem(Item i){
        if(itemList.contains(i)){
            earnings += i.getCost();
            System.out.println(i.getName() + " has been sold!");
        }
        else{
            System.out.println("Sorry, Item was not found.");
        }
    }
    public void addItem(Item i){
        itemList.add(i);
    }
    public void filterType(String type){
        for (Item i : itemList){
            if(type.equals(i.getType())){
                System.out.println(i.getName());                
            }
        }
    }
    public void filterCheap(double maxCost){
        for (Item i : itemList){
            if(maxCost >= i.getCost()){
                System.out.println(i.getName());                
            }
        }
    }
    public void filterExpensive(double minCost){
        for (Item i : itemList){
            if(minCost <= i.getCost()){
                System.out.println(i.getName());                
            }
        }
    }
    public static void printStats(){
        for (Store s : storeList){
            System.out.println("Name of Store: " + s.getName());
            System.out.println("Earnings: " + s.getEarnings());
        }
    }
}
