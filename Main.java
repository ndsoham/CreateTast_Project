package com.example.whiplash;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        FileInputStream input = new FileInputStream("src/main/images/Game Background.jpg");
        Image image = new Image(input);
        vBox.setBackground(new BackgroundImage(image));
        Button button = new Button();
        Scene scene = new Scene(vBox,300,300 );
        stage.setTitle("Whiplash Game Application");
        stage.setScene(scene);
        stage.setWidth(1437.75);
        stage.setHeight(810);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args){
        launch(args);
    }
}
