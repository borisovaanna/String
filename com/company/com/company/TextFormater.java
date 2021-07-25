package com.company;

import java.util.Locale;

public class TextFormater { //4)Текстовый файл содержит текст. После запуска программы в другой файл должны записаться только те предложения в которых от 3-х до 5-ти слов.
    // Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в новый файл. Пишем все в ООП стиле.
    // Создаём класс TextFormater в котором два статических метода: 1. Метод принимает строку и возвращает кол-во слов в строке. 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром.
    // Если есть возвращает true, если нет false. В main считываем файл. Разбиваем текст на предложения. Используя методы класса TextFormater определяем подходит ли нам предложение.
    // Если подходит добавляем его в новый файл.

    public static String phrase;

    public static boolean check;

    public static void count() {// Сколько слов
        int n = 0;
        if (phrase.length() != 0) {
            n++;
            for (int i = 0; i < phrase.length(); i++) {
                if (phrase.charAt(i) == ' ') {
                    n++;
                }
            }
        }
        if (n >= 3 && n <= 5) {
        System.out.println(phrase);}
    }

    public static void polindromIs(){ // Есть ли полиндром
        String[] words = phrase.split(" ");
        for (String word : words) {
            word = word.toLowerCase(Locale.ROOT);
            char[] array = word.toCharArray();
            String result = "";
            for (int i = array.length - 1; i >= 0; i--) {
                result = result + array[i];
            }
            if (word.equals(result)) {
                check = true;
                System.out.println(phrase);
            }
        }
    }
}
