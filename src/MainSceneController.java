import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class MainSceneController implements Initializable {
    // Вид и тип объекта
    @FXML
    private RadioButton rbFlat, rbCottage, rbSecondaryHousing, rbNewBuilding;

    @FXML
    private ToggleGroup typeObject;

    @FXML
    private ToggleGroup viewObject;

    // Монтаж электропроводки, Монтаж системы водоснабжения и канализации, Установка
    // дверей, Монтаж радиаторов
    @FXML
    private RadioButton rdEWy, rdEWn, rbSy, rbSn, rbDy, rbDn, rbRy, rbRn;

    @FXML
    private ToggleGroup mountingE;

    @FXML
    private ToggleGroup mountingV;

    @FXML
    private ToggleGroup installD;

    @FXML
    private ToggleGroup mountingR;

    @FXML // Отделка пола
    private CheckBox chbLaminate, chbBoard, chbTile;

    @FXML // Отделка стен
    private CheckBox chkPaperWallpaper, chbWallpaperForColor, chbWallColor, chbCeramicTiles;

    @FXML // Отделка потолка
    private CheckBox chkColor, chkSingleLevel, chkMultiLevel, chkCeiling;

    @FXML
    private Label lblPrice;

    // Площадь квартиры
    @FXML
    private TextField txtAreaApartment;
    @FXML
    public Slider sliAreaApartment;

    // Высота потолка
    @FXML
    private TextField txtCeilingHeight;
    @FXML
    public Slider sliCeilingHeight;

    int countApartment = 10;
    int elementA;
    int elementB;

    public void updatePrice(ActionEvent event) {

    }
    private void updatelbl() {
        if (elementA != 0 && elementB != 0) {
            int summ = countApartment * (elementA + elementB);
            lblPrice.setText(summ + " руб");
        }
        else{
            if (elementB != 0) {
                lblPrice.setText(countApartment + " руб");
            } else {
                int summ = countApartment * elementA;
                lblPrice.setText(summ + " руб");
            }
        }
        
    }

    public void initialize(URL location, ResourceBundle resources) {
        String numberMatcher = "^-?\\d+$";

        sliAreaApartment.valueProperty()
                .addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    txtAreaApartment.setText((int) new_val.intValue() + "");
                    elementA = Integer.parseInt(txtAreaApartment.getText());
                    updatelbl();
                });
        sliCeilingHeight.valueProperty()
                .addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    txtCeilingHeight.setText((int) new_val.intValue() + "");
                    elementB = Integer.parseInt(txtCeilingHeight.getText());
                    updatelbl();
                });
        txtAreaApartment.textProperty().addListener((ObservableValue<? extends String> ov, String s, String t1) -> {

            if (!t1.isEmpty()) {

                if (!t1.matches(numberMatcher)) {
                    txtAreaApartment.setText(s);
                } else {

                    try {
                        int value = Integer.parseInt(t1);

                        if (value <= sliAreaApartment.getMax()) {
                            txtAreaApartment.setText(value + "");
                            sliAreaApartment.setValue(value);
                        } else {
                            txtAreaApartment.setText(s);
                        }
                    } catch (NumberFormatException e) {
                        txtAreaApartment.setText(s);
                    }
                }
            }

        });
        txtCeilingHeight.textProperty().addListener((ObservableValue<? extends String> ov, String s, String t1) -> {
            if (!t1.isEmpty()) {
                if (!t1.matches(numberMatcher)) {
                    txtCeilingHeight.setText(s);
                } else {
                    try {
                        int value = Integer.parseInt(t1);
                        if (value <= sliCeilingHeight.getMax()) {
                            txtCeilingHeight.setText(value + "");
                            sliCeilingHeight.setValue(value);
                        } else {
                            txtCeilingHeight.setText(s);
                        }
                    } catch (NumberFormatException e) {
                        txtCeilingHeight.setText(s);
                    }
                }
            }
        });

    }
}

// Черновик

// ((observableValue, s, t1) - > {
// if (!t1.isEmpty()) {
// if (!t1.matches(numberMatcher)) {
// textBox.setText(s);
// } else {
// try {
// // тут можете парсить строку как захотите
// int value = Integer.parseInt(t1);
// textBox.setText(value);
// } catch (NumberFormatException e) {
// this.setText(s);
// }
// }
// }
// });
// public void updateSlider(URL arg0, ResourceBundle arg1){
// sliAreaApartment.valueProperty().addListener(new ChangeListener<Number>() {

// public void changed(ObservableValue<? extends Number> arg0, Number arg1,
// Number arg2 ){
// countApartment = (int) sliAreaApartment.getValue();
// txtAreaApartment.setText(Integer.toString(countApartment));
// }
// });
// }
// public final{
// sliAreaApartment.setOnDragDetected(new EventHandler<? super MouseEvent>
// getOnDragDetected());
// }