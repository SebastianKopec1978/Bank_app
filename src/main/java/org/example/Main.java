package org.example;

import org.example.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Witaj w naszym banku!");
        System.out.println("Wprowadź imie");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("Wprowadź nazwisko");
        String surname= scanner.nextLine();
        System.out.println("Wprowadź numer pesel");
        int pesel= scanner.nextInt();

        User user1 = new User(name, surname, pesel);

        System.out.println("Menu\n 1.Informacje o koncie\n 2.Wpłata pieniędzy \n 3.Wypłata pieniędzy\n 4.Wyjście");
        System.out.println("Co byś chciał zrobić?");
        int select= scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Informacje o koncie");
                user1.userDetails();
                break;
            case 2:
                System.out.println("Wpłata pieniędzy");
                break;
            case 3:
                System.out.println("Wypłata pieniędzy");
                break;
            case 4:
                System.out.println("Wyjście");
                break;

        }

    }
}