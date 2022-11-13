/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2Ex6;

/**
 *
 * @author Athena Kimwell
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
