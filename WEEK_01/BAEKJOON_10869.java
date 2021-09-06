package WEEK_01;

import java.util.Scanner;

public class BAEKJOON_10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("add: " + (a+b));
        System.out.println("sub: " + (a-b));
        System.out.println("mul: " + (a*b));

        // 0으로 나눌 때 ArithmeticException 예외 주의
        try {
            System.out.println("div: " + (a/b));
            System.out.println("mod: " + (a%b));
        }
        catch (ArithmeticException e){
            System.out.println("0이 아닌 수로 나누어야 합니다.");
        }
    }
}
