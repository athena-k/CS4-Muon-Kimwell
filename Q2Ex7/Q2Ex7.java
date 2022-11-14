/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2Ex7;

/**
 *
 * @author MUON
 */
public class Q2Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trainer t = new Trainer("Jason");
        
        FireType f = new FireType("Fennekin", 100, 100);
        GrassType g = new GrassType("Chespin", 300, 75);
        WaterType w = new WaterType("Froakie", 200, 90);
        
        NPC n = new NPC("Professor Vesta");
        
        Location l = new Location("Avidya Forest", "Kalpalata Lotus");
        
        t.inspect(g);
        t.inspect(n);
        t.inspect(l);
    }
    
}
