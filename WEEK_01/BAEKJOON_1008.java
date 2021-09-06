package WEEK_01;

import java.util.Scanner;

public class BAEKJOON_1008 {
    public static void main(String[] args) {
        //System.out.print("두 정수 A, B를 입력하세요.\n ");

        Scanner scanner = new Scanner(System.in);
        //System.out.print("A, B :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (((0<a)&&(0<b)) && ((a<10)&&(b<10))){
            System.out.println(a/b);
        }
        else {
            System.out.println(" 0 < a,b < 10 인 값을 입력하세요. \n");
        }
    }
}
