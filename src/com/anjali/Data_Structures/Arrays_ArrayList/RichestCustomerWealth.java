package com.anjali.Data_Structures.Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxWealth = 0;

        System.out.print("Enter number of customers: ");
        int numAccounts = in.nextInt();

        System.out.print("Enter number of bank accounts: ");
        int numBanks = in.nextInt();

        ArrayList<ArrayList<Integer>> accounts = new ArrayList<>(10);

        System.out.print("Enter amount of each customer: ");

        for (int row = 0;  row < numAccounts; row++) {
            accounts.add(new ArrayList<>()); // initialization
            for (int col = 0; col < numBanks; col++) {
                accounts.get(row).add(in.nextInt());
            }
        }
        System.out.println("Accounts: " + accounts);

        for (ArrayList<Integer> account : accounts) {
            int totalWealth = 0;
            for (int amount : account) {
                totalWealth += amount;
            }
//            maxWealth = Math.max(totalWealth, maxWealth);
            if (totalWealth > maxWealth)
                maxWealth = totalWealth;
        }

        System.out.println("maxWealth: " + maxWealth);
    }
}
