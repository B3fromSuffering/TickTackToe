package com.kodilla;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ButtonsEditor{

    public static List<Button> buttonList = new ArrayList<>(getButtons());

    public static List<Button> getButtons() {
        List<Button> buttons = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            buttons.add(ButtonsEditor.newEmptyButton());
        }
        return buttons;
    }

    public static Button newEmptyButton() {

        Image empty = new Image("file:resources/empty.jpg");
        ImageView imgbutton = new ImageView(empty);
        Button button = new Button();
        button.setGraphic(imgbutton);


        return button;
    }

    public static Button emptyButton(Button button) {

        Image empty = new Image("file:resources/empty.jpg");
        ImageView imgbutton = new ImageView(empty);
        button.setGraphic(imgbutton);

        return button;
    }

    public static void makeMarkCircle(Button button, Circle circle){

        ImageView imgCircle = circle.viewCircle();
        button.setGraphic(imgCircle);

    }

    public static void makeMarkCross(Button button, Cross cross){

        ImageView imgCross = cross.viewCross();
        button.setGraphic(imgCross);

    }


}
