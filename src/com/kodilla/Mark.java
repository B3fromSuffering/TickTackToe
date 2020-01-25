package com.kodilla;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

public class Mark{

    private Image cross = new Image("file:resource/cross1.jpg");



    public FlowPane Mark(){
        FlowPane crosses = new FlowPane(Orientation.HORIZONTAL);
        ImageView imgCross = new ImageView(cross);
        crosses.getChildren().add(imgCross);
        return crosses;
    }



    // co tutaj ma byc?
    // obrazek?
    // metoda grid.add?
}
