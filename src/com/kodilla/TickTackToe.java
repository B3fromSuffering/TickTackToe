package com.kodilla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;


public class TickTackToe extends Application{

//    private Image board = new Image("file:resources/tic-tac-toe-board-empty.jpg");
    private Image imageback = new Image("file:resources/tic-tac-toe-pattern-background.jpg");
    private Label score = new Label();
    private Image empty = new Image("file:resources/empty.jpg");

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        ImageView imgbutton1 = new ImageView(empty);
        ImageView imgbutton2 = new ImageView(empty);
        ImageView imgbutton3 = new ImageView(empty);
        ImageView imgbutton4 = new ImageView(empty);
        ImageView imgbutton5 = new ImageView(empty);
        ImageView imgbutton6 = new ImageView(empty);
        ImageView imgbutton7 = new ImageView(empty);
        ImageView imgbutton8 = new ImageView(empty);
        ImageView imgbutton9 = new ImageView(empty);

        Button newGame = new Button("new game");
        Button saveResults = new Button("save results");
        Button exit = new Button("exit");

        Button button01 = ButtonsEditor.newEmptyButton();
        Button button11 = ButtonsEditor.newEmptyButton();
        Button button21 = ButtonsEditor.newEmptyButton();
        Button button02 = ButtonsEditor.newEmptyButton();
        Button button12 = ButtonsEditor.newEmptyButton();
        Button button22 = ButtonsEditor.newEmptyButton();
        Button button03 = ButtonsEditor.newEmptyButton();
        Button button13 = ButtonsEditor.newEmptyButton();
        Button button23 = ButtonsEditor.newEmptyButton();

        List<Button>  buttonsList = new ArrayList<>();

        buttonsList.add(button01);
        buttonsList.add(button11);
        buttonsList.add(button21);
        buttonsList.add(button02);
        buttonsList.add(button12);
        buttonsList.add(button22);
        buttonsList.add(button03);
        buttonsList.add(button13);
        buttonsList.add(button23);

        ComputerMove computerMove = new ComputerMove();



        newGame.setOnAction((e) -> {

            button01.setGraphic(imgbutton1);
            button11.setGraphic(imgbutton2);
            button21.setGraphic(imgbutton3);
            button02.setGraphic(imgbutton4);
            button12.setGraphic(imgbutton5);
            button22.setGraphic(imgbutton6);
            button03.setGraphic(imgbutton7);
            button13.setGraphic(imgbutton8);
            button23.setGraphic(imgbutton9);

            buttonsList.clear();
            buttonsList.add(button01);
            buttonsList.add(button11);
            buttonsList.add(button21);
            buttonsList.add(button02);
            buttonsList.add(button12);
            buttonsList.add(button22);
            buttonsList.add(button03);
            buttonsList.add(button13);
            buttonsList.add(button23);

            button01.setDisable(false);

        });


        button01.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button01, circle);
            button01.setDisable(true);
            buttonsList.remove(button01);

            computerMove.computer(buttonsList.size());

        });

        button11.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button11, circle);
        });

        button21.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button21, circle);
        });

        button02.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button02, circle);
        });

        button12.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button12, circle);
        });

        button22.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button22, circle);
        });

        button03.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button03, circle);
        });

        button13.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button13, circle);
        });

        button23.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button23, circle);
        });




        score.setText("Score");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10, 550, 10, 550));
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setBackground(background);


        grid.add(button01, 0, 1);
        grid.add(button11, 1, 1);
        grid.add(button21, 2, 1);
        grid.add(button02, 0, 2);
        grid.add(button12, 1, 2);
        grid.add(button22, 2, 2);
        grid.add(button03, 0, 3);
        grid.add(button13, 1, 3);
        grid.add(button23, 2, 3);


        grid.add(newGame, 0, 0);
        grid.add(saveResults, 1, 0);
        grid.add(exit, 2, 0);
        grid.add(score, 0, 4);


        Scene scene = new Scene(grid, 1200, 800, Color.BLACK);


        primaryStage.setTitle("TickTackToe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
