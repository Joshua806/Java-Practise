public class Main {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(100,100,200));
    }

    public static boolean hasEqualSum(int One, int Two, int Three){

        if (One + Two == Three){
            return true;
        } else{
            return false;
        }

    }
}
