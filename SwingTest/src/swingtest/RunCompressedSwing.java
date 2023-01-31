/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtest;

import javax.swing.ImageIcon;

/**
 *
 * @author MUON
 */
public class RunCompressedSwing {
    public static void main(String[] args) {
        ImageIcon logo = new ImageIcon(RunCompressedSwing.class.getResource("kotlin.png"));
        ImageIcon icon = new ImageIcon(RunCompressedSwing.class.getResource("cursor.png"));
        new CompressedSwing("This is an instance of your custom JFrame.", "Kotlin", logo, icon);
    }
}
