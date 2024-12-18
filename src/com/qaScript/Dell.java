package com.qaScript;

public class Dell implements Company{

    public void getProducts(){
        System.out.println("All products");
    }

    public void getEmployees() {
        System.out.println("All Employees");
    }

    public static void main(String[] args) {
        Dell dell = new Dell();
        dell.getProducts();
        dell.getEmployees();
    }
}

