package WEEK_02;

import java.util.Scanner;

public class Baekjoon_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = num;
        int sum = 0;
        int new_num = 0;
        int count = 0;
        int a, b, c, d;

        while(true){
            a = num / 10;
            b = num % 10;

            sum = a+b;
            //c = sum / 10;
            d = sum % 10;

            if(sum>=10){
                new_num = (10*b)+d;
            }
            else{
                new_num = (10*b)+sum;
            }
            count++;
            num = new_num;

            if(num == x){
                break;
            }
        }
        System.out.println(count);
    }
}
