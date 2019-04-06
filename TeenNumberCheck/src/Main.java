import java.nio.channels.NetworkChannel;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(12, 14,21));
    }

    public static boolean hasTeen(int One, int Two, int Three) {

        if (One >= 13 && One <= 19 || Two >= 13 && Two <= 19 || Three >= 13 && Three <= 19){
            return true;
        }
        return false;


    }
}
