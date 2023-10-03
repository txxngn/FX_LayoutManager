package com.example.layoutmanager;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import org.controlsfx.control.spreadsheet.Grid;

public class Column_Constraints extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");
        GridPane pane = new GridPane();

        ColumnConstraints col20p = new ColumnConstraints(); //20 percent
        ColumnConstraints col30p = new ColumnConstraints(); //30 percent

        col20p.setPercentWidth(20);
        col30p.setPercentWidth(30);

        pane.getColumnConstraints().addAll(col20p,col30p,col30p,col20p); //set up 4 cột theo tỉ lệ 20%|30%|30%|20%

        Label title = new Label("Address Input");

        //tạo text field (có thể tạo label trước nhưng cách dưới ngắn hơn (k tạo variable))
        TextField txtAddress1 = new TextField();
        TextField txtAddress2 = new TextField();
        TextField txtCity = new TextField();
        TextField txtProvince = new TextField();
        TextField txtPostal = new TextField();

        //để ý là đang add cột đầu tiên trước
        pane.add(title, 0 , 0, 4, 1);        //add tựa vào cột 0, hàng 0, span 4 cột, span 1 dòng
        pane.add(new Label("Address 1 "), 0 , 1);  //pane không .getChildren.add(); mà add vào cell do pane này đang là GridPane
        pane.add(new Label("Address 2 "), 0 , 2);
        pane.add(new Label("City "), 0 , 3);
        pane.add(new Label("Province "), 0 , 4);
        pane.add(new Label("Postal "), 2 , 4);  //cột index 2, hàng 4 (tức ở vị trí 30%)




        pane.add(txtAddress1, 1 , 1, 3, 1);  //add text fields và span ra
        pane.add(txtAddress2, 1 , 2, 3, 1);
        pane.add(txtCity, 1 , 3, 2, 1);
        pane.add(txtProvince, 1 , 4, 1, 1);
        pane.add(txtPostal, 3 , 4, 1, 1);


        //tạo nút submit và nút clear
        Button btnSubmit = new Button("Submit");
        Button btnClear = new Button("Clear");
        pane.add(btnSubmit, 0,5,2,1);   //nút Submit sẽ ở đúng cột index 0 và span ra 2 cột
        pane.add(btnClear, 2,5,2,1);    //nút Clear sẽ ở đúng cột index 2 và span ra 2 cột




        GridPane.setHalignment(btnSubmit, HPos.CENTER); //xong dòng này sẽ chuyeển nút submit vào giữa cột index 0 và 1
        GridPane.setHalignment(btnClear, HPos.CENTER);  //xong dòng này sẽ chuyeển nút clear vào giữa cột index 2 và 3
        GridPane.setHalignment(title, HPos.CENTER);





        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}