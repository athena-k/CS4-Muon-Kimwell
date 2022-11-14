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
public class WaterType extends Monster{
    public WaterType(String name, int hp, int base){
        super(name, "water", "fire", "grass", hp, base);
        atk *= 0.7;
        def *= 1.3;
    }
    
    @Override
    public void special(){
        def +=2;
        hp -= 0.10*maxHP;
    }
}
