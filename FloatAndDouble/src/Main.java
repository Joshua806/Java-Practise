
public class Main {

    public static void main(String[] args){
        //width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;
        //width of float = 32 (4 bytes)
        float myFloatValue = 5 / 3f;
        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;

        System.out.println("kilograms = " + convertedKilograms);

        double pi = 3.141_592_7d;
    }
}
