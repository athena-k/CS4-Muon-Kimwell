/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q2Ex6;

/**
 *
 * @author Athena Kimwell
 */
public class Q2Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FireType f = new FireType("Fennekin", 100, 100);
        GrassType g = new GrassType("Chespin", 300, 75);
        WaterType w = new WaterType("Froakie", 200, 90);
        
        do{
            g.attack(f);
            f.attack(g);            
        }while(f.hp!=0 && g.hp!=0);
        
        System.out.println();
        f.resetHealth();
        g.resetHealth();
        
        do{
            w.attack(g);
            g.attack(w);
        }while(g.hp!=0 && w.hp!=0);
        
        System.out.println();
        g.resetHealth();
        w.resetHealth();
        
        do{
            f.attack(w);
            w.attack(f);
        }while(w.hp!=0 && f.hp!=0);
    }
    
}
