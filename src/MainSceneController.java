import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainSceneController {

    @FXML
    private TextField TxtElements;

    @FXML
    void btnOnClicked(ActionEvent event) {
        System.out.print("Вика пукнула");
    }

}
