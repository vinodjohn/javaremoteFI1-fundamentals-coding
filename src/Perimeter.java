import java.lang.Math;

/**
 * To calculate the perimeter of the circle
 *
 * @author Vinod John
 * @Date 10.12.2023
 */
public class Perimeter {
    // private final float PI = 3.14f;

    public double calculatePerimeter (float diameter) {
/*        float radius = diameter / 2;
        double perimeter = 2 * Math.PI * radius;

        return perimeter;*/

        return  2 * Math.PI * (diameter / 2);
    }
}
