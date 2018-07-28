package com.dagabienkowska;

import java.util.Stack;

public class Stos_kolejka {

    public static void main(String[] args) {

        String abc = "ABCdefg";
        System.out.println(abc);
        Stack<Character> reverse = new Stack<>();
        for (int i = 0; i < abc.length(); i++) {
            reverse.push(abc.charAt(i));
        }

        String reversed = "";
        for (int i = 0; i <= reverse.size() + i; i++) {
            if (reverse.size() == 0) {
                break;
            }
            reversed += reverse.pop();

        }
        System.out.println(reversed);

        String palindrome = "wrotki";
        Stack<Character> pali = new Stack<>();
        for (int i = 0; i < palindrome.length(); i++) {
            pali.push(palindrome.charAt(i));
        }

        String paliCheck= "";
        for (int i = 0; i <= pali.size() + i; i++) {
            if (pali.size() == 0) {
                break;
            }
            paliCheck +=pali.pop();
        }
        if (palindrome.equals(paliCheck)){
            System.out.println("Słowo " +palindrome+" jest palindromem");
        } else {
            System.out.println("Słowo " +palindrome+" nie jest palindromem");
        }
    }
}
