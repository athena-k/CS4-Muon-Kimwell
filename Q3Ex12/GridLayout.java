/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3Ex12;

//import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 *
 * @author MUON
 */
public class GridLayout extends JFrame {
    private ArrayList<JButton> labels;
    private static String[] imgs = {"anemo", "geo", "electro", "dendro", 
        "hydro", "pyro", "cryo"};
    
    public GridLayout(int rows, int cols){
        super("GridLayout Example");
        labels = new ArrayList();
        
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout((LayoutManager) new GridLayout(rows, cols));
        
        outer:
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int index = i*cols+j;
                if(index >= imgs.length) break outer;
                JButton button = new JButton(imgs[index]);
                labels.add(button);
                this.add(button);
            }
        }
    }
}
