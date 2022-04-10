package odessa;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Дана строка. Вывести строку, содержащую те же символы, но расположенные в обратном порядке.
     */
    static void task10() {
        System.out.println("task30");
        String text = "Some text";
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        System.out.println(reversed);
    }

    /**
     * Даны строки S и S0.
     * Удалить из строки S первую подстроку, совпадающую с S0.
     * Если совпадающих подстрок нет, то вывести строку S без изменений.
     */

    static void task33() {
        System.out.println("\ntask33");
        String S = "Some text";
        String S0 = "Some text2";
        System.out.println(S);
        System.out.println(S0);
        if (S0.contains("Some") || S0.contains("text")) {
            System.out.println(S.replace("Some", ""));
        } else {
            System.out.println("There is no matching substrings");
        }
    }

    /**
     * Дана строка-предложение заданное кириллицей.
     * Вывести самое короткое слово в предложении.
     * Если таких слов несколько, то вывести последнее из них.
     * Словом считать набор символов, не содержащий пробелов, знаков препинания и ограниченный пробелами,
     * знаками препинания или началом/концом строки.
     */

    static void task56() {
        String SentenceString = "найти в строке предложении самое короткое слово предложении";
        String[] words = SentenceString.split(" ");
        String minWord=words[0];
        for (String word : words)
            if (word.length() < minWord.length())
                minWord = word;
        System.out.println("Самое короткое слово: " + minWord);
    }




    public static void main(String[] args) {
        task10();
        task33();
        task56();
    }
}
