public class Main {
    public static void main(String[] args) {

        /*int count = 0;
        while(count !=6){
            System.out.println("count value is " + count);
            count++;
        }

        for (int i=1; i<7; i++){
            System.out.println("count value is " + i);
        }

      for (count = 1; count !=6; count++){
            System.out.println("Count value is " + count);
        }

       count = 1;
       while (true) {
           if (count == 6) {
               break;
           }
           System.out.println("count value is " + count);
           count++;
       }

       count = 6;
       do {
           System.out.println("count value was " + count);
           count++;

           if (count > 100) {
               break;
           }
       } while(count !=6);
   */

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("even number " + number);
        }
    }

            public static boolean isEvenNumber(int number){
                if ((number % 2) == 0){
                    return true;
                } else{
                    return false;
                }
        }
    }


