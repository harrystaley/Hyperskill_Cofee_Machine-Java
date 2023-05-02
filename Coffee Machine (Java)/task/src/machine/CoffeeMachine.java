package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        System.out.println("""
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!""");
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        int water = 200; // measured in ml
        int milk = 50; // measured in ml
        int beans = 15; // measured in g
        System.out.print(String.format("""
                For {0} cups of coffee you will need:
                {1} ml of water
                {2} ml of milk
                {3} g of coffee beans
                %n""", cups, water, milk, beans));
    }
}
