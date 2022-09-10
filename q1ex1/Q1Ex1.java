/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;

import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Q1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "Athena";
        int age1 = 15;
        String hobby1 = "reading";
        
        String name2 = "Johan";
        int age2 = 13;
        String hobby2 = "gaming";
        
        String name3 = "Aldrei";
        int age3 = 6;
        String hobby3 = "playing with pet dogs";
        
        System.out.println("Sibling 1");
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Hobby: " + hobby1 + "\n");
        
        System.out.println("Sibling 2");
        System.out.println("Name: " + name2);
        System.out.println("Age: " + age2);
        System.out.println("Hobby: " + hobby2 + "\n");
        
        System.out.println("Sibling 3");
        System.out.println("Name: " + name3);
        System.out.println("Age: " + age3);
        System.out.println("Hobby: " + hobby3 + "\n");
        
        
        System.out.print("Johan is the oldest: ");
        System.out.println(age2>age1&&age2>age3);
        System.out.print("Athena is older than Aldrei by how many years: ");
        System.out.println(age1-age3);
        System.out.print("The siblings don't have the same hobbies: ");
        System.out.println(hobby1!=hobby2||hobby1!=hobby3||hobby2!=hobby3);
    }
    
}
