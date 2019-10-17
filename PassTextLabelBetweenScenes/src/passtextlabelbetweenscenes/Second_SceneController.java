
package passtextlabelbetweenscenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * @author Tiam Abderezai
 */
public class Second_SceneController implements Initializable {

    @FXML
    private Label labelOutput;
     /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       labelOutput.getText();
       // TODO
         
    }    

    // Method "loadSecondScene" loads "Second_Scene.fxml"
    @FXML
    public void loadFirstScene(ActionEvent event) throws IOException {
            Parent loadParentMain = FXMLLoader.load(getClass().getResource("First_Scene.fxml"));
            Scene loadSceneMain = new Scene(loadParentMain);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(loadSceneMain);
            window.show();
    }
    
    // Method "populateLabel()" is used by "First_SceneController" to extract
    // and display "textInput" from "First_SceneController" onto "labelOutput"
    // Label object of "Second_SceneController" in "Second_Scene.fxml"
  public void populateLabel(String text) {
  labelOutput.setText(text);
  }

    
}
