 package com.calc.inst_work_calc;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

 public class Controller {
    @FXML
    private TextField squareField;
    @FXML
    private TextField heightField;
    private Alert alert = new Alert(Alert.AlertType.ERROR);
    public void onHelloButtonClick() {
        calcWalls(squareField.getText(), heightField.getText());
    }
    private int checkInt(String num){
        try{
            return Integer.parseInt(num);
        }catch (Exception e){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Введите число!");
            alert.showAndWait();
            return 0;
        }
    }
    public void calcWalls(String square, String height){
        //Добавить отделку
        alert.setAlertType(Alert.AlertType.INFORMATION);
        alert.setTitle("Стены");
        int squareTmp = checkInt(squareField.getText());
        int heightTmp = checkInt(heightField.getText());
        if (squareTmp != 0 || heightTmp != 0){
            alert.setContentText("Square:" + Math.round(Math.sqrt(squareTmp)) * heightTmp);
            alert.showAndWait();
        }
    }
}