/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1Ex3;

/**
 *
 * @author Athena Kimwell
 */
public class Singer {
    public String name;
    public int noOfPerformances;
    public double earnings;
    public Song favoriteSong;
    
    Singer(String newName, int noOP, double e, Song s){
        name = newName;
        noOfPerformances = noOP;
        earnings = e;
        favoriteSong = s;
    }
    
    public void performForAudience(int noOfPeople){
        noOfPerformances += 1;
        earnings += noOfPeople*100;
        System.out.println(name + " performed " + noOfPerformances + " time(s) and earned a total of " + earnings + " dollars.");
    }
    
    public void changeFavSong(Song s){
        favoriteSong = s;
        System.out.println("Favorite song has been changed to " + favoriteSong.title + " by " + favoriteSong.artist + ".");
    }
}
