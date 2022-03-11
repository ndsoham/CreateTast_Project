package com.example.createtask_project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.io.FileInputStream;

public class Main extends Application {
    public ArrayList<Player> players = new ArrayList<>();
    Game game = new Game();
    @Override
    public void start(Stage stage) throws Exception{
        HBox hBox = new HBox();
        hBox.setSpacing(20);
        VBox vBox1 = new VBox();
        VBox vBox2 = new VBox();
        VBox vBox3 = new VBox();
        VBox vBox4 = new VBox();
        VBox vBox5 = new VBox();
        VBox vBox6 = new VBox();
        stage.setWidth(1437.75);
        stage.setHeight(810);
        stage.setResizable(false);
        Stop[] stops = {new Stop(0.5,Color.MEDIUMPURPLE), new Stop(0.5,Color.BLUE)};
        Scene scene = new Scene(hBox,new RadialGradient(245,0, 1437.75/2,810/2 ,810/2,true, CycleMethod.REPEAT,stops));
        stage.setScene(scene);
        Canvas canvas = new Canvas(1437.75, 810);
//        canvas.getGraphicsContext2D().setFill(Color.rgb(199,106,222));
//        canvas.getGraphicsContext2D().fillRect(1437.75,810,0,0);
//        vBox.getChildren().add(canvas);
        stage.show();
        Button button1 = new Button("Ready Up");
        Button button2 = new Button("Ready Up");
        Button button3 = new Button("Ready Up");
        Button button4 = new Button("Ready Up");
        Button button5 = new Button("Ready Up");
        Button button6 = new Button("Ready Up");
        vBox1.getChildren().add(button1);
        vBox2.getChildren().add(button2);
        vBox3.getChildren().add(button3);
        vBox4.getChildren().add(button4);
        vBox5.getChildren().add(button5);
        vBox6.getChildren().add(button6);
        hBox.getChildren().addAll(vBox1,vBox2,vBox3,vBox4,vBox5,vBox6);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(actionEvent.getSource() == button1){
                    button1.setDisable(true);
                    players.add(new Player("Player 1"));
                }
                if(actionEvent.getSource() == button2){
                    button2.setDisable(true);
                    players.add(new Player("Player 2"));
                }
                if(actionEvent.getSource() == button3){
                    button2.setDisable(true);

                    players.add(new Player("Player 3"));
                }
                if(actionEvent.getSource() == button4){
                    button2.setDisable(true);
                    players.add(new Player("Player 4"));
                }
                if(actionEvent.getSource() == button5){
                    players.add(new Player("Player 5"));
                }
                if(actionEvent.getSource() == button6){
                    players.add(new Player("Player 6"));
                }
            }
        };
        EventType<ActionEvent> event = new EventType<>();
      //  button1.addEventHandler(event,handler);
        button1.setOnAction(handler);
        button2.setOnAction(handler);
        button3.setOnAction(handler);
        button4.setOnAction(handler);
        button5.setOnAction(handler);
        button6.setOnAction(handler);


    }

    public static void main(String[] args) {
        launch(args);
    }



}
