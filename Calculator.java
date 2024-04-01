package com.mycompany.calculator;

import java.util.Scanner;

public class Calculator {

    private void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number :");
        double x = sc.nextDouble();
        System.out.print("\nEnter Your Secoend Number :");
        double y = sc.nextDouble();
        System.out.print("\nEnter Your Third Number :");
        double z = sc.nextDouble();
        double sum = x + y + z;
        System.out.println("Sum of " + x + "+" + y + " +" + z + " = " + sum);
    }

    private void multiply() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number :");
        double x = sc.nextDouble();
        System.out.print("\nEnter Your Secoend Number :");
        double y = sc.nextDouble();
        double mul = x * y;
        System.out.println("Multyply  of " + x + " X " + y + " = " + mul);

    }

    private void divide() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number :");
        double x = sc.nextDouble();
        System.out.print("\nEnter Your Secoend Number :");
        double y = sc.nextDouble();
        double div = x / y;
        System.out.println("Devide  of " + x + " / " + y + " = " + div);

    }

    private void Substration() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number :");
        double x = sc.nextDouble();
        System.out.print("\nEnter Your Secoend Number :");
        double y = sc.nextDouble();
        double div = x - y;
        System.out.println("Substration  of " + x + " - " + y + " = " + div);
    }

    private void precentage() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Amount :");
        double x = sc.nextDouble();
        System.out.print("\nEnter rate :");
        double y = sc.nextDouble();

        double pre = x * (y / 100);
        System.out.println("Precentage  of " + x + " by " + y + " = " + pre);

    }

    private void remainders() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :");
        double x = sc.nextDouble();
        System.out.print("\nEnter dividing Amount :");
        double y = sc.nextDouble();

        double rem = x % y;
        System.out.println("remainders  of " + x + " Dividing by" + y + " = " + rem);

    }

    private void discount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount :");
        double x = sc.nextDouble();
        System.out.print("\nEnter precentage :");
        double y = sc.nextDouble();

        double dis = x * (100 - y / 100);
        System.out.println("after discount price is " + x + " by " + y + " = " + dis);

    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("which part do you want to do");
        System.out.println("Sum   press  : 1");
        System.out.println("multiply   press  : 2");
        System.out.println("Devide   press  : 3");
        System.out.println("Substraction   press  : 4");
        System.out.println("Precentage   press  : 5");
        System.out.println("Remainders   press  : 6");
        System.out.println("Discount   press  : 7");

        int a = sc.nextInt();

        switch (a) {
            case 1 ->
                cal.sum();
            case 2 ->
                cal.multiply();
            case 3 ->
                cal.divide();
            case 4 ->
                cal.Substration();
            case 5 ->
                cal.precentage();
            case 6 ->
                cal.remainders();
            case 7 ->
                cal.discount();

        }
        System.out.println("");
        System.out.println("do you need more calculation(y,n)");
        sc.nextLine();
        String iteration = sc.nextLine();
        while (iteration == "y" || iteration == "Y") {
            System.out.println("which part do you want to do");
            System.out.println("Sum   press  : 1");
            System.out.println("multiply   press  : 2");
            System.out.println("Devide   press  : 3");
            System.out.println("Substraction   press  : 4");
            System.out.println("Precentage   press  : 5");
            System.out.println("Remainders   press  : 6");
            System.out.println("Discount   press  : 7");

            int b = sc.nextInt();

            switch (b) {
                case 1 ->
                    cal.sum();
                case 2 ->
                    cal.multiply();
                case 3 ->
                    cal.divide();
                case 4 ->
                    cal.Substration();
                case 5 ->
                    cal.precentage();
                case 6 ->
                    cal.remainders();
                case 7 ->
                    cal.discount();

            }
            System.out.println("");
            System.out.println("do you need more calculation(y,n)");
            sc.nextLine();
            iteration = sc.nextLine();
        }
    }

}
