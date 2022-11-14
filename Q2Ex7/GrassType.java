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
public class GrassType extends Monster{
    public GrassType(String name, int hp, int base){
        super(name, "grass", "water", "fire", hp, base);
    }   
    
    @Override
    public void rest(){
        hp += 0.5*maxHP;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
    
    @Override
    public void special(){
        hp += 0.20*maxHP;
    }
}
