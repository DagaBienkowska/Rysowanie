package com.dagabienkowska;

public class Main {

    public static void main(String[] args) {

        //linia
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        //caly kwadrat
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("**");
            }
            System.out.println();
        }

        //pusty kwadrat
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        //trojkat prostokatny
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //trojkat rownoramienny
        System.out.println("\n");
        n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1 + i*2; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1 + i*2; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n/2-1; i++){
            for (int j = 0; j < n/2+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
