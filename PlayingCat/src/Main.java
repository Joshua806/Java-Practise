public class Main {
    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 30));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25 && summer == false && temperature <= 35 && summer == false) {
            return true;
        }
        if (summer && temperature >= 25 && summer && temperature <= 45) {
            return true;
        } else
            return false;

    }
}



