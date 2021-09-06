package WEEK_01;

import java.util.Scanner;

public class CODEUP_1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter(".");

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println(year + "." + month + "." + day);
    }
}
