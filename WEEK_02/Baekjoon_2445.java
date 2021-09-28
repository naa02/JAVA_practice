package WEEK_02;

import java.util.Scanner;

public class Baekjoon_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int s = (n - 1); s > i; s--) {
                System.out.print(" ");
            }
            for (int q = (n - 1); q > i; q--) {
                System.out.print(" ");
            }
            for (int w = 0; w <= i; w++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int e = 0; e < n-1; e++) {
            for (int r = (n-1); r >= e+1; r--) {
                System.out.print("*");
            }
            for (int t = 0; t < e+1; t++) {
                System.out.print(" ");
            }
            for (int a = 0; a < e+1; a++) {
                System.out.print(" ");
            }
            for (int d = (n-1); d >= e+1; d--) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }
