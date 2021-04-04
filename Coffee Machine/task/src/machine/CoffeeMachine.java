package machine;
import java.util.Scanner;

public class CoffeeMachine {
    private static int currentw = 400;
    private static int currentm = 540;
    private static int currentc = 120;
    private static int currentcups = 9;
    private static int currentmoney = 550;


    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        interact(scanner);
    }

    private static void interact(Scanner scanner) {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String query = scanner.nextLine();
ut
        switch (query) {
            case "remaining":
                remaining(scanner);
                break;
            case "take":
                take(scanner);
                break;
            case "fill":
                fill(scanner);
                break;
            case "buy":
                buy(scanner);
                break;
            case "exit":
                break;
        }
    }

    private static void take(Scanner scanner) {
        System.out.println("I gave you " + currentmoney);
        currentmoney = 0;
        System.out.println();
        interact(scanner);
    }

    private static void remaining(Scanner scanner) {
        System.out.println("The coffee machine has:\n" +
                currentw + " of water\n" +
                currentm + " of milk\n" +
                currentc + " of coffee beans\n" +
                currentcups + " of disposable cups\n" +
                currentmoney + " of money");
        System.out.println();
        interact(scanner);
    }

    private static void fill(Scanner scanner) {
        System.out.println("Write how many ml of water do you want to add: ");
        String water = scanner.nextLine();
        currentw += Integer.parseInt(water);
        System.out.println("Write how many ml of milk do you want to add: ");
        String milk = scanner.nextLine();
        currentm += Integer.parseInt(milk);
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        String coffee = scanner.nextLine();
        currentc += Integer.parseInt(coffee);
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        String cups = scanner.nextLine();
        currentcups += Integer.parseInt(cups);
        System.out.println();
        interact(scanner);
    }

    private static void buy(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, " +
                "2 - latte, 3 - cappuccino, back - to main menu: ");
        String order = scanner.nextLine();
        switch (order) {
            case "1":
                int ew = 250;
                int ec = 16;
                int ecups = 1;
                int ecost = 4;
                if (ew > currentw) {
                    System.out.println("Sorry, not enough water!");
                } else if (ec > currentc) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (ecups > currentcups) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    currentw -= ew;
                    currentc -= ec;
                    currentcups -= ecups;
                    currentmoney += ecost;
                }
                System.out.println();
                break;
            case "2":
                int lw = 350;
                int lm = 75;
                int lc = 20;
                int lcups = 1;
                int lcost = 7;
                if (lw > currentw) {
                    System.out.println("Sorry, not enough water!");
                } else if (lm > currentm) {
                    System.out.println("Sorry, not enough milk!");
                } else if (lc > currentc) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (lcups > currentcups) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    currentw -= lw;
                    currentm -= lm;
                    currentc -= lc;
                    currentcups -= lcups;
                    currentmoney += lcost;
                }
                System.out.println();
                break;
            case "3":
                int cw = 200;
                int cm = 100;
                int cc = 12;
                int ccups = 1;
                int ccost = 6;
                if (cw > currentw) {
                    System.out.println("Sorry, not enough water!");
                } else if (cm > currentm) {
                    System.out.println("Sorry, not enough milk!");
                } else if (cc > currentc) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (ccups > currentcups) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    currentw -= cw;
                    currentm -= cm;
                    currentc -= cc;
                    currentcups -= ccups;
                    currentmoney += ccost;
                }
                System.out.println();
                break;
            case "back":
                System.out.println();
                break;
        }
        interact(scanner);
    }
}