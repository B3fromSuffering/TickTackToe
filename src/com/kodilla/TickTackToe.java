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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import static com.kodilla.ButtonsEditor.buttonList;
import static com.kodilla.ButtonsEditor.buttonMap;
import static com.kodilla.MenuButtons.*;


public class TickTackToe extends Application{

    private Image imageback = new Image("file:resources/tic-tac-toe-pattern-background.jpg");
    static Label score = new Label();
    static Label console = new Label();
    static int scores = 0;

    public static boolean isSomeoneWin(Map<Integer, Button> activeButtonMap) {

        boolean win = false;        // true true - player win
        boolean playerWin = false;  // true false - player loose

        if (activeButtonMap.size() < 5) {
            for (int i = 0; i < 9; i = i + 3) {
                if (buttonMap.get(i).getStyle().equals(buttonMap.get(i + 1).getStyle()) && buttonMap.get(i + 1).getStyle().equals(buttonMap.get(i + 2).getStyle())
                        && buttonMap.get(i).isDisable() && buttonMap.get(i + 1).isDisable() && buttonMap.get(i + 2).isDisable()) {

                    if(buttonMap.get(i).getStyle().equals("-fx-border-width: 1px;")){
                        playerWin = true;
                    }
                    win = true;
                    buttonMap.get(i).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonMap.get(i + 1).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonMap.get(i + 2).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                }
            }
            for (int i = 0; i < 3; i = i + 1) {
                if (buttonMap.get(i).getStyle().equals(buttonMap.get(i + 3).getStyle()) && buttonMap.get(i + 3).getStyle().equals(buttonMap.get(i + 6).getStyle())
                        && buttonMap.get(i).isDisable() && buttonMap.get(i + 3).isDisable() && buttonMap.get(i + 6).isDisable()) {

                    if(buttonMap.get(i).getStyle().equals("-fx-border-width: 1px;")){
                        playerWin = true;
                    }
                    win = true;
                    buttonMap.get(i).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonMap.get(i + 3).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonMap.get(i + 6).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                }
            }
            if (buttonMap.get(0).getStyle().equals(buttonMap.get(4).getStyle()) && buttonMap.get(4).getStyle().equals(buttonMap.get(8).getStyle())
                    && buttonMap.get(0).isDisable() && buttonMap.get(4).isDisable() && buttonMap.get(8).isDisable()){
                if(buttonMap.get(0).getStyle().equals("-fx-border-width: 1px;")){
                    playerWin = true;
                }
                win = true;
                buttonMap.get(0).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                buttonMap.get(4).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                buttonMap.get(8).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
            }
            if (buttonMap.get(2).getStyle().equals(buttonMap.get(4).getStyle()) && buttonMap.get(4).getStyle().equals(buttonMap.get(6).getStyle())
                    && buttonMap.get(2).isDisable() && buttonMap.get(4).isDisable() && buttonMap.get(6).isDisable()){
                if(buttonMap.get(2).getStyle().equals("-fx-border-width: 1px;")){
                    playerWin = true;
                }
                win = true;
                buttonMap.get(2).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                buttonMap.get(4).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                buttonMap.get(6).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
            }
        }


        if(win){
            buttonMap.keySet().forEach(integer ->
                    buttonMap.get(integer).setDisable(true));
            if(playerWin){
                console.setText("YOU WIN");
                scores += 10;
                score.setText("Score: " + scores);
            } else {
                console.setText("YOU LOOSE");
                scores -= 10;
                score.setText("Score: " + scores);
            }

        }
        return win;
    }

      /*  if(activeButtons.size() < 5) {
            for (int i = 0; i < 9; i = i + 3){
                if (buttonList.get(i).getStyle().equals(buttonList.get(i + 1).getStyle()) && buttonList.get(i + 1).getStyle().equals(buttonList.get(i + 2).getStyle())
                        && buttonList.get(i).isDisable() && buttonList.get(i + 1).isDisable() && buttonList.get(i + 2).isDisable()) {
                    buttonList.get(i).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonList.get(i + 1).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonList.get(i + 2).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                }
            }
            for (int i = 0; i < 3; i = i + 1){
                if (buttonList.get(i).getStyle().equals(buttonList.get(i + 3).getStyle()) && buttonList.get(i + 3).getStyle().equals(buttonList.get(i + 6).getStyle())
                        && buttonList.get(i).isDisable() && buttonList.get(i + 3).isDisable() && buttonList.get(i + 6).isDisable()) {
                    buttonList.get(i).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonList.get(i + 3).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonList.get(i + 6).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                }
            }
        }
        return true;*/


    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        Map<Integer, Button> activeButtonMap = new HashMap<>(ButtonsEditor.buttonMap);


        Button saveResults = saveResults();
        Button exit = createExit();
        Button newGame = createNewGameButton(activeButtonMap);

        /*List<Button> activeButtonsList = new ArrayList<>(ButtonsEditor.buttonList);


        Button saveResults = new Button("save results");
        Button exit = new Button("exit");
        Button newGame = createNewGameButton(activeButtonsList);*/


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(50, 550, 10, 510));
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setBackground(background);

        int x = 0;
        int y = 1;
        for (Integer b: activeButtonMap.keySet()) {
            Button button = createButton(activeButtonMap, b);
            grid.add(button, x, y);
            if (x == 2){
                x = 0;
                y++;
            } else {
                x++;
            }
        }

        /*int x = 0;
        int y = 1;
        for (Button b: buttonList) {
            Button button = createButton(activeButtonsList, b);
            grid.add(button, x, y);
            if (x == 2){
                x = 0;
                y++;
            } else {
                x++;
            }
        }*/

        grid.add(newGame, 0, 0);
        grid.add(saveResults, 1, 0);
        grid.add(exit, 2, 0);
        grid.add(console, 0, 4);
        grid.add(score, 2, 4);

        console.setStyle("-fx-font-size: 20; -fx-background-color: #fff669; ");
        score.setStyle("-fx-font-size: 20; -fx-background-color: #fff669");
        score.setText("Score: " + scores);

        Scene scene = new Scene(grid, 1200, 800, Color.BLACK);

        primaryStage.setTitle("TickTackToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
