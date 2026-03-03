import java.util.Scanner;
public class MovieTicket
    {
    public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        double finalPrice;
        if (age < 12) {
            finalPrice = price - (price * 50 / 100);
        } else if (age > 60) {
            finalPrice = price - (price * 30 / 100);
        } else {
            finalPrice = price;
        }
        System.out.println("Final ticket price is: " + finalPrice);
        sc.close();
    }
}

import java.util.Scanner;
public class TemperatureAlert
    {
    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room temperature: ");
        double temp = sc.nextDouble();
        if (temp < 18) {
            System.out.println("Too Cold");
        } else if (temp > 30) {
            System.out.println("Too Hot");
        } else {
            System.out.println("Comfortable");
        }
        sc.close();
    }
}

import java.util.Scanner;
public class StudentResult 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}

import java.util.Scanner;
public class MenuProgram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Pasta");
        System.out.println("4. Sandwich");
        System.out.print("Enter menu number: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("You selected Burger");
        } else if (choice == 2) {
            System.out.println("You selected Pizza");
        } else if (choice == 3) {
            System.out.println("You selected Pasta");
        } else if (choice == 4) {
            System.out.println("You selected Sandwich");
        } else {
            System.out.println("Invalid menu number");
        }
        sc.close();
    }
}

import java.util.Scanner;
public class ATMWithdrawal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount % 100 != 0) {
            System.out.println("Invalid amount. Enter multiples of 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
        sc.close();
    }

}
