package com.dagabienkowska;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Stos_kolejka {

    private class Woman {
        String name;

        public Woman() {
        }

        public Woman(String name) {

            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setNameW(String name) {
            this.name = name;
        }
    }

    private class Man {
        String name;

        public Man() {
        }

        public Man(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        //odwracanie
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

        String paliCheck = "";
        for (int i = 0; i <= pali.size() + i; i++) {
            if (pali.size() == 0) {
                break;
            }
            paliCheck += pali.pop();
        }
        if (palindrome.equals(paliCheck)) {
            System.out.println("Słowo " + palindrome + " jest palindromem");
        } else {
            System.out.println("Słowo " + palindrome + " nie jest palindromem");
        }
        Scanner scanner = new Scanner(System.in);
        int noOfPpl = 10;
        List<String> women = new LinkedList<>();
        List<String> men = new LinkedList<>();

        for (int i = 0; i < noOfPpl; i++) {
            System.out.println("Podaj imię uczestnika");
            String input = scanner.nextLine();
            if (input.endsWith("a") && women.isEmpty()) {//kobieta i pusta lista
                if (men.isEmpty()) {
                    women.add(input);
                } else {
                    System.out.println(input + " | " + ((LinkedList<String>) men).getFirst());
                    ((LinkedList<String>) men).removeFirst();
                }
            } else if (input.endsWith("a")) {//kobieta i lista nie pusta
                women.add(input);
            } else if (men.isEmpty()){//facet i lista pusta
                if (women.isEmpty()) {
                    men.add(input);
                } else {
                    System.out.println(input + " | " + ((LinkedList<String>) women).getFirst());
                    ((LinkedList<String>) women).removeFirst();
                }
            } else {
                men.add(input);
            }
            System.out.println(men+"\n" +women);
        }

    }
}
