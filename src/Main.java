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
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int input = scanner1.nextInt();
        new FizzBuzz(input);

        // Fibonacci series
        System.out.println("\n\nFibonacci Series: \nEnter an Integer:");
        int inputF = scanner1.nextInt();
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

        Product product1 = new Product();
        product1.setName("Chips");
        product1.setPrice(2.453f);

        Product product2 = new Product();
        product2.setName("Milk");
        product2.setPrice(1f);

        Product product3 = new Product();
        product3.setName("Yogurt");
        product3.setPrice(0.45f);

        Product product4 = new Product();
        product4.setName("Egg");
        product4.setPrice(1.45f);

        Product product5 = new Product();
        product5.setName("Carrot");
        product5.setPrice(2f);

        Product product6 = new Product();
        product6.setName("Cake");
        product6.setPrice(13.35f);

        Product[] productsMenu  = {product, product1, product2, product3, product4, product5, product6};

        System.out.println("Welcome to Shopping");
        System.out.println("Choose products from the below list:");

        // Listing product
        for (int i = 0; i < productsMenu.length; i++) {
            System.out.println(i + ". " + productsMenu[i].getName() + ": " + productsMenu[i].getPrice() +" EUR");
        }

        boolean toAddMore;
        Product[] products = new Product[50];
        int counter = 0;
        Scanner scanner2 = new Scanner(System.in);

        do {
            System.out.println("Enter a product number:");
            int productOption = scanner2.nextInt();
            System.out.println("Enter quantity:");
            int productQuantity = scanner2.nextInt();

            Product choosenProduct = productsMenu[productOption];
            choosenProduct.setQuantity(productQuantity);
            products[counter] = choosenProduct;

            System.out.println("Do you want to add more? True or False");
            toAddMore = scanner2.nextBoolean();
            counter++;
        } while (toAddMore);


        float totalPrice = calculateTotalPrice(products);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setProducts(products);
        shoppingCart.setTotalPrice(totalPrice);

        //Ask user to pay: provide options like card, bank transfer, cash
        System.out.println("\nShopping cart:");

        Product[] shoppingCartProducts = shoppingCart.getProducts();

        for (int i = 0; i < shoppingCartProducts.length; i++) {
            Product p = shoppingCartProducts[i];

            if (p != null) {
                System.out.println((i + 1) + ". " + p.getName() + ": " + p.getQuantity());
            }
        }

        System.out.println("Grant total: " +  shoppingCart.getTotalPrice() + " EUR");
        System.out.println("How would you like to pay? \n1. Cash \n2. Card\n3. Bank transfer");
        int paymentOption = scanner2.nextInt();
        shoppingCart.setPaid(true);
        System.out.println("\nPayment Successful!");
        System.out.println("\nThank you for shopping!");
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
        float totalPrice = 0;

        for (Product product: products) {
            if (product != null) {
                totalPrice = totalPrice + (product.getQuantity() * product.getPrice());
            }
        }

        return totalPrice;
    }
}