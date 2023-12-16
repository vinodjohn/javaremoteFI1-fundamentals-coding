/**
 * @author Vinod John
 * @Date 10.12.2023
 */
public class CircleArea {
    public CircleArea (double diameter) {
        double result = Math.PI * Math.pow(diameter / 2, 2);
        System.out.printf("%nArea of circle is %f", result);
    }
}
