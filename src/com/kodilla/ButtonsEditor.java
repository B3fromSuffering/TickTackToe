package com.kodilla;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonsEditor{

    private Image empty = new Image("file:resources/empty.jpg");

    public static Button newEmptyButton() {

        Image empty = new Image("file:resources/empty.jpg");
        Button emptyButton = new Button();
        ImageView imgbutton = new ImageView(empty);
        emptyButton.setGraphic(imgbutton);

        return emptyButton;
    }

    public static void makeMarkCircle(Button button, Circle circle){

        ImageView imgCircle = circle.viewCircle();
        button.setGraphic(imgCircle);

    }

    public static void makeMarkCross(Button button, Cross cross){

        ImageView imgCross = cross.viewCross();
        button.setGraphic(imgCross);

    }

/*    public void newTurn(Button button) {
        ImageView imgbutton = Mark.makeMark();
        button.setGraphic(imgbutton);
    }*/
}
