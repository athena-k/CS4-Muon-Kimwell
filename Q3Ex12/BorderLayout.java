/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3Ex12;

import java.awt.Color;
import java.awt.Font;
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
    private JButton button;
    
    public BorderLayout(){
        super("BorderLayout Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new java.awt.BorderLayout());
        
        name = new JLabel("CS", JLabel.CENTER);
        name.setForeground(Color.red);
        name.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        units = new JLabel("Units: 1", JLabel.CENTER);
        grade = new JLabel("Grade: 1.5", JLabel.CENTER);
        cImg = new ImageIcon(getClass().getResource("computer science.png"));
        button = new JButton("CS");
        button.setHorizontalTextPosition(JButton.LEFT);        
        center = new JLabel(cImg, JLabel.CENTER);
        
        this.add(name, java.awt.BorderLayout.NORTH);
        this.add(units, java.awt.BorderLayout.WEST);
        this.add(grade, java.awt.BorderLayout.EAST);
        this.add(center, java.awt.BorderLayout.CENTER);
        this.add(button, java.awt.BorderLayout.SOUTH);
        this.setSize(400, 400);
    }
}
