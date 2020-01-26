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

import java.util.List;


public class TickTackToe extends Application{

//    private Image board = new Image("file:resources/tic-tac-toe-board-empty.jpg");
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
    private Image empty = new Image("file:resources/empty.jpg");

//    private FlowPane boards = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane mark1 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane mark2 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane mark3 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane mark4 = new FlowPane(Orientation.HORIZONTAL);

    private Label score = new Label();


    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);



        Button newGame = new Button("new game");
        Button saveResults = new Button("save results");
        Button exit = new Button("exit");



        //ButtonsEditor button = new ButtonsEditor();
        /*Button button01 = button.newEmptyButton();
        Button button11 = button.newEmptyButton();
        Button button21 = button.newEmptyButton();
        Button button02 = button.newEmptyButton();
        Button button12 = button.newEmptyButton();
        Button button22 = button.newEmptyButton();
        Button button03 = button.newEmptyButton();
        Button button13 = button.newEmptyButton();
        Button button23 = button.newEmptyButton();*/

      /*  Button button01 = ButtonsEditor.newEmptyButton();
        Button button11 = ButtonsEditor.newEmptyButton();
        Button button21 = ButtonsEditor.newEmptyButton();
        Button button02 = ButtonsEditor.newEmptyButton();
        Button button12 = ButtonsEditor.newEmptyButton();
        Button button22 = ButtonsEditor.newEmptyButton();
        Button button03 = ButtonsEditor.newEmptyButton();
        Button button13 = ButtonsEditor.newEmptyButton();
        Button button23 = ButtonsEditor.newEmptyButton();*/
        NewGame newGameGame = new NewGame();
        List<Button> buttonsList = newGameGame.getButtonsList();

/*        for (Button button: buttonsList) {


        }*/

/*        ButtonsList buttonsLista = new ButtonsList();
        List<Button> buttonsList = buttonsLista.getButtons();*/
        Button button01 = newGameGame.getButton().getButton01();
        Button button11 = newGameGame.getButton().getButton11();
        Button button21 = ButtonsEditor.newEmptyButton();
        Button button02 = ButtonsEditor.newEmptyButton();
        Button button12 = ButtonsEditor.newEmptyButton();
        Button button22 = ButtonsEditor.newEmptyButton();
        Button button03 = ButtonsEditor.newEmptyButton();
        Button button13 = ButtonsEditor.newEmptyButton();
        Button button23 = ButtonsEditor.newEmptyButton();

  /*      buttonsList.get(0).setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(buttonsList.get(0), circle);
        });*/

       /* button01.setOnAction(event -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button01, circle);
        });*/


        score.setText("Score");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10, 550, 10, 550));
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setBackground(background);

//        GridPane gridBoard = new GridPane();
//        ImageView imgBoard = new ImageView(board);
//        boards.getChildren().add(imgBoard);

  /*      ImageView imgCross = new ImageView(cross1);
        mark1.getChildren().add(imgCross);
        ImageView imgCircle = new ImageView(circle1);
        mark2.getChildren().add(imgCircle);
        ImageView imgCross2 = new ImageView(cross2);
        mark3.getChildren().add(imgCross2);
        ImageView imgCircle2 = new ImageView(circle2);
        mark4.getChildren().add(imgCircle2);*/

     /*   Line line1 = new Line();
        line1.setStartX(100.0);
        line1.setStartY(400.0);
        line1.setEndX(500.0);
        line1.setEndY(400.0);*/


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
