import java.sql.SQLOutput;

public class Main {


    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(hoursAndMinutes(65, 45));
        System.out.println(hoursAndMinutes(3945L));
        System.out.println(hoursAndMinutes(65, 9));
    }

    private static String hoursAndMinutes(long min, long seconds){
        if ((min < 0) || (seconds < 0) || (seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }

        long hours = min / 60;
        long remainingMins =  min % 60;

        String hoursString = hours + "h ";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMins + "m ";
        if (remainingMins < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s ";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }




        return hoursString + " " + minutesString + " " + secondsString + " ";

        }

        private static String hoursAndMinutes(long seconds){

            if (seconds < 0){
                return INVALID_VALUE_MESSAGE;
            }

            long mins =  seconds / 60;
            long remainingSeconds = seconds % 60;

            return hoursAndMinutes(mins, remainingSeconds);

        }


}
