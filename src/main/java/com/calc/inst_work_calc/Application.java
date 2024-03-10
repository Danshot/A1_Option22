package com.calc.inst_work_calc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(Application.class.getResource("main_tab.fxml"));
        Scene scene = new Scene(loader.load(), 800, 500);
        stage.setResizable(false);
        stage.setTitle("Example");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}