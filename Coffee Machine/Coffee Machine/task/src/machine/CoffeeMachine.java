package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner = new Scanner(System.in);

    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int disposableCups = 9;
    public static int money = 550;

    public static void main(String[] args) {
        boolean exitMachine = false;

        while (!exitMachine) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printState();
                    break;
                case "exit":
                    exitMachine = true;
                    break;
                default:
                    System.out.println("That is not a valid action");
            }
            System.out.println();
        }
    }

    public static void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        String option = scanner.nextLine();

        switch (option) {
            case "1":
                //espresso needs 250 ml of water and 16 g of coffee beans and costs $4 to make 1 coffee.
                if (water >= 250 && coffeeBeans >= 16 && disposableCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water = water - 250;
                    coffeeBeans -= 16;
                    disposableCups -= 1;
                    money += 4;
                } else if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if(coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                break;
            case "2":
                //machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans and costs $7 to make 1 coffee.
                if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && disposableCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    disposableCups -= 1;
                    money += 7;
                } else if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if(coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                break;
            case "3":
                //machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans and costs $6 to make 1 coffee.
                if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && disposableCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    disposableCups -= 1;
                    money += 6;
                } else if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if(coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                break;
            default:
                break;
        }
    }

    public static void fill() {
        System.out.println("\nWrite how many ml of water do you want to add:");
        int addWater = scanner.nextInt();
        scanner.nextLine();
        water += addWater;

        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = scanner.nextInt();
        scanner.nextLine();
        milk += addMilk;

        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        scanner.nextLine();
        coffeeBeans += addCoffeeBeans;

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addCups = scanner.nextInt();
        scanner.nextLine();
        disposableCups += addCups;
    }

    public static void take() {
        System.out.println("I gave you " + money);
        money = 0;
    }

    public static void printState() {
        System.out.println("\nThe coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffeeBeans + " of coffee beans\n" +
                disposableCups + " of disposable cups\n" +
                money + " of money");
    }
}
