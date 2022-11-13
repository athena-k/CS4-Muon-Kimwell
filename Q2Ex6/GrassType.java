/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2Ex6;

/**
 *
 * @author Athena Kimwell
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
