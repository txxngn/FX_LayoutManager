package com.example.layoutmanager;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class Flowlayout extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        FlowPane pane = new FlowPane();

        pane.setPadding(new Insets(10)); //padding là gap giữa khung ngoài với nội dung bên trong
        pane.setVgap(4); //gap vertical (trên dưới) giữa CÁC NODES
        pane.setHgap(4); //gap horizontal (ngang) giữa CÁC NODES
        pane.setPrefWrapLength(200); //Độ wrap các nodes của khung


        //dùng loop để tạo nút thay vì hard coding
        /*Hardcoding cấu trúc là : tạo mới + add vao pane
        * Button btn1 = new Button("Button1");
          Button btn2 = new Button("Button2");
          pane.getChildren().add(btn1);
          pane.getChildren().add(btn2);
        */


        Button button = new Button();
        for (int i = 0; i <=8 ; i++){
            button = new Button("Button" + i); //tạo mới
            pane.getChildren().add(button); //add vào pane
            button.setPrefSize(100,50);
        }



        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}




