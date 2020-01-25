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
    private Image circle1 = new Image("file:resources/circle1.jpg");
    private Image circle2 = new Image("file:resources/circle2.jpg");
    private Image circle3 = new Image("file:resources/circle3.jpg");
    private Image circle4 = new Image("file:resources/circle4.jpg");
    private Image circle5 = new Image("file:resources/circle5.jpg");
    private Image cross1 = new Image("file:resources/cross1.jpg");
    private Image cross2 = new Image("file:resources/cross2.jpg");
    private Image cross3 = new Image("file:resources/cross3.jpg");
    private Image cross4 = new Image("file:resources/cross4.jpg");

    private FlowPane mark1 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane mark2 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane mark3 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane mark4 = new FlowPane(Orientation.HORIZONTAL);


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
        grid.setPadding(new Insets(10, 500, 10, 500));
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setBackground(background);


        ImageView imgCross = new ImageView(cross1);
        mark1.getChildren().add(imgCross);
        ImageView imgCircle = new ImageView(circle1);
        mark2.getChildren().add(imgCircle);
        ImageView imgCross2 = new ImageView(cross2);
        mark3.getChildren().add(imgCross2);
        ImageView imgCircle2 = new ImageView(circle2);
        mark4.getChildren().add(imgCircle2);





        grid.add(mark1, 1, 1);
        grid.add(mark2, 3, 3);
        grid.add(mark3, 2, 2);
        grid.add(mark4, 2, 3);



        Scene scene = new Scene(grid, 1600, 900, Color.BLACK);

        primaryStage.setTitle("TickTackToe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
