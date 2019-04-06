public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double One, double Two) {

        One *= 1000;
        Two *= 1000;
        if ((int) One == (int) Two) {
            return true;
        } else {
            return false;
        }
    }
}
