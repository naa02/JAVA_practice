package WEEK_02;

import java.util.Scanner;

public class Baekjoon_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            int b = sc.nextInt();
            a[i] = b;
        }
        for(int j=0; j<n; j++){
            if(a[j]<x){
                System.out.print(a[j] + " ");
            }
        }
    }
}
