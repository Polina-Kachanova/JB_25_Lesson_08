package by.epam.tr.start.payment;

import java.util.ArrayList;
import java.util.Scanner;

public class Payment {

    ArrayList<Item> itemsList;
    Scanner sc;

    public Payment() {
        itemsList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public ArrayList<Item> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public void addItemToPayment() {
        String answer = "yes";
        while(!answer.equals("no")){
            Item item = ItemReader.enterItem();
            itemsList.add(item);
            System.out.println("Add one more item?");
            answer = sc.nextLine();
        }
    }

    public void removeItemFromPayment() {
        System.out.println("Enter the name of item to be removed: ");
        String itemToBeRemoved = sc.nextLine();
        for (Item item: this.getItemsList()) {
            if (item.getItemName().equalsIgnoreCase(itemToBeRemoved)) {
                this.getItemsList().remove(item);
            }
        }
    }

    public void printPayment(){
        for (Item item: itemsList) {
            System.out.println(item.getItemName() + " (price: " + item.getItemPrice() + ")");
        }
    }
}
