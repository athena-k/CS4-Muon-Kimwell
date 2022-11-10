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
public class FireType extends Monster{
    public FireType(String name, int hp, int base){
        super(name, "fire", "grass", "water", hp, base);
        atk *= 1.3;
        def *= 0.7;
    }
    
    @Override
    public void special(){
        atk +=2;
        hp -= 0.10*maxHP;
    }
}
