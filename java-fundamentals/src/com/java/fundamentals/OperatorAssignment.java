package com.java.fundamentals;

import java.util.Scanner;

public class OperatorAssignment {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product ID : ");
        byte id = scanner.nextByte();

        System.out.println("Enter Product Name : ");
        String productName = scanner.next();

        System.out.println("Enter Max Retail Price : ");
        int maxRetailPrice = scanner.nextInt();

        System.out.println("Enter Discount Percentage : ");
        float discountPercentage = scanner.nextFloat();

        float discountAmount = (maxRetailPrice/100) * discountPercentage;
        double productPrice = maxRetailPrice - discountAmount;
        double stateTax = productPrice * 0.025;
        double centralTax = productPrice * 0.025;
        double finalPrice = productPrice + stateTax + centralTax;

        System.out.println("Max Retail Price : " + maxRetailPrice);
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("State TAX : " + stateTax);
        System.out.println("Central TAX : " + centralTax);
        System.out.println("Enter Product Final Price : " + finalPrice);
    }
}
