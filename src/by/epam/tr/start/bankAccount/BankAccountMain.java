package by.epam.tr.start.bankAccount;

import by.epam.tr.start.bankAccount.BankAccount;

import static by.epam.tr.start.bankAccount.BankAccount.CURRENCY.USD;
import static by.epam.tr.start.bankAccount.BankAccount.CURRENCY.EUR;
import static by.epam.tr.start.bankAccount.BankAccount.CURRENCY.RUB;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccountA = new BankAccount(1000, 100, USD);
        BankAccount bankAccountB = new BankAccount(2000, 200, EUR);
        BankAccount bankAccountC = new BankAccount(3000, 300, RUB);
        BankAccount bankAccountD = new BankAccount(3000, 300, RUB);

        System.out.println(bankAccountA.toString());
        System.out.println(bankAccountB.toString());
        System.out.println(bankAccountC.toString());
        System.out.println(bankAccountD.toString());

        if(bankAccountA.equals(bankAccountB))
            System.out.println("bankAccountA equals to banAccountB");
        else
            System.out.println("bankAccountA IS NOT equal to banAccountB");

        if(bankAccountA.hashCode() == bankAccountB.hashCode())
            System.out.println("bankAccountA hashcode equals to banAccountB hashcode");
        else
            System.out.println("bankAccountA hashcode IS NOT equal to banAccountB hashcode");

        if(bankAccountC.equals(bankAccountD))
            System.out.println("bankAccountC equals to banAccountD");
        else
            System.out.println("bankAccountC IS NOT equal to banAccountD");

        if(bankAccountC.hashCode() == bankAccountD.hashCode())
            System.out.println("bankAccountC hashcode equals to banAccountD hashcode");
        else
            System.out.println("bankAccountC hashcode IS NOT equal to banAccountD hashcode");
    }
}
