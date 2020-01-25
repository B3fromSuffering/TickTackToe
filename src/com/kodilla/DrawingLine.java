package com.kodilla;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawingLine extends Application{
    @Override
    public void start(Stage stage) {

        Line line = new Line();
        Line line1 = new Line();
        Line line2 = new Line();
        Line line3 = new Line();

        line.setStartX(100.0);
        line.setStartY(200.0);
        line.setEndX(500.0);
        line.setEndY(200.0);

        line1.setStartX(100.0);
        line1.setStartY(400.0);
        line1.setEndX(500.0);
        line1.setEndY(400.0);

        line2.setStartX(200.0);
        line2.setStartY(100.0);
        line2.setEndX(200.0);
        line2.setEndY(500.0);

        line3.setStartX(400.0);
        line3.setStartY(100.0);
        line3.setEndX(400.0);
        line3.setEndY(500.0);

        //Creating a Group
        Group root = new Group(line);
        root.getChildren().add(line1);

        //Creating a Scene
        Scene scene = new Scene(root, 600, 600);


        //Setting title to the scene
        stage.setTitle("Sample application");

        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
} 