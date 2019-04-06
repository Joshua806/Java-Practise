public class Main {

    public static void main(String[] args) {

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3:
                System.out.println("was a 3, or a 4, or a 5");
                break;

            default:
                System.out.println("was not 1 or 2");
                break;
        }

        char newSwitchValue ='B';

        switch (newSwitchValue){
            case 'A':
                System.out.println("value was A");
                break;

            case 'B':
                System.out.println("value was B");
                break;

            case 'C':
                System.out.println("value was C");
                break;

            case 'D':
                System.out.println("value was D");
                break;

            case 'E':
                System.out.println("value was E");
                break;

                default:
                    System.out.println("not found");
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("is january");
                break;

            case "febuary":
                    System.out.println("is febuary");
                    break;

            case "march":
                System.out.println("is march");
                break;

                default:
                    System.out.println("do not know");
        }





    }
}
