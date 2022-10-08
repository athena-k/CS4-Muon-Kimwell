/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1Ex4;

/**
 *
 * @author Athena Kimwell
 */
public class Q1Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sibling a = new Sibling("Athena", 15, "reading");
        Sibling b = new Sibling("Aldrich", 13, "gaming");
        Sibling c = new Sibling("Aldrei", 6, "playing with the pet dogs");
        //3 instances of my Sibling class
        
        System.out.println("Old hobby: " + b.getHobby());
        b.setHobby("playing guitar");
        System.out.println("New hobby: " + b.getHobby());
        //getter and setter methods
        
        Song d = new Song("Lunod", "Ben&Ben");
        Song e = new Song("The Man", "Taylor Swift");
        //2 instances of Song class
        
        Singer f = new Singer("Athena", 0, 0, d);
        System.out.print(f.name + " is our performer. They have done " + f.noOfPerformances + " performances. ");
        System.out.println("They have a total of " + f.earnings + " in earnings and their favorite song is " + f.favoriteSong.title + " by " + f.favoriteSong.artist + ".");
        f.performForAudience(12);
        f.changeFavSong(e);
        
        Singer g = new Singer("Gabrielle", 0, 0, e);
        g.performForAudience(12, f);
        System.out.println("All singers have done a combined total of " + g.getTotalPerformances() + " performances.");
        System.out.println(f.name + " has earned " + f.earnings + " dollars.");
        System.out.println(g.name + " has earned " + g.earnings + " dollars.");
    }
    
}
