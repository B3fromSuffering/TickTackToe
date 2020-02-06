package com.kodilla;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cross {

    private Image cross1 = new Image("file:resources/cross1.jpg");
    private Image cross2 = new Image("file:resources/cross2.jpg");
    private Image cross3 = new Image("file:resources/cross3.jpg");
    private Image cross4 = new Image("file:resources/cross4.jpg");
    private List<Image> list = new ArrayList<>();

    public ImageView viewCross() {

        Random random = new Random();
        list.add(cross1);
        list.add(cross2);
        list.add(cross3);
        list.add(cross4);

        return new ImageView(list.get(random.nextInt(4)));
    }
}
