public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterst(10000.0, 2.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("loop " + i + " hello!");
        }

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at 2% interest = " + String.format("%.2f", calculateInterst(10000.0, i)));

        }


        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }
    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i==0) {
                return false;
            }
        }
        return true;
    }



    public static double calculateInterst(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}