package by.epam.tr.start.payment;

import java.util.Scanner;

public class ItemReader {

    public static Item enterItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter item price: ");
        while (!sc.hasNextDouble()){
            sc.next();
        }
        double itemPrice = sc.nextDouble();
        Item item = new Item(itemName, itemPrice);
        return item;
    }
}
