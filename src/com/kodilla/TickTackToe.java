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

import static com.kodilla.ButtonsEditor.buttonList;
import static com.kodilla.MenuButtons.createButton;
import static com.kodilla.MenuButtons.createNewGameButton;


public class TickTackToe extends Application{

    private Image imageback = new Image("file:resources/tic-tac-toe-pattern-background.jpg");
    private Label score = new Label();

    public static boolean isSomeoneWin(List<Button> activeButtons){

        if(activeButtons.size() < 5) {
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
        return true;
    }

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);


        //List<Button> buttonsList = ButtonsEditor.getButtons();
        //List<Button> activeButtonsList = new ArrayList<>(buttonsList);
        List<Button> activeButtonsList = new ArrayList<>(ButtonsEditor.buttonList);

        Button saveResults = new Button("save results");
        Button exit = new Button("exit");
        Button newGame = createNewGameButton(activeButtonsList);
        //Button newGame = createNewGameButton(buttonsList, activeButtonsList);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10, 550, 10, 550));
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setBackground(background);

        int x = 0;
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
        }

        grid.add(newGame, 0, 0);
        grid.add(saveResults, 1, 0);
        grid.add(exit, 2, 0);
        grid.add(score, 0, 4);
        score.setText("Score");

        Scene scene = new Scene(grid, 1200, 800, Color.BLACK);

        primaryStage.setTitle("TickTackToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
