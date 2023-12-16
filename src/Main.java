import java.util.Scanner;

/**
 * @author Vinod John
 * @Date 10.12.2023
 */
public class Main {
    public static void main(String[] args) {
        // Task-1
        Perimeter perimeter = new Perimeter();
        double resultPerimeter = perimeter.calculatePerimeter(6.234f);
        System.out.printf("Perimeter: %f", resultPerimeter);

        // Task-17
        new DayDiff("2024-Jan-23");

        //Ex-Task-1
        new CircleArea(45.5d);

        // Task-4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int input = scanner.nextInt();
        new FizzBuzz(input);

        // Fibonacci series
        System.out.println("\n\nFibonacci Series: \nEnter an Integer:");
        int inputF = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciSeries(inputF);
    }
}