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
        
        Song d = new Song("Lunod", "Ben&Ben");
        Song e = new Song("The Man", "Taylor Swift");
        
        Singer t = new Singer();
        t.performForAudience(12);
        System.out.println(t.noOfPerformances);
        System.out.println(t.earnings);
        Singer s = new Singer();
        /*s.performForAudience(13);
        System.out.println(s.noOfPerformances);
        System.out.println(s.earnings);*/
    }
    
}
