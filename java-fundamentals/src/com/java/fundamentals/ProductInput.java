package com.java.fundamentals;

import java.util.Scanner;

public class ProductInput {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product ID : ");
        byte id = scanner.nextByte();

        System.out.println("Enter Product Name : ");
        String productName = scanner.next();

        System.out.println("Enter Manufactured Year : ");
        short manufacturedYear = scanner.nextShort();;

        System.out.println("Enter Max Retail Price : ");
        int maxRetailPrice = scanner.nextInt();

        System.out.println("Enter Discount Percentage : ");
        float discountPercentage = scanner.nextFloat();

        System.out.println("Enter Product Final Price : ");
        double finalPrice = scanner.nextDouble();

        System.out.println("Enter Product Category : ");
        char productCategory = scanner.next().charAt(0);

        System.out.println("is Product Available (true/flase) : ");
        boolean isAvailable = scanner.nextBoolean();

        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + productName);
        System.out.println("Manufactured Year : " + manufacturedYear);
        System.out.println("Max Retail Price : " + maxRetailPrice);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Product Final Price : " + finalPrice);
        System.out.println("Product Category : " + productCategory);
        System.out.println("is Product Available : " + isAvailable);




    }
}
