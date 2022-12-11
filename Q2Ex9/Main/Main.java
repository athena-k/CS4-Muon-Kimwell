/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Athena Kimwell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int notfound = 0;
        int alreadycaptured = 0;
        int fullteam = 0;
        int notinteam = 0;

        Trainer player = new Trainer("Steve");
        Monster m0 = new Monster("Rattata", "Normal", "None", "None", 15, 5);
        Monster m1 = new Monster("Meowth", "Normal", "None", "None", 15, 5);
        Monster m2 = new Monster("Kangaskhan", "Normal", "None", "None", 15, 5);
        Monster m3 = new Monster("Tauros", "Normal", "None", "None", 15, 5);
        Monster m4 = new Monster("Ditto", "Normal", "None", "None", 15, 5);
        Monster m5 = new Monster("Eevee", "Normal", "None", "None", 15, 5);
        Monster m6 = new Monster("Porygon", "Normal", "None", "None", 15, 5);
        Monster m7 = new Monster("Snorlax", "Normal", "None", "None", 15, 5);
        Monster m8 = new Monster("Sentret", "Normal", "None", "None", 15, 5);
        Monster m9 = new Monster("Dunsparce", "Normal", "None", "None", 15, 5);

        String input = "";

        while(!input.equals("exit")){
            System.out.print("What will the trainer do? ");
            input = sc.nextLine();
            Monster selected = null;
            if(input.equals("catch") || input.equals("release")){
                System.out.print("Which monster? ");
                String name = sc.nextLine();
                try {
                    selected = Monster.selectMonster(name);
                } 
                catch (MonsterNotFoundException e) {
                    System.out.println("The monster you selected does not exist.");
                    notfound++;
                }
                catch (Exception e){
                    System.out.println("Something went wrong...");
                }
            }

            switch(input){
                case "catch":
                    try{
                        player.sureCapture(selected);
                    }
                    catch(AlreadyCapturedException e){
                        System.out.println("The monster you selected has already been captured.");
                        alreadycaptured++;
                    }
                    catch(FullTeamException e){
                        System.out.println("You already have a full team of 6.");
                        fullteam++;
                    }
                    catch (Exception e){
                    System.out.println("Something went wrong...");
                    }
                    break;
                case "release":
                    try{
                        player.release(selected);
                    }
                    catch(NotInTeamException e){
                        System.out.println("The monster you selected is not in your team.");
                        notinteam++;
                    }
                    catch (Exception e){
                    System.out.println("Something went wrong...");
                    }
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }

        System.out.printf("Encountered errors:%n"
                + "MonsterNotFoundException: %d%n"
                + "AlreadyCapturedException: %d%n"
                + "FullTeamException: %d%n"
                + "NotInTeamException: %d%n", 
                notfound, alreadycaptured, fullteam, notinteam);
    }    
}
