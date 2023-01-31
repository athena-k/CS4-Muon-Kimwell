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

public class CompressedSwing extends JFrame {
    private JLabel sampleText, sampleImage;
    private JButton button;
    
    public CompressedSwing(String text, String caption, ImageIcon logo, ImageIcon icon){
        super("Compressed Swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,450);
        
        /* Setting a layout */
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        /* Adding text */
        sampleText = new JLabel(text);
        sampleText.setForeground(Color.blue);
        sampleText.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        this.add(sampleText);
         
        /* Adding an image */
        sampleImage = new JLabel();
        sampleImage.setIcon(logo);
        sampleImage.setText("java icon");
        sampleImage.setHorizontalTextPosition(JLabel.CENTER);
        sampleImage.setVerticalTextPosition(JLabel.BOTTOM);
        this.add(sampleImage);
        
        /* Adding a button */
        button = new JButton("Click me!");
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.LEFT);
        this.add(button);
        
        this.setVisible(true);
    }
}
