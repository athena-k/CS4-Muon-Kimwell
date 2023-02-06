/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3Ex12;

import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author MUON
 */
public class ComplexLayout extends JFrame{
    private JPanel leftPanel, rightPanel;
    private ArrayList<ImageIcon> left, right;
    
    public ComplexLayout(int split){
        super("Complex Layout Example");
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        
        /*left = new ArrayList();
        right = new ArrayList();
        
        String[] imgs = {"biology", "chemistry", "computer science", "math", "physics"};
        
        for(int i=0; i<imgs.length; i++) {
            ImageIcon icon = new ImageIcon(getClass().getResource(imgs[i] + ".png"));
            if(i<split) left.add(icon);
            else right.add(icon);
        }*/
        
        /*JFrame window = new JFrame("Swing window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450,450);
        
        /* Setting a layout //yall i may be stupid but yk idc
        //OKAY!!! idek what layout i wanna use lmao <//3
        //ok so flow is one. theres also grid/box/card/border/etc. and we can combine them. man i need visual examples
        
        window.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        Subject displayedSubject = math;

        /* Adding text 
        JLabel sampleText = new JLabel(displayedSubject.getName());
        JLabel sampleText1 = new JLabel("Units: " + String.valueOf(displayedSubject.getUnits()));
        sampleText.setForeground(Color.blue);
        sampleText.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        window.add(sampleText);
        window.add(sampleText1);
         
        /* Adding an image 
        JLabel sampleImage = new JLabel();
        ImageIcon img = new ImageIcon(Q3Ex11.class.getResource(displayedSubject.getImgFileName()));
        sampleImage.setIcon(img);
        sampleImage.setText("Grade: " + String.valueOf(displayedSubject.getGrade()));
        sampleImage.setHorizontalTextPosition(JLabel.CENTER);
        sampleImage.setVerticalTextPosition(JLabel.BOTTOM);
        window.add(sampleImage);
        
        /* Adding a button 
        JButton button = new JButton("Next!");
        button.setHorizontalTextPosition(JButton.LEFT);
        window.add(button);
        
        window.setVisible(true);*/
    }
}
