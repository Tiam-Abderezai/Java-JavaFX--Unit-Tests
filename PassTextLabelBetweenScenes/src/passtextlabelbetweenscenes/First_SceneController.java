
package passtextlabelbetweenscenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import static javafx.fxml.FXMLLoader.load;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

/**
 * @author Tiam Abderezai
 */
public class First_SceneController implements Initializable {


    @FXML
    private TextField textInput;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    // Method "loadSecondScene" loads "Second_Scene.fxml"
    @FXML
    public void passText(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Second_Scene.fxml"));
        Parent root = (Parent) loader.load();

        Second_SceneController secondController = loader.getController();
        // Statement below uses "populateLabel()" from "Second_SceneController"
        // to extract "textInput" from "First_SceneController"
        secondController.populateLabel(textInput.getText());

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();

    }

}
