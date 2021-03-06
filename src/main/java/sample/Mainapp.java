package sample;


import com.sun.security.auth.NTSidPrimaryGroupPrincipal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Mainapp extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage stage = primaryStage;

        Parent fxmlMain = FXMLLoader.load(getClass().getResource("/fxml/Principal.fxml"));
        Scene mainScene = new Scene(fxmlMain);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("20 Dice");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        launch(args);
    }

}