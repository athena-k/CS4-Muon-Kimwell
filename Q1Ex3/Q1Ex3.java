/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1Ex3;

/**
 *
 * @author Athena Kimwell
 */
public class Q1Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sibling a = new Sibling("Athena", 15, "reading");
        Sibling b = new Sibling("Aldrich", 13, "gaming");
        Sibling c = new Sibling("Aldrei", 6, "playing with the pet dogs");
        //3 instances of my Sibling class
        
        Song d = new Song("Lunod", "Ben&Ben");
        Song e = new Song("The Man", "Taylor Swift");
        //2 instances of Song class
        
        Singer f = new Singer("Athena", 0, 0, d);
        System.out.print(f.name + " is our performer. They have done " + f.noOfPerformances + " performances. ");
        System.out.println("They have a total of " + f.earnings + " in earnings and their favorite song is " + f.favoriteSong.title + " by " + f.favoriteSong.artist + ".");
        f.performForAudience(12);
        f.changeFavSong(e);
    }
    
}
