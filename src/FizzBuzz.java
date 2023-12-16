/**
 * Fizz Buzz
 *
 * @author Vinod John
 * @Date 10.12.2023
 */
public class FizzBuzz {
    public FizzBuzz(int input) {
        int i = 0;

        while (i <= input) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

            i++;
        }

    }
}