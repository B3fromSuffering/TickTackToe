package com.kodilla;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import static com.kodilla.ButtonsEditor.buttonList;
import static com.kodilla.ButtonsEditor.buttonMap;


public class MenuButtons {

    public static Button createNewGameButton(Map<Integer, Button> activeButtonMap) {
        Button newGame = new Button("new game");
        newGame.setOnAction((e) -> {
            TickTackToe.console.setText("");
            buttonMap.entrySet().forEach(b -> {
                ButtonsEditor.emptyButton(b.getValue());
                b.getValue().setDisable(false);
                b.getValue().setStyle("");
                activeButtonMap.put(b.getKey(), b.getValue());
            });
        });
/*            buttonList.forEach(b -> {
                        ButtonsEditor.emptyButton(b);
                        b.setDisable(false);
                        b.setStyle("");
                        if (!activeButtonList.contains(b)){
                            activeButtonList.add(b);}
                    });
                });*/

        return newGame;
    }

    public static Button createExit(){
        Button exit = new Button("exit");
        exit.setOnAction((e) -> {
            System.exit(1);
        });
        return exit;
    }

    public static Button saveResults(){
        Button exit = new Button("save results");
        exit.setOnAction((e) -> {
            TickTackToe.console.setText("results saved");
        });
        return exit;
    }

    public static Button createButton(Map<Integer, Button> activeButtonMap, Integer key) {

        buttonMap.get(key).setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(buttonMap.get(key), circle);
            buttonMap.get(key).setDisable(true);
            buttonMap.get(key).setStyle("-fx-border-width: 1px;");

            activeButtonMap.remove(key);

            if(!TickTackToe.isSomeoneWin(activeButtonMap)){
                ComputerMove computerMove = new ComputerMove();
                computerMove.computer(activeButtonMap);
                TickTackToe.isSomeoneWin(activeButtonMap);
            }

        });

        return buttonMap.get(key);
    }
    /*public static Button createButton(List<Button> activeButtonsList, Button button) {

        button.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button, circle);
            button.setDisable(true);
            button.setStyle("-fx-border-width: 1px;");
            activeButtonsList.remove(button);

            TickTackToe.isSomeoneWin(activeButtonsList);

            ComputerMove computerMove = new ComputerMove();
            computerMove.computer(activeButtonsList);
        });

        return button;
    }*/
}