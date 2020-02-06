package com.kodilla;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.kodilla.ButtonsEditor.buttonMap;
import static com.kodilla.TickTackToe.gameDifficulty;

public class ComputerMove {

    public boolean move1(Map<Integer, Button> activeButtonMap) {
        Random random = new Random();
        boolean end = false;
        int key = 0;

        if(!buttonMap.get(4).isDisable()){
            key = 4;
            end = true;
        }
        while(!end){
            key = 2 * random.nextInt(5);
            if(!buttonMap.get(key).isDisable()) {
                end = true;
            }
        }
        return ComputerMark(activeButtonMap, end, key);
    }

    public boolean move2(Map<Integer, Button> activeButtonMap) {
        Random random = new Random();
        boolean end = false;
        int key = 0;

        if (buttonMap.get(0).getStyle().equals(buttonMap.get(8).getStyle()) && buttonMap.get(0).getStyle().equals("-fx-border-width: 1px;")){
            while(!end) {
                key = 1 + 2 * random.nextInt(4);
                if (!buttonMap.get(key).isDisable()) {
                    end = true;
                }
            }
        }
        if (!end && buttonMap.get(2).getStyle().equals(buttonMap.get(6).getStyle()) && buttonMap.get(2).getStyle().equals("-fx-border-width: 1px;")){
            while(!end) {
                key = 1 + 2 * random.nextInt(4);
                if (!buttonMap.get(key).isDisable()) {
                    end = true;
                }
            }
        }
        if(!end && ((buttonMap.get(0).isDisable() && buttonMap.get(4).isDisable() && buttonMap.get(8).isDisable()) || (buttonMap.get(2).isDisable() && buttonMap.get(4).isDisable() && buttonMap.get(6).isDisable()))){
            while(!end){
                key = 2 * random.nextInt(5);
                if(!buttonMap.get(key).isDisable()){
                    end = true;
                }
            }
        }
        return ComputerMark(activeButtonMap, end, key);
    }

    public boolean move3(Map<Integer, Button> activeButtonMap,String mark){
        boolean end = false;
        int key = 0;

        if(!end && buttonMap.get(0).getStyle().equals(buttonMap.get(4).getStyle()) && buttonMap.get(0).getStyle().equals(mark) && !buttonMap.get(8).isDisable()) {
            key = 8;
            end = true;
        }
        if(!end && buttonMap.get(2).getStyle().equals(buttonMap.get(4).getStyle()) && buttonMap.get(2).getStyle().equals(mark) && !buttonMap.get(6).isDisable()) {
            key = 6;
            end = true;
        }
        if(!end && buttonMap.get(6).getStyle().equals(buttonMap.get(4).getStyle()) && buttonMap.get(6).getStyle().equals(mark) && !buttonMap.get(2).isDisable()) {
            key = 2;
            end = true;
        }
        if(!end && buttonMap.get(8).getStyle().equals(buttonMap.get(4).getStyle()) && buttonMap.get(8).getStyle().equals(mark) && !buttonMap.get(0).isDisable()) {
            key = 0;
            end = true;
        }
        if(!end) {
            for (int i = 0; i < 9; i += 2) {
                for (int j = 0; j < 9; j += 2) {
                    if (!end && j!= 4 && i != 4 && i != j && buttonMap.get(i).getStyle().equals(buttonMap.get(j).getStyle()) && buttonMap.get(i).getStyle().equals(mark) && !buttonMap.get((i + j) / 2).isDisable()) {
                        key = (i + j) / 2;
                        end = true;
                    }
                }
            }
        }
        if(!end) {
            for (int i = 0; i < 7; i += 3) {
                if (!end && buttonMap.get(i).getStyle().equals(buttonMap.get(i + 1).getStyle()) && buttonMap.get(i).getStyle().equals(mark) && !buttonMap.get(i + 2).isDisable()) {
                    key = i + 2;
                    end = true;
                }
            }
        }
        if(!end) {
            for (int i = 1; i < 9; i = i + 3) {
                if (!end && buttonMap.get(i).getStyle().equals(buttonMap.get(i + 1).getStyle()) && buttonMap.get(i).getStyle().equals(mark) && !buttonMap.get(i - 1).isDisable()) {
                    key = i - 1;
                    end = true;
                }
            }
        }
        if(!end) {
            for (int i = 0; i < 6; i += 1) {
                if (!end && buttonMap.get(i).getStyle().equals(buttonMap.get(i + 3).getStyle()) && buttonMap.get(i).getStyle().equals(mark) && !buttonMap.get((i + 6) % 9).isDisable()) {
                    key = (i + 6) % 9;
                    end = true;
                }
            }
        }
        return ComputerMark(activeButtonMap, end, key);
    }

    public boolean ComputerMark(Map<Integer, Button> activeButtonMap, boolean end, int key) {
        if(end) {
            ButtonsEditor.makeMarkCross(activeButtonMap.get(key));
            activeButtonMap.get(key).setStyle("-fx-border-width: 2px;");
            activeButtonMap.get(key).setDisable(true);
            activeButtonMap.remove(key);
            return true;
        }else{
            return false;
        }
    }

    public boolean moveRandom(Map<Integer, Button> activeButtonMap){
        Random random = new Random();
        int keyIndex;
        int key;

        List<Integer> keysList = new ArrayList<>(activeButtonMap.keySet());
        keyIndex = random.nextInt(keysList.size());
        key = keysList.get(keyIndex);

        ButtonsEditor.makeMarkCross(activeButtonMap.get(key));
        activeButtonMap.get(key).setStyle("-fx-border-width: 2px;");
        activeButtonMap.get(key).setDisable(true);
        activeButtonMap.remove(key);
        return true;
    }

    public void computer(Map<Integer, Button> activeButtonMap){

        String playerMark = "-fx-border-width: 1px;";
        String computerMark = "-fx-border-width: 2px;";

        if (gameDifficulty == true) {

            if (activeButtonMap.size() == 8) {
                move1(activeButtonMap);
            }

            if (activeButtonMap.size() == 6) {
                boolean didComputerMove = move2(activeButtonMap);
                if (!didComputerMove) {
                    didComputerMove = move3(activeButtonMap, playerMark);
                }
                if (!didComputerMove) {
                    moveRandom(activeButtonMap);
                }
            }

            if (activeButtonMap.size() <= 4) {
                boolean didComputerMove = move3(activeButtonMap, computerMark);
                if (!didComputerMove) {
                    didComputerMove = move3(activeButtonMap, playerMark);
                }
                if (!didComputerMove) {
                    moveRandom(activeButtonMap);
                }
            }
        } else {
            moveRandom(activeButtonMap);
        }
    }
}
