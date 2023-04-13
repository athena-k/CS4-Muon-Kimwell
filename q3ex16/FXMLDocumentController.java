/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package q3ex16;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
            Subject user = Subject.searchSubject(name.getText());
            int index = Subject.getSubjectIndex(user);
            int previous = index - 1;
            Subject a = Subject.getElement(previous);
            label.setText("");
            name.setText(String.format(a.getName()));
            unit.setText(String.format("Units: %s", a.getUnits()));
            grade.setText(String.format("Grade: %s", a.getGrade()));
            Image image = new Image(getClass().getResourceAsStream("imgs/"+ a.getImgFileName()));
            icon.setImage(image);
        }
        catch(NullPointerException e){
            label.setText("There is no more previous subject.");
        }
    }
    
    @FXML private void nextSearch(){
        try{            
            Subject user = Subject.searchSubject(name.getText());
            int index = Subject.getSubjectIndex(user);
            int next = index + 1;
            Subject a = Subject.getElement(next);
            label.setText(String.format("%s", Subject.getSubjectIndex(name.getText())));
            name.setText(String.format(a.getName()));
            unit.setText(String.format("Units: %s", a.getUnits()));
            grade.setText(String.format("Grade: %s", a.getGrade()));
            Image image = new Image(getClass().getResourceAsStream("imgs/"+ a.getImgFileName()));
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
            label.setText(String.format("%s", Subject.getSubjectIndex(user)));
            name.setText(String.format(user.getName()));
            unit.setText(String.format("Units: %s.", user.getUnits()));
            grade.setText(String.format("Grade: %s.", user.getGrade()));
            Image image = new Image(getClass().getResourceAsStream("imgs/"+ user.getImgFileName()));
            icon.setImage(image);
        }
        catch(NullPointerException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid subject");
            alert.setContentText("This subject does not exist.");
            alert.showAndWait();
        }
    }
    
    @FXML private void enterSearch(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER)){
            attemptSearch();
        }
    }
    
    @FXML public void loadSubject(Subject id){
        try{ 
            label.setText("");
            name.setText(id.getName());
            unit.setText(String.format("Units: %s", id.getUnits()));
            grade.setText(String.format("Grade: %s", id.getGrade()));
            Image image = new Image(getClass().getResourceAsStream("imgs/" + id.getImgFileName()));
            icon.setImage(image);
            
            /*int index = Subject.getSubjectIndex(id);
            label.setText(String.format("%s", index));*/
        }
        catch(NullPointerException e){
            label.setText("This subject does not exist.");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
