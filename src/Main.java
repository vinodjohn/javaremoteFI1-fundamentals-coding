import author.poem.Author;
import author.poem.Poem;

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

        // Task-19
        Author author = new Author();
        author.setSurname("Mike");
        author.setNationality("Italy");

        Poem poem = new Poem();
        poem.setCreator(author);
        poem.setStropheNumbers(25);

        Author author1 = new Author();
        author1.setSurname("Panusen");
        author1.setNationality("Finland");

        Poem poem1 = new Poem();
        poem1.setCreator(author1);
        poem1.setStropheNumbers(76);

        Author author2 = new Author();
        author2.setSurname("Joosep");
        author2.setNationality("Estonia");

        Poem poem2 = new Poem();
        poem2.setCreator(author2);
        poem2.setStropheNumbers(10);

        Poem[] poems = {poem, poem1, poem2};
        Author bestAuthor = getBestAuthor(poems);
        System.out.printf("\n%s has written the longest poem!", bestAuthor.getSurname());
    }

    private static Author getBestAuthor(Poem[] poems) {
        int counter = 0;

        for (int i = 1; i < poems.length; i++) {
            if (poems[counter].getStropheNumbers() < poems[i].getStropheNumbers()) {
                counter = i;
            }
        }

        return poems[counter].getCreator();
    }
}