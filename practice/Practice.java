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
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //arrays in java can only contain 1 data type
        int[] listOfNums = {1,2,3};
        double [] listOfDoubles = new double [4]; //no. of indices
        listOfDoubles[0] = 1.2;
        listOfDoubles[1] = 2.2;
        //primitive bc there is a set number of space, cannot change size
        //useful for a constant list of variables ex. months of the year (alwyas 12)
        String[][][] listOfStrings = new String [2][3][4];
        //multidimensional array, whatever that means
        ArrayList<Integer> list1 = new ArrayList();
        //like scanner class !! more flexible than primitive
        //can be <Student> if student class is created, but not <Int>
        list1.add(69);
        //search java se17 for documentation of classes by other ppl
        //includes all methods and other stuff u can do w it
        //so use this to know how to use ArrayList lol
        //netbeans also has documentation <33 but search it up nalang jic
    }
    
}
