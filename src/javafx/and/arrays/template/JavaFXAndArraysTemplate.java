/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.and.arrays.template;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author dinsmoor
 */
public class JavaFXAndArraysTemplate extends Application {

    public int max = 30;
    public int radius = 2;//the bigger max is, make radius

    @Override
    public void start(Stage primaryStage) {
        Target[] targets = new Target[max];

        //Fill the array of objects 
        buildCircleSet(targets);
        Group root = new Group();
        createAGroup(root, targets);

        Scene scene = new Scene(root, 1200, 700);

        primaryStage.setTitle("Random Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void createAGroup(Group g, Target trgs[]) {
        for (int i = 0; i < trgs.length; i++) {
            g.getChildren().add(trgs[i].targetGroup);
        }
    }

    public void buildCircleSet(Target trgs[]) {
        Target t1;
        Random rnd = new Random();
        int x;
        int y;
        int r, g, b, r1, g1, b1;

        for (int i = 0; i < max; i++) {
            x = rnd.nextInt(1200) + 1;
            y = rnd.nextInt(900) + 1;
            r = rnd.nextInt(256);
            g = rnd.nextInt(256);
            b = rnd.nextInt(256);
            r1 = rnd.nextInt(256);
            g1 = rnd.nextInt(256);
            b1 = rnd.nextInt(256);
            t1 = new Target(i * 2 + 1, Color.rgb(r, g, b), Color.rgb(r1, g1, b1), radius);
            t1.setHorizontal(x);
            t1.setVertical(y);
            trgs[i] = t1;
        }
        System.out.println(trgs[1]);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
