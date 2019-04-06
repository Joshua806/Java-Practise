public class Main {

    public static void main(String[] args) {

        bark(true, 23);


    }

    public static boolean bark(boolean barking, int hourOfDay) {

        if (barking && (hourOfDay < 0 || hourOfDay > 23)) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }


    }

}
