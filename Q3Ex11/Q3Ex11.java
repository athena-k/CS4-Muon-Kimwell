/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3Ex11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author MUON
 */
public class Q3Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame window = new JFrame("Swing window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450,450);
        
        /* Setting a layout */
        window.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        Subject displayedSubject = math;

        /* Adding text */
        JLabel sampleText = new JLabel(displayedSubject.getName());
        JLabel sampleText1 = new JLabel("Units: " + String.valueOf(displayedSubject.getUnits()));
        sampleText.setForeground(Color.blue);
        sampleText.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        window.add(sampleText);
        window.add(sampleText1);
         
        /* Adding an image */
        JLabel sampleImage = new JLabel();
        ImageIcon img = new ImageIcon(Q3Ex11.class.getResource(displayedSubject.getImgFileName()));
        sampleImage.setIcon(img);
        sampleImage.setText("Grade: " + String.valueOf(displayedSubject.getGrade()));
        sampleImage.setHorizontalTextPosition(JLabel.CENTER);
        sampleImage.setVerticalTextPosition(JLabel.BOTTOM);
        window.add(sampleImage);
        
        /* Adding a button */
        JButton button = new JButton("Next!");
        button.setHorizontalTextPosition(JButton.LEFT);
        window.add(button);
        
        window.setVisible(true);
    }
    
}
