package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Text {

    public void substring() { //1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
        System.out.print("Введите предложение: ");
        Scanner line = new Scanner(System.in);
        String string1 = line.nextLine();
        char[] chars = new char[string1.length()];
        System.out.print("Введите индекс символа начала подстроки: ");
        Scanner scan1 = new Scanner(System.in);
        int start = scan1.nextInt();
        System.out.print("Введите индекс символа, следующего за концом подстроки: ");
        Scanner scan2 = new Scanner(System.in);
        int end = scan2.nextInt();
        if (end > chars.length) {
            System.out.print(false);
            return;
        }
        string1.getChars(start, end, chars, 0);
        System.out.print(Arrays.toString(chars));
    }

    public void replacement() { //2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в позиции 0
        System.out.print("Введите предложение: ");
        Scanner line = new Scanner(System.in);
        String string2 = line.nextLine();
        System.out.print("Введите позицию символа 1: ");
        Scanner scan1 = new Scanner(System.in);
        int n = scan1.nextInt();
        char n1 = string2.charAt(n);
        System.out.print("Введите позицию символа 2: ");
        Scanner scan2 = new Scanner(System.in);
        int m = scan2.nextInt();
        char m1 = string2.charAt(m);
        System.out.print(string2.replace(n1, m1));
    }


    public void polindrom() { //3)В исходном файле находятся слова, каждое слово на новой стороке. После запуска программы должен создать файл, который будет содержать в себе только полиндромы

        System.out.print("Введите слова: ");
        Scanner line = new Scanner(System.in);
        String string3 = line.nextLine();
        String[] words = string3.split(" ");
        for (String word : words) {

            char[] array = word.toCharArray();
            String result = "";
            for (int i = array.length - 1; i >= 0; i--) {
                result = result + array[i];
            }
            if(word.equals(result))
                System.out.println(word);
        }

    }
}
