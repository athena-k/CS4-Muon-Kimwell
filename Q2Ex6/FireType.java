/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2Ex6;

/**
 *
 * @author Athena Kimwell
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
