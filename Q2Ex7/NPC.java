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
public class NPC extends Character implements Interactive{
    private String dialog;

    public NPC(String n){
        super(n);
        this.dialog = "Hello, my name is " + n + ".";
    }
    public NPC(String n, Location l){
        super(n, l);
        this.dialog = "Hello, my name is " + n + ".";
    }
    public NPC(String n, String d){
        super(n);
        this.dialog = d;
    }
    public NPC(String n, Location l, String d){
        super(n, l);
        this.dialog = d;
    }
    
    public void interact(){
        System.out.println(dialog);
    }
}
