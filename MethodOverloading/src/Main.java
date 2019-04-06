public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Joshua", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
       double centimeters = calcFeetAndInchesToCentimeters(0, 0);
        if (centimeters <0.0){
            System.out.println("invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int Score){
        System.out.println("Player " + playerName + " scored " + Score + " points");
        return Score * 1000;
    }

    public static int calculateScore(int Score){
        System.out.println("Unnamed player scored " + Score + " points");
        return Score * 1000;
    }
    public static int calculateScore(){
        System.out.println("no player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet <0) || ((inches <0) || (inches >12))){
            System.out.println("invalid input");
           return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + "inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to " + feet + "feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

