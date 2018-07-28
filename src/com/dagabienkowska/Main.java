package com.dagabienkowska;

public class Main {

    public static void main(String[] args) {

        int n = 10;
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }

        System.out.println("\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("**");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 0; i < n; i++){
            if (i == 0 || i == 9){
                for (int j = 0; j < n; j++){
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n; j++){
                    if (j == 0 || j == n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
