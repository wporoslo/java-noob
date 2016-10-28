package com.github.wporoslo.javanoob;

import java.util.Scanner;

/**
 * Created by Wojciech on 28.10.2016.
 */
public class JavaNoob {
    public static void main(String[] args) {
        String name = readName();
        JavaNoob.printHello(name);
    }

    static void printHello(String name) {
        System.out.println("Hello, " + name + "!");
        System.out.println("Bye bye, " + name + "!");
    }

    static String readName() { //tworzę static metodę zwracającą String
        //tworzę zmienną lokalną typu Scanner (klasa interpretująca znaki)
        // (System.in reprezentuje standardowe wejście (STD IN), np. klawiature)
        Scanner scanner = new Scanner(System.in);
        // calluję metodę do wypisania znaków na STD OUT
        System.out.print("Enter your name: ");
        // tworzę zmienną name typu String i przypisuję do niej wartość wykonania metody scanner.nextLine()
        // scanner.nextLine() odczytuje ostatnią wprowadzoną linię ze swojego źródła (czyli System.in - klawiatura)
        String name = scanner.nextLine();
        return name;
    }

}
