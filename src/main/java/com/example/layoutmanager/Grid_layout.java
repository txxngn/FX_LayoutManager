package com.example.layoutmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class Grid_layout extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(5);

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");


/*
        pane.add(btn1, 0, 0);
        pane.add(btn2, 2, 0);//cột,hàng (dọc, ngang)
        pane.add(btn3, 1, 1);
        pane.add(btn4, 0, 2); //cột 0, hàng 2
        pane.add(btn5, 2, 2);
*/

        btn2.setPrefHeight(80);  //lý do set chiều dài cho node là cho UI
        btn5.setPrefWidth(130);     //lý do tương tự
        pane.add(btn1, 0, 0);
        pane.add(btn2, 1, 0, 1, 3); //cột, hàng, cột span, hàng span
        pane.add(btn3, 0, 1);
        pane.add(btn4, 0, 2);
        pane.add(btn5, 0, 4, 2, 1);





        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
