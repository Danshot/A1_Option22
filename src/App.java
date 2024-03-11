import java.io.IOException;
import java.awt.image.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class App extends Application {
    @Override
    public void start(Stage primaryStage){
        // Button btn = new Button();
        // btn.setText("hello");
        // btn.setOnAction(new EventHandler<ActionEvent>() {

        //     @Override
        //     public void handler(ActionEvent event){
        //         System.out.println("Hello");
        //     }
        // });
        // btn.setOnAction(new EventHandler<ActionEvent>(){
        //     @Override
        //         public void handle(ActionEvent event){
        //             System.out.println("Урааааааааааааа");
        //         }
        // });

        // StackPane root = new StackPane();
        // root.getChildren().add(btn);

        // Scene scene = new Scene(root,300,250);
        // primaryStage.setTitle("Калькулятор");
        // primaryStage.setScene(scene);
        // primaryStage.show();

        Parent root;
      
            try {
                root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
                Scene scene = new Scene(root,700,550);
                primaryStage.getIcons().add(new Image("a1.png"));
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
               
                e.printStackTrace();
            }
            
        
      
    }
    public static void main(String[] args) throws Exception {
       launch(args);
    }
}
