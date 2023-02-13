/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3Ex12;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author MUON
 */
public class BorderLayout extends JFrame{
    private JLabel name, units, grade, center, south;
    private ImageIcon cImg;
    private JButton button1, button2;
    public Subject displayedSubject;
    
    public BorderLayout(){
        super("BorderLayout Example");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new java.awt.BorderLayout());
        
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        Subject displayedSubject = physics;
               
        name = new JLabel(displayedSubject.getName(), JLabel.CENTER);
        name.setForeground(Color.red);
        name.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        units = new JLabel("Units: " + String.valueOf(displayedSubject.getUnits()), JLabel.CENTER);
        grade = new JLabel("Grade: " + String.valueOf(displayedSubject.getGrade()), JLabel.CENTER);
        cImg = new ImageIcon(getClass().getResource(displayedSubject.getImgFileName()));
        center = new JLabel(cImg, JLabel.CENTER);
        button1 = new JButton("Next"); 
                    
        this.add(name, java.awt.BorderLayout.NORTH);
        this.add(units, java.awt.BorderLayout.WEST);
        this.add(grade, java.awt.BorderLayout.EAST);
        this.add(center, java.awt.BorderLayout.CENTER);
        this.add(button1, java.awt.BorderLayout.SOUTH);
        this.setSize(400, 400);
    }
}
