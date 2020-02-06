package com.kodilla;

import javafx.scene.control.*;
import java.util.Map;

import static com.kodilla.ButtonsEditor.buttonMap;
import static com.kodilla.TickTackToe.*;

public class MenuButtons {

    public static Button createNewGameButton(Map<Integer, Button> activeButtonMap) {
        Button newGame = new Button("new game");
        newGame.setOnAction((e) -> {
            TickTackToe.console.setText("new game");
            buttonMap.entrySet().forEach(b -> {
                ButtonsEditor.emptyButton(b.getValue());
                b.getValue().setDisable(false);
                b.getValue().setStyle("");
                activeButtonMap.put(b.getKey(), b.getValue());
            });
            TickTackToe.win = false;
            TickTackToe.playerWin = false;
            numberOfTours = 0;
            scores = 0;
            score.setText("Score: " + scores);
        });
        return newGame;
    }

    public static Button createNextGameButton(Map<Integer, Button> activeButtonMap) {
        Button nextGame = new Button("next round");
        nextGame.setOnAction((e) -> {
            if(activeButtonMap.size() == 0 || TickTackToe.win) {
                TickTackToe.console.setText("");
                buttonMap.entrySet().forEach(b -> {
                    ButtonsEditor.emptyButton(b.getValue());
                    b.getValue().setDisable(false);
                    b.getValue().setStyle("");
                    activeButtonMap.put(b.getKey(), b.getValue());
                });
                TickTackToe.win = false;
                TickTackToe.playerWin = false;
                numberOfTours++;
            }
            else{
                TickTackToe.console.setText("end this round");
            }
        });
        return nextGame;
    }

    public static Button createExit() {
        Button exit = new Button("exit");
        exit.setOnAction((e) -> {
            System.exit(1);
        });
        return exit;
    }

    public static Button saveResults() {
        Button save = new Button("save results");

        save.setOnAction((e) -> {
            TickTackToe.console.setText("results saved");
            String result = "hard: " + gameDifficulty + "; score: " + scores + "; games: " + numberOfTours;
            SaveResults.save(result);
            SaveResults.load();
        });
        return save;
    }

    public static Button difficultyEasy(Map<Integer, Button> activeButtonMap){
        Button  difficulty = new Button("easy");
        difficulty.setOnAction((e) -> {
            TickTackToe.console.setText("easy game");
            buttonMap.entrySet().forEach(b -> {
                ButtonsEditor.emptyButton(b.getValue());
                b.getValue().setDisable(false);
                b.getValue().setStyle("");
                activeButtonMap.put(b.getKey(), b.getValue());
            });
            TickTackToe.win = false;
            TickTackToe.playerWin = false;
            TickTackToe.gameDifficulty = false;
            numberOfTours = 0;
            scores = 0;
            score.setText("Score: " + scores);
        });
        return difficulty;
    }

    public static Button  difficultyHard(Map<Integer, Button> activeButtonMap) {
        Button  difficulty = new Button("hard");
        difficulty.setOnAction((e) -> {
            TickTackToe.console.setText("hard game");
            buttonMap.entrySet().forEach(b -> {
                ButtonsEditor.emptyButton(b.getValue());
                b.getValue().setDisable(false);
                b.getValue().setStyle("");
                activeButtonMap.put(b.getKey(), b.getValue());
            });
            TickTackToe.win = false;
            TickTackToe.playerWin = false;
            TickTackToe.gameDifficulty = true;
            numberOfTours = 0;
            scores = 0;
            score.setText("Score: " + scores);
        });
        return difficulty;
    }

    public static Button createButton(Map<Integer, Button> activeButtonMap, Integer key) {
        buttonMap.get(key).setOnAction((e) -> {
            //Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(buttonMap.get(key));
            buttonMap.get(key).setDisable(true);
            buttonMap.get(key).setStyle("-fx-border-width: 1px;");
            activeButtonMap.remove(key);
            if(!TickTackToe.isSomeoneWin(activeButtonMap) && activeButtonMap.size() > 0){
                ComputerMove computerMove = new ComputerMove();
                computerMove.computer(activeButtonMap);
                TickTackToe.isSomeoneWin(activeButtonMap);
            }
        });
        return buttonMap.get(key);
    }
}