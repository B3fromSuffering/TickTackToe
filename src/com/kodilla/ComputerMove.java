package com.kodilla;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ComputerMove {


    public void computer(Map<Integer, Button> activeButtonMap){

        Random random = new Random();
        Cross cross = new Cross();

        int keyIndex;
        int key;
        List<Integer> keysList = new ArrayList<>(activeButtonMap.keySet());
        keyIndex = random.nextInt(keysList.size());
        key = keysList.get(keyIndex);

        ButtonsEditor.makeMarkCross(activeButtonMap.get(key), cross);
        activeButtonMap.get(key).setStyle("-fx-border-width: 2px;");
        activeButtonMap.get(key).setDisable(true);
        activeButtonMap.remove(key);

        //difficulty

        /*if(!activeButtonMap.get(4).isDisable()){

        }*/

    /*public void computer(List<Button> activeButtons){

        Random random = new Random();
        Cross cross = new Cross();

        int buttonFromIndex;
        buttonFromIndex = random.nextInt(activeButtons.size());


        ButtonsEditor.makeMarkCross(activeButtons.get(buttonFromIndex), cross);
        activeButtons.get(buttonFromIndex).setStyle("-fx-border-width: 2px;");
        activeButtons.get(buttonFromIndex).setDisable(true);
        activeButtons.remove(activeButtons.get(buttonFromIndex));*/




    }
}
