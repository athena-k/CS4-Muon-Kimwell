/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1Ex4;

/**
 *
 * @author Athena Kimwell
 */
public class Singer {
    public String name;
    public int noOfPerformances;
    public double earnings;
    public Song favoriteSong;
    private static int totalPerformances;
    
    Singer(String newName, int noOP, double e, Song s){
        name = newName;
        noOfPerformances = noOP;
        earnings = e;
        favoriteSong = s;
    }
    
    public void performForAudience(int noOfPeople){
        noOfPerformances += 1;
        totalPerformances += 1;
        earnings += noOfPeople*100;
        System.out.println(name + " performed " + noOfPerformances + " time(s) and earned a total of " + earnings + " dollars.");
    }
    
    public void performForAudience(int noOfPeople, Singer other){
        noOfPerformances += 1;
        other.noOfPerformances += 1;
        totalPerformances += 2; //each collab counts as 2 performances, as each Singer does 1 performance
        earnings += noOfPeople*50; //because it was split between two singers
        other.earnings += noOfPeople*50;
        System.out.println(name + " performed with " + other.name + " " + noOfPerformances + " time(s) and earned " + noOfPeople*100 + " dollars, split into " + noOfPeople*50 + " dollars individually.");
    }
    
    public void changeFavSong(Song s){
        favoriteSong = s;
        System.out.println("Favorite song has been changed to " + favoriteSong.title + " by " + favoriteSong.artist + ".");
    }
    
    public static int getTotalPerformances(){
        return totalPerformances;
    }
}
