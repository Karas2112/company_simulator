package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException, ParseException {


        wlasciciel me = new wlasciciel();
        char quit = 'n';
        String input;
        int choice;

        String date = "2020-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));


        Scanner scan = new Scanner(System.in);

        client Bartek = new client("Bartek Karas", "wyluzowany");

        project project1 = new project("projekt 1", Bartek, 12032020.,500,5000, date, "easy");
        project project2 = new project("projekt 2", Bartek,1223232, 500, 2342, date, "medium");

        while(quit != 'y'){
            System.out.println("Dzień: " + date + "                                           " + "Stan konta: " + me.budget + "\n" +
                    "\nWybierz opcję:" + "\n" +
                    "\n1. PROGRAMMM!!1!" +
                    "\n2. Search for clients" +
                    "\n3. Sign new contract" +
                    "\n4. Spend all day testing..." +
                    "\n5. Submission project" +
                    "\n6. Employee menagment" +
                    "\n7. fuck with departments" +
                    "\n8. wyjdz z gry");
            System.out.println();
            choice = scan.nextInt();

            switch (choice){
                case 1:

                    wlasciciel.program();
                    c.add(Calendar.DATE, 1);
                    date = sdf.format(c.getTime());
                    break;
                case 2:
                    System.out.println("nic2");
                    c.add(Calendar.DATE, 1);
                    date = sdf.format(c.getTime());
                    break;
                case 3:
                    System.out.println("nic3");
                    c.add(Calendar.DATE, 1);
                    date = sdf.format(c.getTime());
                    break;
                case 4:
                    System.out.println("nic4");
                    c.add(Calendar.DATE, 1);
                    date = sdf.format(c.getTime());
                    break;
                case 5:
                    System.out.println("nic5");
                    c.add(Calendar.DATE, 1);
                    date = sdf.format(c.getTime());
                    break;
                case 6:
                    System.out.println("nic6");
                    c.add(Calendar.DATE, 1);
                    date = sdf.format(c.getTime());
                    break;
                case 7:
                    System.out.println("nic7");
                    c.add(Calendar.DATE, 1);
                    date = sdf.format(c.getTime());
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

