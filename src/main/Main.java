package main;


import controller.LoguinController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Main extends Application {
	private MediaPlayer mediaPlayer;
	
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("../view/loguin.fxml"));
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/loguin.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setTitle("Proyecto Pokémon");
        primaryStage.setScene(scene);
        
        LoguinController controller = loader.getController();
        controller.setStage(primaryStage);
        
        primaryStage.show();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}