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
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String end = "false";
        
        int guesses = 3;
        int x = 1;
        int y = 10;
        
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Higher or Lower! What will you do?");
        System.out.println("- Start game");
        System.out.println("- Change settings");
        System.out.println("- End application");
        
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("Start game")){
            int random = (int) Math.floor(Math.random()*y) + x;
            for(int counter=guesses; counter>=1; counter--){
                System.out.println("You have " + guesses + " guess(es) left. Guess a number between " + x + " and " + y);
                String guess = sc.nextLine();
                int guess1 = Integer.parseInt(guess);
                if(guess1 == random){
                    System.out.println("Congrats, you win!");
                    break;
                }
                
                else if(guess1 > random){
                    System.out.print("Guess lower! ");
                }
                
                else if(guess1 < random){
                    System.out.print("Guess higher! ");
                }
            }
            System.out.println("Game end! Play again (yes/no)?");
            String playAgain = sc.nextLine();
                if (playAgain.equalsIgnoreCase("no")){
                    System.out.println("Thanks for playing!");
                    break;
                }
                
                else if(playAgain.equalsIgnoreCase("yes")){
                }
                
                else {
                    System.out.println("Invalid input. Back to default screen.");
                }
        }
        else if (choice.equalsIgnoreCase("Change settings")){
            System.out.println("What is the lower limit of the randomizer (default is 1)?");
            x = sc.nextInt();
            System.out.println("What is the upper limit of the randomizer (default is 10)?");
            y = sc.nextInt();
            System.out.println("How many guesses are allowed (default is 3)?");
            guesses = sc.nextInt();
        }
        else if (choice.equalsIgnoreCase("End application")){
            System.out.println("Thanks for playing!");
            break;  
        }
        
        else {
            System.out.println("Invalid input. Back to default screen.");
        }        
        }while("false".equalsIgnoreCase(end));
    } 
        
    
}
