package com.example.layoutmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
public class Hbox extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        HBox pane = new HBox();

        pane.setPadding(new Insets(10,10,10,10));
        pane.setSpacing(5);

        Button btn = new Button();
        for(int i=0; i<8; i++){
            btn = new Button("Button"+i);
            pane.getChildren().add(btn);
            btn.setPrefSize(100,50);
        }




        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
