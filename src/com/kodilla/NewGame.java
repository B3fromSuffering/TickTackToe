package com.kodilla;

import javafx.scene.control.Button;

import java.util.List;

public class NewGame {

    private ButtonsList buttonsList = new ButtonsList();

    public List<Button> getButtonsList() {

        List<Button> list = buttonsList.getButtons();
        return list;
    }

    public ButtonsList getButton() {
        return buttonsList;
    }
}
