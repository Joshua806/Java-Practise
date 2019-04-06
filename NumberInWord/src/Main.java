public class Main {

    public static void main(String[] args) {

        printNumberInWord(0);
    }

    public static void printNumberInWord(int number){

        switch (number){
            case 0:
                System.out.println("One");
                break;

            case 1:
                System.out.println("Two");
                break;

            case 2:
                System.out.println("Three");
                break;

            case 3:
                System.out.println("four");
                break;

            case 4:
                System.out.println("five");
                break;

            case 5:
                System.out.println("six");
                break;

            case 6:
                System.out.println("seven");
                break;

            case 7:
                System.out.println("eight");
                break;

            case 8:
                System.out.println("nine");
                break;

            default:
                System.out.println("OTHER");
                break;
        }
    }
}
