package com.kodilla;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.ButtonsEditor.buttonList;


public class MenuButtons {

    public static Button createNewGameButton(List<Button> activeButtonList) {
        Button newGame = new Button("new game");
        newGame.setOnAction((e) -> {

            buttonList.forEach(b -> {
                        ButtonsEditor.emptyButton(b);
                        b.setDisable(false);
                        b.setStyle("");
                        if (!activeButtonList.contains(b)){
                            activeButtonList.add(b);}
                    });
                });

        return newGame;
    }

    public static Button createButton(List<Button> activeButtonsList, Button button) {

        button.setOnAction((e) -> {
            Circle circle = new Circle();
            ButtonsEditor.makeMarkCircle(button, circle);
            button.setDisable(true);
            button.setStyle("-fx-border-width: 1px;");
            activeButtonsList.remove(button);

            /*Cross cross = new Cross();*/

           /* Button button1 = activeButtonsList.get(1);
            ButtonsEditor.makeMarkCross(activeButtonsList.get(1), cross);*/
            /*if(buttonList.get(0).getStyle().equals(buttonList.get(1).getStyle())) {
                buttonList.get(0).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
            }*/
            TickTackToe.isSomeoneWin(activeButtonsList);

            ComputerMove computerMove = new ComputerMove();
            computerMove.computer(activeButtonsList);
        });

        return button;
    }
}