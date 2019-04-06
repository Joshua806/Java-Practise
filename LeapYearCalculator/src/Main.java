public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2001));
    }

    public static boolean isLeapYear(int Year) {

        if (Year < 1 || Year > 9999 || ((Year % 100) == 0 && (Year % 400 != 0) || ((Year % 4) != 0))) {
            return false;
        } else {
            return true;
        }


    }

}
