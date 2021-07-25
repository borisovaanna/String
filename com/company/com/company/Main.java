package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Text words = new Text();
        //words.substring();
        //words.replacement();
        //words.polindrom();

        System.out.print("Введите текст: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] sentencies = text.split("\\. ");
        for (String sentence : sentencies) {
            TextFormater.phrase = sentence;
            TextFormater.polindromIs();
            if (TextFormater.check != true)
                TextFormater.count();
        }
    }
}
