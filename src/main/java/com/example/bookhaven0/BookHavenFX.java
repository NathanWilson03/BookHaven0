package com.example.bookhaven0;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class BookHavenFX extends Application{

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage)  { // main page mostly front end with some actionHandling

        ImageView bookHavenIMG = new ImageView(new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/cd847377-ad39-45cd-b315-efe75712f3f4/dfjsxml-bd9d95c5-4261-461e-aa7b-1bf8007b8249.jpg/v1/fill/w_894,h_894,q_70,strp/fantasy_library_background__by_enchantedhawke_dfjsxml-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTAyNCIsInBhdGgiOiJcL2ZcL2NkODQ3Mzc3LWFkMzktNDVjZC1iMzE1LWVmZTc1NzEyZjNmNFwvZGZqc3htbC1iZDlkOTVjNS00MjYxLTQ2MWUtYWE3Yi0xYmY4MDA3YjgyNDkuanBnIiwid2lkdGgiOiI8PTEwMjQifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.gbfPwY0npz0jWLuF7xaVUCNIFm9-sncKoRVrtWX89xo"));
        bookHavenIMG.setFitHeight(600);
        bookHavenIMG.setFitWidth(600);




        VBox startPage = new VBox();
        startPage.setStyle("-fx-background-color: #DEB887;");
        startPage.setAlignment(Pos.CENTER);
        Label welcomeLabel = new Label("Welcome or welcome back to BookHaven.\n\nWe are glad to have you!\n");
        welcomeLabel.setContentDisplay(ContentDisplay.CENTER);
        welcomeLabel.setFont(new Font("Tahoma",18));
        welcomeLabel.setTextAlignment(TextAlignment.CENTER);

        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: #FFE4C4; -fx-text-fill: #808000; -fx-font-weight: bold;" +
                " -fx-border-color: black; -fx-border-width: 2px;");
        loginHandlerClass loginHandle = new loginHandlerClass(); // instance of loginHandler

        loginButton.setOnAction(loginHandle); // uses loginHandlerClass to open new VBox();

        Button createButton = new Button("Create Account");
        createButton.setStyle("-fx-background-color: #FFE4C4; -fx-text-fill: #808000; -fx-font-weight: bold;" +
                " -fx-border-color: black; -fx-border-width: 2px;");

        createAccountHandlerClass createAccountHandle = new createAccountHandlerClass();
        createButton.setOnAction(createAccountHandle); // uses createAccountHandlerClass to open new VBox();

        Button adminButton = new Button("Admin");
        adminButton.setStyle("-fx-background-color: #FFE4C4; -fx-text-fill: #808000; -fx-font-weight: bold;" +
                " -fx-border-color: black; -fx-border-width: 2px;");

        adminHandler adminHandle = new adminHandler();
        adminButton.setOnAction(adminHandle);

        startPage.getChildren().addAll(welcomeLabel, bookHavenIMG, loginButton, createButton, adminButton);

        startPage.setSpacing(2.0);

        Scene scene0 = new Scene(startPage, 600,1000);
        stage.setScene(scene0);
        stage.show();




    }
}


// for after user enter their name successfully through login or createAccount


class bookCollectionHandler implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e) {

    }
}





