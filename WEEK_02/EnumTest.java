package WEEK_02;

public class EnumTest {
    public static void main(String[] args) {
        Week today = Week.SUNDAY;
        System.out.println(today);
        //name() 메소드
        String name = today.name();
        System.out.println(name);
    }
}
