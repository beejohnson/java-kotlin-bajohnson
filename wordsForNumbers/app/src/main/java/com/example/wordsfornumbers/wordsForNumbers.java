package com.example.wordsfornumbers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.TreeMap;

public class wordsForNumbers {
    BufferedReader in;
    BufferedWriter out;

    public wordsForNumbers(BufferedReader in, BufferedWriter out) {
        this.in = in;
        this.out = out;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    }

    TreeMap< String, Integer > vars = new TreeMap< String , Integer >();

    public void runIt() throws Exception {
        while (in.ready()) {
            int x = 0;
            for (String s : in.readLine().split(" ")) {
                if (Character.isDigit(s.charAt(0))) {
                    String word = getWords(Integer.parseInt(s), "");
                    if (x == 0)
                        word = word.substring(0, 1).toUpperCase() + word.substring(1);
                    out.write(word + " ");
                } else
                    out.write(s + " ");
                x++;
            }
            out.write("\n");
        }

        out.close();
        out.close();
    }

    private static String getWords(int num, String s) {
        if (num >= 20 && num < 30)                          //if # has a second part, add the '-'
            return num == 20 ? "twenty" : getWords(num % 10, "twenty-");
        if (num >= 30 && num < 40)
            return num == 30 ? "thirty" : getWords(num % 10, "thirty-");
        if (num >= 40 && num < 50)
            return num == 40 ? "forty" : getWords(num % 10, "forty-");
        if (num >= 50 && num < 60)
            return num == 50 ? "fifty" : getWords(num % 10, "fifty-");
        if (num >= 60 && num < 70)
            return num == 60 ? "sixty" : getWords(num % 10, "sixty-");
        if (num >= 70 && num < 80)
            return num == 70 ? "seventy" : getWords(num % 10, "seventy-");
        if (num >= 80 && num < 90)
            return num == 80 ? "eighty" : getWords(num % 10, "eighty-");
        if (num >= 90)
            return num == 90 ? "ninety" : getWords(num % 10, "ninety-");
        if (num == 10)
            return "ten";
        if (num == 11)
            return "eleven";
        if (num == 12)
            return "twelve";
        if (num == 13)
            return "thirteen";
        if (num == 14)
            return "fourteen";
        if (num == 15)
            return "fifteen";
        if (num == 16)
            return "sixteen";
        if (num == 17)
            return "seventeen";
        if (num == 18)
            return "eighteen";
        if (num == 19)
            return "nineteen";
        if (num == 0)
            return "zero";
        if (num == 1)
            return s + "one";
        if (num == 2)
            return s + "two";
        if (num == 3)
            return s + "three";
        if (num == 4)
            return s + "four";
        if (num == 5)
            return s + "five";
        if (num == 6)
            return s + "six";
        if (num == 7)
            return s + "seven";
        if (num == 8)
            return s + "eight";
        if (num == 9)
            return s + "nine";
        return "";
    }
}

