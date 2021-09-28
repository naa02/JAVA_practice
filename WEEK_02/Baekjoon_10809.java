package WEEK_02;

import java.util.Scanner;

public class Baekjoon_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        for( char i = 'a'; i <= 'z'; i++){
            System.out.print(word.indexOf(i)+" ");
        }
    }
}
