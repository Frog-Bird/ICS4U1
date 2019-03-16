package Arrays01;

import javafx.geometry.Point2D;

import java.awt.*;

public class one {
    public static void main(String[] args) {
        double [] vectorOne = new double[] {1, 5};
        double [] vectorTwo = new double[] {6, 8};
        double x, y, distance;
        x = Math.abs (vectorOne[0] - vectorTwo[0]);
        y = Math.abs (vectorOne[1] - vectorTwo[1]);
        distance = Math.sqrt((y)*(y) +(x)*(x));
        System.out.println(distance);
    }
}
