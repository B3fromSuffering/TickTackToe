package com.kodilla;

import javafx.scene.control.Button;

import java.util.List;
import java.util.Random;

public class ComputerMove {


    public void computer(List<Button> activeButtons){

        Random random = new Random();
        Cross cross = new Cross();

        int buttonFromIndex;
        buttonFromIndex = random.nextInt(activeButtons.size());


        ButtonsEditor.makeMarkCross(activeButtons.get(buttonFromIndex), cross);
        activeButtons.get(buttonFromIndex).setStyle("-fx-border-width: 2px;");
        activeButtons.get(buttonFromIndex).setDisable(true);
        activeButtons.remove(activeButtons.get(buttonFromIndex));




    }
}
