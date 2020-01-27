package com.kodilla;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class ButtonsList {

    private List<Button> buttons = new ArrayList<>();



        Button button01 = ButtonsEditor.newEmptyButton();
        Button button11 = ButtonsEditor.newEmptyButton();
        Button button21 = ButtonsEditor.newEmptyButton();
        Button button02 = ButtonsEditor.newEmptyButton();
        Button button12 = ButtonsEditor.newEmptyButton();
        Button button22 = ButtonsEditor.newEmptyButton();
        Button button03 = ButtonsEditor.newEmptyButton();
        Button button13 = ButtonsEditor.newEmptyButton();
        Button button23 = ButtonsEditor.newEmptyButton();


    public void ButtonsList() {



        buttons.add(button01);
        buttons.add(button11);
        buttons.add(button21);
        buttons.add(button02);
        buttons.add(button12);
        buttons.add(button22);
        buttons.add(button03);
        buttons.add(button13);
        buttons.add(button23);
    }

    public List<Button> getButtons() {
        return buttons;
    }


}
