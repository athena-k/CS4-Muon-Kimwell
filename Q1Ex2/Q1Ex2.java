/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1Ex2;
import java.util.Scanner;
/**
 *
 * @author Athena Kimwell
 */
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //if you dont figure it out tomorrow just suck it up and ask skye :sob:
        //coding is not good for my mental health bestie <33
        //MJ NASAN KAAAA
        String end = "false";
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Higher or Lower! What will you do?");
        System.out.println("- Start game");
        System.out.println("- Change settings");
        System.out.println("- End application");
        
        int guesses = 3;
        int x = 0;
        int y = 10;
        String choice = sc.nextLine();
        //put a dowhile while playAgain is yes or choice is not end application 
        if(choice.equalsIgnoreCase("Start game")){
            int random = (int) Math.floor(Math.random()*y) + x;
            while(guesses != 0){
                //System.out.println(random);
                System.out.println("You have " + guesses + " guess(es) left. Guess a number between " + x + " and " + y);
                guesses--;
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
        }
        else if (choice.equalsIgnoreCase("Change settings")){
            System.out.println("What is the lower limit of the randomizer (default is 0)?");
            x = sc.nextInt();
            System.out.println("What is the upper limit of the randomizer (default is 10)?");
            y = sc.nextInt();
            System.out.println("How many guesses are allowed (default is 3)?");
            guesses = sc.nextInt();
            //di gumana?? hatdog
        }
        else if (choice.equalsIgnoreCase("End application")){
            System.out.println("Thanks for playing!");
            break;
        }
        
        }while("false".equals(end));
    }
    
}
