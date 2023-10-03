package com.example.layoutmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class Application_Calculator extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        BorderPane pane = new BorderPane();
        GridPane grid = new GridPane();

        //tạo textfield và set nó ở trên top
        TextField textField = new TextField();
        pane.setTop(textField);

        //set grid vào center của border
        pane.setCenter(grid);





       //Tạo nút
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnPlus = new Button("+");
        Button btnMinus = new Button("-");
        Button btnMulti = new Button("*");
        Button btnDivi = new Button("/");
        Button btnEqual = new Button("=");
        Button btnDot = new Button(".");


        //Add mấy nút này vào vị trí cell của grid
        //Làm cột đầu tiên trước
        grid.add(btn7,0,0);
        grid.add(btn4,0,1);
        grid.add(btn1,0,2);
        grid.add(btnDot,0,3);
        //cột thứ 2
        grid.add(btn8,1,0);
        grid.add(btn5,1,1);
        grid.add(btn2,1,2);
        grid.add(btn0,1,3);
        //cột thứ 3
        grid.add(btn9,2,0);
        grid.add(btn6,2,1);
        grid.add(btn3,2,2);
        grid.add(btnEqual,2,3);
        //cột cuối
        grid.add(btnPlus,3,0);
        grid.add(btnMinus,3,1);
        grid.add(btnMulti,3,2);
        grid.add(btnDivi,3,3);


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
