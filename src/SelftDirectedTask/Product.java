package SelftDirectedTask;


public class Product {
    private String name;
    private int stockLevel;
    private double price;

    // Constructor
    public Product(String name, int stockLevel, double price){
        this.name = name;
        this.stockLevel =stockLevel;
        this.price = price;
    }

    // Method to buy stock
    public double buyStock(int quantity){
        stockLevel += quantity;
        return price * quantity;
    }

    // Method to sell stock
    public boolean sell(int quantity){
        if(quantity <= 0){
            System.out.println("Invalid quantity. Sale can not be processed");
            return false;
        }
        if(stockLevel >= quantity)
        {
            stockLevel -= quantity;
            System.out.println("Sale successful " +quantity+ " item was sold.");
            return true;
        }
        else
        {
            System.out.println("Sale failed. Not enough item in stock.");
            return false;
        }
    }
    // Method to set a new price
    public void setPrice(double price)
    {
        this.price=price;
    }

    //Getters for attributes
    public String getName()
    {
        return name;
    }

    public int getStockLevel()
    {
        return stockLevel;
    }

    public double getPrice()
    {
        return price;
    }


    public double getTotalValue()
    {
        return price * stockLevel;
    }

}


