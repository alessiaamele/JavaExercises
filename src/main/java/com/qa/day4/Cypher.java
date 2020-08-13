package com.qa.day4;
import java.util.Scanner;

public class Cypher {

    static Scanner scan = new Scanner(System.in);
    static String word;

    public static String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};

    public static void main(String[] args) {
    word = scan.nextLine();
    }

    public static void messageConverter(String word) {
        // converting the word (a string) into a co format
        //String[] arrayWord = new String[word.length()];
        //for (int k = 0; k < word.length(); k++) {
          //  arrayWord[k] = word.charAt(k);

            // converting the message
            String[] cypherWord = new String[word.length()];

            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (word(i) == alphabet[j]) {
                        cypherWord[i] = alphabet[13 - j];
                    }
                }
            }
        }
    }
}


