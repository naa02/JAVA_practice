package WEEK_01;

import java.util.Scanner;

public class CODEUP_1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String [] strDate = str.split("\\."); //"."으로 구분해서 입력
        String result = "";

        int year = Integer.parseInt(strDate[0]);
        int month = Integer.parseInt(strDate[1]);
        int day = Integer.parseInt(strDate[2]);

        // year가 네자릿수가 아닐 경우 네자릿수로 맞춰서 result에 추가
        if ((year>0) && (year<10)){
            result += "000"+year;
        } else if ((year>9) && (year<100)){
            result += "00"+year;
        } else if ((year>99) && (year<1000)){
            result += "0"+year;
        } else {
            result += year;
        }

        // month가 한 자리일 경우 두자릿수로 맞춰서 result에 추가
        result += ((month>0) && (month<10)) ? (".0"+month) : ("."+month);

        // day가 한 자리 경우 앞에 두자릿수로 맞춰서 result에 추가
        result += ((day>0) && (day<10)) ? (".0"+day) : ("."+day);

        System.out.println(result);
    }
}
