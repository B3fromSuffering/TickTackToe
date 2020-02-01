package com.kodilla;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.kodilla.ButtonsEditor.buttonMap;

public class ComputerMove {

    public boolean move1(Map<Integer, Button> activeButtonMap){
        Cross cross = new Cross();
        Random random = new Random();
        boolean end = false;

        while(!end){
            int key = random.nextInt(5);
            if(!buttonMap.get(key * 2).isDisable()){
                ButtonsEditor.makeMarkCross(activeButtonMap.get(key * 2), cross);
                activeButtonMap.get(key * 2).setStyle("-fx-border-width: 2px;");
                activeButtonMap.get(key * 2).setDisable(true);
                activeButtonMap.remove(key * 2);
                end = true;
            }
        }
        return true;
    }

    public boolean move2(Map<Integer, Button> activeButtonMap){
        Cross cross = new Cross();
        Random random = new Random();
        boolean end = false;
        int key = 0;

        if(!end && buttonMap.get(0).getStyle().equals(buttonMap.get(4).getStyle()) && !buttonMap.get(0).getStyle().equals("") && !buttonMap.get(8).isDisable()) {
            ButtonsEditor.makeMarkCross(activeButtonMap.get(8), cross);
            key = 8;
            end = true;
        }
        if(!end && buttonMap.get(2).getStyle().equals(buttonMap.get(4).getStyle()) && !buttonMap.get(2).getStyle().equals("") && !buttonMap.get(6).isDisable()) {
            ButtonsEditor.makeMarkCross(activeButtonMap.get(6), cross);
            key = 6;
            end = true;
        }
        if(!end && buttonMap.get(6).getStyle().equals(buttonMap.get(4).getStyle()) && !buttonMap.get(6).getStyle().equals("") && !buttonMap.get(2).isDisable()) {
            ButtonsEditor.makeMarkCross(activeButtonMap.get(2), cross);
            key = 2;
            end = true;
        }
        if(!end && buttonMap.get(8).getStyle().equals(buttonMap.get(4).getStyle()) && !buttonMap.get(8).getStyle().equals("") && !buttonMap.get(0).isDisable()) {
            ButtonsEditor.makeMarkCross(activeButtonMap.get(0), cross);
            key = 0;
            end = true;
        }
        if(!end && buttonMap.get(1).getStyle().equals(buttonMap.get(7).getStyle()) && !buttonMap.get(1).getStyle().equals("") && !buttonMap.get(4).isDisable()) {
            ButtonsEditor.makeMarkCross(activeButtonMap.get(4), cross);
            key = 4;
            end = true;
        }
        if(!end && buttonMap.get(3).getStyle().equals(buttonMap.get(5).getStyle()) && !buttonMap.get(3).getStyle().equals("") && !buttonMap.get(4).isDisable()) {
            ButtonsEditor.makeMarkCross(activeButtonMap.get(4), cross);
            key = 4;
            end = true;
        }
        if(!end) {
            for (int i = 0; i < 9; i += 2) {
                for (int j = 0; j < 9; j += 2) {
                    if (!end && i != 4 && i != j && buttonMap.get(i).getStyle().equals(buttonMap.get(j).getStyle()) && !buttonMap.get(i).getStyle().equals("") && !buttonMap.get((i + j) / 2).isDisable()) {
                        ButtonsEditor.makeMarkCross(activeButtonMap.get((i + j) / 2), cross);
                        key = (i + j) / 2;
                        end = true;
                    }
                }
            }
        }
        if(!end) {
            for (int i = 0; i < 7; i += 3) {
                if (!end && buttonMap.get(i).getStyle().equals(buttonMap.get(i + 1).getStyle()) && !buttonMap.get(i).getStyle().equals("") && !buttonMap.get(i + 2).isDisable()) {
                    ButtonsEditor.makeMarkCross(activeButtonMap.get(i + 2), cross);
                    key = i + 2;
                    end = true;
                }
            }
        }
        if(!end) {
            for (int i = 1; i < 9; i = i + 3) {
                if (!end && buttonMap.get(i).getStyle().equals(buttonMap.get(i + 1).getStyle()) && !buttonMap.get(i).getStyle().equals("") && !buttonMap.get(i - 1).isDisable()) {
                    ButtonsEditor.makeMarkCross(activeButtonMap.get(i - 1), cross);
                    key = i - 1;
                    end = true;
                }
            }
        }
        if(!end) {
            for (int i = 0; i < 6; i += 1) {
                if (!end && buttonMap.get(i).getStyle().equals(buttonMap.get(i + 3).getStyle()) && !buttonMap.get(i).getStyle().equals("") && !buttonMap.get((i + 6) % 9).isDisable()) {
                    key = (i + 6) % 9;
                    ButtonsEditor.makeMarkCross(activeButtonMap.get(key), cross);
                    end = true;
                }
            }
        }

        if(end) {
            activeButtonMap.get(key).setStyle("-fx-border-width: 2px;");
            activeButtonMap.get(key).setDisable(true);
            activeButtonMap.remove(key);
        }else{
            move1(activeButtonMap);
        }
        return true;
    }

    public void computer(Map<Integer, Button> activeButtonMap){

        Random random = new Random();
        Cross cross = new Cross();

        int keyIndex;
        int key = 0;
        boolean end = false;

        List<Integer> keysList = new ArrayList<>(activeButtonMap.keySet());



        //difficulty
        // first move
        if (activeButtonMap.size() == 8) {
            move1(activeButtonMap);
        }

        //second move
        if (activeButtonMap.size() <= 6) {
            move2(activeButtonMap);
        }
           /* end = false;
            for(int i = 0; i<7; i +=3){
                if (!end && buttonMap.get(i).getStyle().equals(buttonMap.get(i + 1).getStyle()) && !buttonMap.get(i).getStyle().equals("") && !buttonMap.get(i + 2).isDisable()) {
                    ButtonsEditor.makeMarkCross(activeButtonMap.get(i + 2), cross);
                    key = i + 2;
                    activeButtonMap.get(key).setStyle("-fx-border-width: 2px;");
                    activeButtonMap.get(key).setDisable(true);
                    activeButtonMap.remove(key);
                    end = true;
                }

            }
            for (int i=1; i<9; i= i+3) {
                if (!end && buttonMap.get(i).getStyle().equals(buttonMap.get(i + 1).getStyle()) && !buttonMap.get(i).getStyle().equals("") && !buttonMap.get(i - 1).isDisable()) {
                    ButtonsEditor.makeMarkCross(activeButtonMap.get(i - 1), cross);
                    key = i - 1;
                    activeButtonMap.get(key).setStyle("-fx-border-width: 2px;");
                    activeButtonMap.get(key).setDisable(true);
                    activeButtonMap.remove(key);
                    end = true;
                }
            }*/



       /* if (activeButtonMap.size() < 5){

            keyIndex = random.nextInt(keysList.size());
            key = keysList.get(keyIndex);
            ButtonsEditor.makeMarkCross(activeButtonMap.get(key), cross);
            activeButtonMap.get(key).setStyle("-fx-border-width: 2px;");
            activeButtonMap.get(key).setDisable(true);
            activeButtonMap.remove(key);
        }*/





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
