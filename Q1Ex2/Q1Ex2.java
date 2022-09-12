/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1Ex2;

import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Q1Ex2 {
    /*String name;
    int id, friendship;
    double grade;
    Q1Ex2 bff;
    
    public void Q1Ex1(){
        System.out.printf("A new god has joined the server");
    }
    
    this runs for every Q1Ex1, if u want to make student give name
    public void Q1Ex1(String name){
        this.name = name;
        friendship = 0;
    }
            
    public void introduce(){
    System.out.printf("Hi im %s", name);
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        //class is identical to filename (new file)
        //functions are attached to their classes
        //call the function with the object in mind
        //only 1 main method ie starting point
        //tidies up the code (remember ex01 haha)
        //can put an object inside an object (all students have bffs sanaol)
        
        System.out.println("Let's play Higher or Lower! What will you do?");
        System.out.println("- Start game");
        System.out.println("- End application");
        
        int guesses = 3;
        int x = 0;
        int y = 10;
        String choice = sc.nextLine();
        //put a dowhile while playAgain is yes or choice is not end application 
        if(choice.equalsIgnoreCase("Start game")){
            int random = (int) Math.floor(Math.random()*y) + 1;
            while(guesses != 0){
                //System.out.println(random);
                System.out.println("You have " + guesses + " guess(es) left. Guess a number between " + x + " and " + y);
                int guess = sc.nextInt();
                if(guess == random){
                    System.out.println("Congrats, you win!");
                    break;
                }
                else if(guess > random){
                    System.out.print("Guess lower! ");
                }
                
                else if(guess < random){
                    System.out.print("Guess higher! ");
                }
                guesses--;
            }
            System.out.println("Game end! Play again (yes/no)?");
            String playAgain = sc.nextLine();
            if (playAgain.equalsIgnoreCase("yes")){
                
            }
            else if(playAgain.equalsIgnoreCase("no")){
            
            }
        }
        else if (choice.equalsIgnoreCase("End application")){
            System.out.println("Thanks for playing!");
        }
    }   
        
    
}
