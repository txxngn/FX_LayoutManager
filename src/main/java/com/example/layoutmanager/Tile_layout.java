package com.example.layoutmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class Tile_layout extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        TilePane pane = new TilePane();


        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(5);
        pane.setPrefColumns(3);


        Button btn = new Button();
        for(int i=0; i<8; i++){
            btn = new Button("Button"+i);
            pane.getChildren().add(btn);
        }



        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
