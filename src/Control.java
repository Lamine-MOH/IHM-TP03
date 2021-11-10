import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Control {

    @FXML
    private Button btn;

    @FXML
    private TextField firstName;

    @FXML
    private Label hello;

    @FXML
    private TextField lastName;

    @FXML
    void submit(ActionEvent event) {
        String fName = firstName.getText();
        String lName = lastName.getText();

        String text = "";

        if (fName.isEmpty()) {
            text = "please fill your first name";
        } else if (lName.isEmpty()) {
            text = "please fill your last name";
        } else {
            text = "Hello " + fName + " " + lName;
        }

        hello.setText(text);
    }

}
