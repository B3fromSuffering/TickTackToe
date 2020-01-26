package com.kodilla;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Circle {

    private Image circle1 = new Image("file:resources/circle1.jpg");
    private Image circle2 = new Image("file:resources/circle1.jpg");
    private Image circle3 = new Image("file:resources/circle1.jpg");
    private Image circle4 = new Image("file:resources/circle1.jpg");
    private Image circle5 = new Image("file:resources/circle1.jpg");
    List<Image> list = new ArrayList<>();

    public ImageView viewCircle(){


        ImageView imgCircle = new ImageView(circle1);

        return imgCircle;

    }
}
