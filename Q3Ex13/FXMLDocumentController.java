/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Q3Ex13;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Athena Kimwell
 */
public class FXMLDocumentController implements Initializable {    
    @FXML Label name, unit, grade, label;
    @FXML ImageView icon;
    @FXML TextField searchbox;
            
    @FXML private void prevSearch(){
        try{
            int index = Subject.getSubjectIndex(name.getText());
            int previous = index - 1;
            Subject a = Subject.getElement(previous);
            label.setText("");
            name.setText(String.format(a.getName()));
            unit.setText(String.format("Units: %s", a.getUnits()));
            grade.setText(String.format("Grade: %s", a.getGrade()));
            Image image = new Image(getClass().getResourceAsStream(a.getImgFileName()));
            icon.setImage(image);
        }
        catch(NullPointerException e){
            label.setText("There is no more previous subject.");
        }
    }
    
    @FXML private void nextSearch(){
        try{
            int index = Subject.getSubjectIndex(name.getText());
            int next = index + 1;
            Subject a = Subject.getElement(next);
            label.setText("");
            name.setText(String.format(a.getName()));
            unit.setText(String.format("Units: %s", a.getUnits()));
            grade.setText(String.format("Grade: %s", a.getGrade()));
            Image image = new Image(getClass().getResourceAsStream(a.getImgFileName()));
            icon.setImage(image);
        }
        catch(NullPointerException e){
            label.setText("There is no more next subject.");
        }
    }
    
    @FXML private void attemptSearch(){
        String usr = searchbox.getText();
        try{
            Subject user = Subject.searchSubject(usr);
            label.setText("");
            name.setText(String.format(user.getName()));
            unit.setText(String.format("Units: %s.", user.getUnits()));
            grade.setText(String.format("Grade: %s.", user.getGrade()));
            Image image = new Image(getClass().getResourceAsStream(user.getImgFileName()));
            icon.setImage(image);
        }
        catch(NullPointerException e){
            label.setText("This subject does not exist.");
        }
    }
    
    @FXML private void enterSearch(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER)){
            attemptSearch();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
