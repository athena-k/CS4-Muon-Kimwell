/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtest;

/**
 *
 * @author MUON
 */

import javax.swing.*;
import java.awt.*;

public class BasicSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Swing window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450,450);
        
        /* Setting a layout */
        window.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        /* Adding text */
        JLabel sampleText = new JLabel("Sample text");
        sampleText.setForeground(Color.blue);
        sampleText.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        window.add(sampleText);
         
        /* Adding an image */
        JLabel sampleImage = new JLabel();
        ImageIcon img = new ImageIcon(BasicSwing.class.getResource("java_icon.png"));
        sampleImage.setIcon(img);
        sampleImage.setText("java icon");
        sampleImage.setHorizontalTextPosition(JLabel.CENTER);
        sampleImage.setVerticalTextPosition(JLabel.BOTTOM);
        window.add(sampleImage);
        
        /* Adding a button */
        JButton button = new JButton("Click me!");
        ImageIcon icon = new ImageIcon(BasicSwing.class.getResource("click.png"));
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.LEFT);
        window.add(button);
        
        window.setVisible(true);
    }
    
}
