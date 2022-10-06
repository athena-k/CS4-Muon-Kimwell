/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;

/**
 *
 * @author MUON
 */
public class practiceClass1 {
    private static ArrayList<practiceClass1> studentList = new ArrayList();
    private static String name;
    
    public void Student(String name){
        name = this.name;
        studentList.add(this);
    }
    
    public static practiceClass1 getStudent(int index){
        return studentList.get(index);
        //can use a for loop to print everyone
        //arrays have a more streamlined one tho
    }
    
    public static practiceClass1 getStudent(String search){
        for (practiceClass1 s : studentList){
            if(s.name.equals(search)){
                return s;
            }
        }
        return null; //returns nothing if loop can't find student s so no error
    }
}
