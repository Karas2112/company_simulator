package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        wlasciciel me = new wlasciciel();
        char quit = 'n';
        String input;
        int choice;

        Scanner scan = new Scanner(System.in);

        while(quit != 'y'){
            System.out.println("Dzień: 1.01.2020" + "                                           " + "Stan konta: " + me.budget + "\n" +
                    "\nWybierz opcję:" + "\n" +
                    "\n1. PROGRAMMM!!1!" +
                    "\n2. Search for clients" +
                    "\n3. Sign new contract" +
                    "\n4. Spend all day testing..." +
                    "\n5. Submission project" +
                    "\n6. Employee menagment" +
                    "\n7. fuck with departments" +
                    "\n8. wyjdz z gry");
            choice = scan.nextInt();

            switch (choice){
                case 1:

                    wlasciciel.program();
                    System.out.println("nic");
                    break;
                case 2:
                    System.out.println("nic2");
                    break;
                case 3:
                    System.out.println("nic3");
                    break;
                case 4:
                    System.out.println("nic4");
                    break;
                case 5:
                    System.out.println("nic5");
                    break;
                case 6:
                    System.out.println("nic6");
                    break;
                case 7:
                    System.out.println("nic7");
                    break;
                case 8:
                    System.out.println("Sure you want to leave? (y/n): ");
                    input = scan.next().toLowerCase();
                    quit = input.charAt(0);
                    break;
                default:
                    System.out.println("to nie byla zadna opcja...");
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
            }







        }


    }
}

