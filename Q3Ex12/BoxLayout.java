/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3Ex12;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author MUON
 */
public class BoxLayout extends JPanel{
    private JPanel container;
    private ArrayList<JLabel> labels;
    
    public BoxLayout(ArrayList<ImageIcon> icons, int orientation){
        container = new JPanel();
        javax.swing.BoxLayout layout =  new javax.swing.BoxLayout(container, orientation);
        container.setLayout(layout);
        
        labels = new ArrayList();
        for(ImageIcon i : icons) {
            JLabel label  = new JLabel(i, JLabel.CENTER);
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            label.setAlignmentY(Component.CENTER_ALIGNMENT);
            label.setBorder(new EmptyBorder(10,10,10,10));
            labels.add(label);
            container.add(label);
            this.add(container);
        }
    }
}
