package SelftDirectedTask;

/*
 * Develop a ShopApp program that holds 5 Product objects in an array,
 * representing products sold in a shop.
 * The ShopApp program allow users to display all products,
 * buy stock, sell stock, reprice an item of stock and display the total value of all stock in the shop.
 * @author Mahmudul Hassan
 * @verson 08/12/2024
 */
import java.util.*;

public class ShopApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Display Student Number
        System.out.println("Student Number: 2633850");

        // Create an array of 5 Product objects
        Product[] products = new Product[5];
        products[0] = new Product("Laptop", 50, 850);
        products[1] = new Product("Smartphone", 30, 1250);
        products[2] = new Product("Tablet", 35, 450);
        products[3] = new Product("Digital Camera", 25, 650);
        products[4] = new Product("Television", 50, 1100);

        // Menu Driven Interface

        while(true){
            System.out.println("\n*****Shop Management System*****");
            System.out.println("1. Display All Products");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Reprice stock");
            System.out.println("5. Display Total Stock Value");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = validateInput(sc, 1, 6);

            switch(choice){
                case 1:
                    displayProducts(products);
                    break;
                case 2:
                    buyStock(products, sc);
                    break;
                case 3:
                    sellStock(products, sc);
                    break;
                case 4:
                    repriceItem(products, sc);
                    break;
                case 5:
                    displayTotalStockValue(products);
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println(" Invalid option. Pleae try again.");
            }

        }
    }

    // Display all products
    public static void displayProducts(Product[] products){
        System.out.println("\n***Product List ****");
        for(int i=0; i<products.length; i++){
            Product p = products[i];
            double stockValue = p.getStockLevel() * p.getPrice();
            System.out.printf("%d. %s - Stock: %d, Price: £%.2f, Total Value: £%.2f%n", (i + 1), p.getName(), p.getStockLevel(), p.getPrice(), stockValue);
        }
    }
    // Buy stock for a product
    public static void buyStock(Product[] products, Scanner sc){
        displayProducts(products);
        System.out.print("Enter the product number to buy stock(1-5): ");
        int productIndex = validateInput(sc, 1, products.length) - 1;
        System.out.print("Enter the quantity to add: ");
        int quantity = validatePositiveInt(sc);
        double cost = products[productIndex].buyStock(quantity);
        System.out.printf("%d units of %s added for £%.2f%n", quantity, products[productIndex].getName(), cost);
    }


    // Sell stock for a product
    public static void sellStock(Product[] products, Scanner sc){
        displayProducts(products);
        System.out.print("Enter the product number to sell stock(1-5): ");
        int productIndex = validateInput(sc, 1, products.length)- 1;


        System.out.print("Enter the quantity to sell: ");
        int quantity = validatePositiveInt(sc);
        boolean success = products[productIndex].sell(quantity);
        if(success){
            System.out.printf("%d units of %s sold%n", quantity, products[productIndex].getName());
        }else{
            System.out.println("Sale failed. Not enough stock");
        }

    }


    //Reprice an Item

    public static void repriceItem(Product[] products, Scanner sc){
        displayProducts(products);
        System.out.print("Enter the product number to reprice: ");
        int productIndex = validateInput(sc, 1, products.length)-1;

        System.out.print("Enter the new price: ");
        double newPrice = validatePositiveDouble(sc);
        products[productIndex].setPrice(newPrice);
        System.out.printf("Price of %s updated to £%.2f.%n" , products[productIndex].getName(), newPrice);

    }
    // Display Total Stock Value
    public static void displayTotalStockValue(Product[] products){
        double totalValue = 0;
        for (Product p: products){
            totalValue += p.getStockLevel() * p.getPrice();
        }
        System.out.printf("\nTotal value of stock: £%.2f%n", totalValue);
    }


    // Validate integer input within a range
    public static int validateInput(Scanner sc, int min, int max){
        int input;
        while(true)
        {
            try
            {
                input = sc.nextInt();
                if(input>=min && input<=max) break;
                else System.out.print("Invalid choice. Enter a number between " + min + " and "+ max + ": ");
            }
            catch(InputMismatchException e)
            {
                System.out.print("Invalid input. Enter a number: ");
                sc.next();// Clear invalid input
            }
        }
        return input;
    }

    // Validate positive integer
    public static int validatePositiveInt(Scanner sc){
        int input;
        while(true){
            try{
                input = sc.nextInt();
                if(input>0) break;
                else System.out.print("Enter a positive number: ");
            }catch(InputMismatchException e){
                System.out.print("Invalid input. Enter a number: ");
                sc.next();
            }
        }
        return input;
    }

    //Validate positive double

    public static double validatePositiveDouble(Scanner sc){
        double input;
        while(true){
            try{
                input = sc.nextDouble();
                if(input>0) break;
                else System.out.print("Enter a positive number: ");
            }catch(InputMismatchException e){
                System.out.print("Invalid input. Enter a positive number: ");
                sc.next();
            }
        }
        return input;
    }
}