package com.kodilla;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonsEditor{

    private Image empty = new Image("file:resources/empty.jpg");

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

/*    public void newTurn(Button button) {
        ImageView imgbutton = Mark.makeMark();
        button.setGraphic(imgbutton);
    }*/
}
