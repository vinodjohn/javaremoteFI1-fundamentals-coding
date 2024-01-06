import author.poem.Author;
import author.poem.Poem;
import shopping.Product;
import shopping.ShoppingCart;

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


        // Task: Print Second Largest Value in the array.
        Integer[] intArray = {34, 23, 48, 21, 37, 96, 32};

        int max = 0;
        int secondMax = 0;

        for (Integer i: intArray) {
           if (i > max) {
               secondMax = max;
               max = i;

           }

           if (i > secondMax && i < max) {
               secondMax = i;
           }
        }

        System.out.println("Second largest value in array is: " + secondMax);

        // Find duplicate elements in the array
        Integer[] arr = {3, 4, 6, 7, 3, 2, 7, 3};

        System.out.println("The duplicate values are: ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i].equals(arr[j])) && (i != j)) {
                    System.out.println(arr[j] + " ");
                }
            }
        }


        // Grocery shopping
        // Get product from the USER as input
        Product product = new Product();
        product.setName("Apple");
        product.setPrice(3.45f);

        // Add products to array
        Product[] products = {product};
        float totalPrice = calculateTotalPrice(products);

        // if index will be greater than 5 – finish shopping,


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setProducts(products);
        shoppingCart.setTotalPrice(totalPrice);

        //Ask user to pay: provide options like card, bank transfer, cash
        shoppingCart.setPaid(false);

        // Print the shopping cart
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

    private static float calculateTotalPrice(Product[] products) {
        //TODO
        return 0;
    }
}