/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changescenes;

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

import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tiam Abderezai
 */
public class First_SceneController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    // Method "loadSecondScene" loads "Second_Scene.fxml"
    @FXML
    public void loadSecondScene(ActionEvent event) throws IOException {
            Parent loadParentMain = FXMLLoader.load(getClass().getResource("Second_Scene.fxml"));
            Scene loadSceneMain = new Scene(loadParentMain);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(loadSceneMain);
            window.show();
    }
    
}
