package com.kodilla;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.ButtonsEditor.buttonList;

public class VictoryCheck {

    public static boolean isSomeoneWin(List<Button> activeButtons){

        if(activeButtons.size() < 5){
            for(int i = 0; i < 9; i = i + 3)
                if (buttonList.get(i).getStyle().equals(buttonList.get(i + 1).getStyle()) && buttonList.get(i + 1).getStyle().equals(buttonList.get(i + 2).getStyle())) {
                    buttonList.get(i).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonList.get(i + 1).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                    buttonList.get(i + 2).setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
                }

        }

        return true;
    }

}
