package com.kodilla;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Circle {

    private Image circle1 = new Image("file:resources/circle1.jpg");
    private Image circle2 = new Image("file:resources/circle2.jpg");
    private Image circle3 = new Image("file:resources/circle3.jpg");
    private Image circle4 = new Image("file:resources/circle4.jpg");
    private Image circle5 = new Image("file:resources/circle5.jpg");
    private List<Image> list = new ArrayList<>();

    public ImageView viewCircle(){

        Random random = new Random();
        list.add(circle1);
        list.add(circle2);
        list.add(circle3);
        list.add(circle4);
        list.add(circle5);

        return new ImageView(list.get(random.nextInt(5)));
    }
}
