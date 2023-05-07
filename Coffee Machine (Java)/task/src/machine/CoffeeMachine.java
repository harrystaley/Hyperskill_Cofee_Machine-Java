package machine;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water_per_cup = 200; // measured in ml
        int milk_per_cup = 50; // measured in ml
        int beans_per_cup = 15; // measured in g
        int water = 400; // measured in ml
        int milk = 540; // measured in ml
        int beans = 120; // measured in g
        int dis_cups = 9; //number of disposable cups
        int dollars = 550; //number of dollars
        boolean enter_more = true;
        while (enter_more) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String operation = scanner.next();
            switch (operation) {
                case "buy" -> {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String buy_choice = scanner.next();
                    switch (buy_choice) {
                        case "back" -> {
                        }
                        case "1" -> { //espresso
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough coffee!");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                beans -= 16;
                                dollars += 4;
                                dis_cups -= 1;
                            }
                        }
                        case "2" -> { // latte
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough coffee!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                beans -= 20;
                                milk -= 75;
                                dollars += 7;
                                dis_cups -= 1;
                            }
                        }
                        case "3" -> { // cappucino
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beans < 12) {
                                System.out.println("Sorry, not enough coffee!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                beans -= 12;
                                milk -= 100;
                                dollars += 6;
                                dis_cups -= 1;
                            }
                        }
                    }
                }
                case "fill" -> {
                    System.out.println("Write how many ml of water you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add::");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    dis_cups += scanner.nextInt();
                }
                case "take" -> {
                    System.out.println("I gave you $" + dollars);
                    dollars = 0;
                }
                case "remaining" -> {
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println(beans + " g of coffee beans");
                    System.out.println(dis_cups + " disposable cups");
                    System.out.println("$" + dollars + " of money\n");
                }
                case "exit" -> {
                    enter_more = false;
                }
            }
        }
    }
}
