package com.example.layoutmanager;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import org.controlsfx.control.spreadsheet.Grid;

public class Border_layout extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        BorderPane pane = new BorderPane();

        Button btnClear = new Button("Clear");
        TextArea ta = new TextArea();
        pane.setTop(btnClear);
        pane.setCenter(ta);





        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
