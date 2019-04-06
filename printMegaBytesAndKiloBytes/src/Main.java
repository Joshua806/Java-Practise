public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(310293);


    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0){
            int mb = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;

            System.out.println(" " + kiloBytes + "kilobytes = " + mb + " mb and " + remainingKB + " kilobytes");

        } else {
            System.out.println("invalid value");
        }


    }

}
