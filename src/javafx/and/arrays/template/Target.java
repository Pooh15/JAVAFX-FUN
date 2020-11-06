package javafx.and.arrays.template;

import java.util.Random;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Target {

    int numRings;
    Color color1;
    Color color2;
    Group targetGroup;
    int rad1;

    public Target(int numRings, Color color1, Color color2, int rad1) {
        targetGroup = new Group();
        this.numRings = numRings;
        this.color1 = color1;
        this.color2 = color2;
        this.rad1 = rad1;
        Circle c;
        Random rnd = new Random();
    
        for (int i = 0; i < numRings; i++) {
            c = new Circle();
            c.setRadius(i * this.rad1);
            if (i % 2 == 0) {
                c.setFill(color1);
            } else {
                c.setFill(color2);
            }
            targetGroup.getChildren().add(c);
        }
    }

    public void setHorizontal(int x) {
        targetGroup.setLayoutX(x);
    }

    public void setVertical(int y) {
        targetGroup.setLayoutY(y);
    }

    public Group getTarget() {
        return targetGroup;
    }

}
