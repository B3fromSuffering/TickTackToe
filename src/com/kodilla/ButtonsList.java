package com.kodilla;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class ButtonsList {

    private List<Button> buttons = new ArrayList<>();

    private Button button01 = ButtonsEditor.newEmptyButton();
    private Button button11 = ButtonsEditor.newEmptyButton();
    private Button button21 = ButtonsEditor.newEmptyButton();
    private Button button02 = ButtonsEditor.newEmptyButton();
    private Button button12 = ButtonsEditor.newEmptyButton();
    private Button button22 = ButtonsEditor.newEmptyButton();
    private Button button03 = ButtonsEditor.newEmptyButton();
    private Button button13 = ButtonsEditor.newEmptyButton();
    private Button button23 = ButtonsEditor.newEmptyButton();

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

    public Button getButton01() {
        return button01;
    }

    public Button getButton11() {
        return button11;
    }

    public Button getButton21() {
        return button21;
    }

    public Button getButton02() {
        return button02;
    }

    public Button getButton12() {
        return button12;
    }

    public Button getButton22() {
        return button22;
    }

    public Button getButton03() {
        return button03;
    }

    public Button getButton13() {
        return button13;
    }

    public Button getButton23() {
        return button23;
    }
}
