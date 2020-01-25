package com.kodilla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class TickTackToe extends Application{

    private Image imageback = new Image("file:resources/tic-tac-toe-pattern-background.jpg");
    private Image board = new Image("file:resource/tic-tac-toe-board-empty.jpg");
    private Image circle1 = new Image("file:resource/circle1.jpg");
    private Image circle2 = new Image("file:resource/circle2.jpg");
    private Image circle3 = new Image("file:resource/circle3.jpg");
    private Image circle4 = new Image("file:resource/circle4.jpg");
    private Image circle5 = new Image("file:resource/circle5.jpg");
    private Image cross1 = new Image("file:resource/cross1.jpg");
    private Image cross2 = new Image("file:resource/cross2.jpg");
    private Image cross3 = new Image("file:resource/cross3.jpg");
    private Image cross4 = new Image("file:resource/cross4.jpg");
    private FlowPane boards = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane circles = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane crosses = new FlowPane(Orientation.HORIZONTAL);


    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(20);
        grid.setVgap(0);
        grid.setBackground(background);

        ImageView imgBoard = new ImageView(board);
        boards.getChildren().add(imgBoard);
        ImageView imgCross = new ImageView(cross1);
        crosses.getChildren().add(imgCross);
        ImageView imgCircle = new ImageView(circle2);
        circles.getChildren().add(imgCircle);


        grid.add(boards, 0, 0, 1, 1);
        grid.add(crosses, 0, 0, 3, 3);
        grid.add(circles, 2, 2, 2, 2);




        Scene scene = new Scene(grid, 1600, 900, Color.BLACK);

        primaryStage.setTitle("TickTackToe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
