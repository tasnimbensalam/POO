package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class RegistrationFormController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        Window owner = submitButton.getScene().getWindow();
        if (nameField.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Form Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in  name fields.");
            alert.initOwner(owner);
            alert.show();}
        else if ( emailField.getText().isEmpty() ) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Form Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill in email fields.");
                alert.initOwner(owner);
                alert.show();}
        else  if ( passwordField.getText().isEmpty()) {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Form Error!");
                    alert.setHeaderText(null);
                    alert.setContentText("Please fill in passsword fields.");
                    alert.initOwner(owner);
                    alert.show();
        } else {
           
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Welcome!");
            alert.setHeaderText(null);
            alert.setContentText("Welcome, " + nameField.getText() + "!");
            alert.initOwner(owner);
            alert.show();
        }
    }
}
