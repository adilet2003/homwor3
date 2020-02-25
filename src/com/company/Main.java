package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        while (true) {
            try {
                bankAccount.withDraw(3000);
            } catch (LimitExeption e) {
                System.out.println("Остаток счета  -"+bankAccount.getAmount());
                try {
                    bankAccount.withDraw(bankAccount.getAmount());
                } catch (LimitExeption limitExeption) {
                    limitExeption.printStackTrace();
                }
                break;
            }
        }
    }
}
