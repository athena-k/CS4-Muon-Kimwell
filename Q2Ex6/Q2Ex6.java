/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2Ex6;

/**
 *
 * @author MUON
 */
public class Q2Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Square s = new Square();
        Rectangle r = s;
        Square q = (Square)r; <-- casting, forcing rectangle to be a square
        (this does not always work)
        */
        FireType f = new FireType("Charlie", 400, 100);
        GrassType g = new GrassType("Garden", 600, 75);
        WaterType w = new WaterType("Misty", 500, 90);
        
        do{
            f.attack(g);
            g.attack(f);
        }while(g.hp>0||f.hp>0);
    }
    
}
