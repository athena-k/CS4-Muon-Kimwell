/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3Ex12;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MUON
 */
public class BorderLayout extends JFrame{
    private JLabel name, units, grade, image;
    private ImageIcon cImg;
    private JButton button1, button2, button3;
    private JPanel test;
    
    public BorderLayout(){
        super("BorderLayout Example");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        Subject displayedSubject = math;
               
        name = new JLabel(displayedSubject.getName(), JLabel.CENTER);
        name.setForeground(Color.red);
        name.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        units = new JLabel("Units: " + String.valueOf(displayedSubject.getUnits()), JLabel.CENTER);
        grade = new JLabel("Grade: " + String.valueOf(displayedSubject.getGrade()), JLabel.CENTER);
        cImg = new ImageIcon(getClass().getResource(displayedSubject.getImgFileName()));
        image = new JLabel(cImg, JLabel.CENTER);
        button1 = new JButton("Back");
        button2 = new JButton("List of Subjects");
        button3 = new JButton("Next");
        
        test = new JPanel();
        test.setLayout(new FlowLayout(FlowLayout.CENTER));
        test.add(button1);
        test.add(button2);
        test.add(button3);
        
        this.add(name, java.awt.BorderLayout.NORTH);
        this.add(units, java.awt.BorderLayout.WEST);
        this.add(grade, java.awt.BorderLayout.EAST);
        this.add(image, java.awt.BorderLayout.CENTER);
        this.add(test, java.awt.BorderLayout.SOUTH);
        this.setSize(350, 400);
    }
}
