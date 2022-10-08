/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1Ex4;

/**
 *
 * @author Athena Kimwell
 */
public class Sibling {
    private String name;
    private int age;
    private String hobby;
    
    Sibling(String n, int a, String h){
        name = n;
        age = a;
        hobby = h;
    }
    
    public void setHobby(String newHobby){
        this.hobby = newHobby;
    }
    
    public String getHobby(){
        return hobby;
    }
}
