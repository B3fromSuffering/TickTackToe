package com.kodilla;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Cross {


    private Image cross = new Image("file:resources/cross1.jpg");


    public ImageView viewCross(){


        ImageView imgCross = new ImageView(cross);

        return imgCross;

    }

}
