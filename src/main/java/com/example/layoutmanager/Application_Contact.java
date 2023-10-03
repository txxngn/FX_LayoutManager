package com.example.layoutmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class Application_Contact extends Application{
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test");

        BorderPane BorderOut= new BorderPane();
        BorderPane BorderIn = new BorderPane();
        GridPane grid = new GridPane();
        HBox hBox = new HBox();


        Label lblName = new Label("Name: ");
        Label lblNumber = new Label("Number: ");
        Label lblAddress = new Label("Address: ");
        Label lblEmail = new Label("Email: ");
        TextField txtName = new TextField();
        TextField txtNumber = new TextField();
        TextField txtAddress = new TextField();
        TextField txtEmail = new TextField();
        grid.add(lblName, 0,0,1,1);
        grid.add(lblNumber, 0,1,1,1);
        grid.add(lblAddress, 0,2,1,1);
        grid.add(lblEmail, 0,3,1,1);
        grid.add(txtName, 1,0,3,1);
        grid.add(txtNumber, 1,1,3,1);
        grid.add(txtAddress, 1,2,3,1);
        grid.add(txtEmail, 1,3,3,1);

        //Tạo 3 nút và text area
        Button btnSave = new Button("Save");
        Button btnNext = new Button("Next");
        Button btnPrevious = new Button("Previous");
        TextArea taDisplay = new TextArea();


        BorderIn.setTop(grid);       //Border trong: top là GridPane
        BorderIn.setBottom(taDisplay); //Border trong: bot là TextArea
        BorderIn.setRight(btnSave);    //Border trong: phải là nút Save

        BorderOut.setCenter(BorderIn);                  //Border ngoài có center là Border trong
        BorderOut.setTop(new Label("Contact"));      //border ngoài có top là chữ Contact


        hBox.setPadding(new Insets(5));
        hBox.setSpacing(5);
        hBox.getChildren().add(btnPrevious);     //add nút cho Hbox
        hBox.getChildren().add(btnNext);
        BorderOut.setBottom(hBox);                //border ngoài có bot là Hbox


        grid.setPadding(new Insets(5));
        grid.setVgap(3);
        grid.setHgap(3);


        Scene scene = new Scene(BorderOut);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}
