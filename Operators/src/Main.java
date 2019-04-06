public class Main {

    public static void main(String[] args){
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        result = result  / 5;
        System.out.println(previousResult  + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result  /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("it is not an alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("you got the high score");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than  second top score and less then 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("this is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");


        double firstValue = 20;
        double secondValue = 80;

        double myTotal = (firstValue + secondValue) * 25;
        System.out.println("my total is " + myTotal);

        double newResult = myTotal % 40;
        System.out.println("the remainder is " + newResult);

        if(newResult <= 20)
            System.out.println("total was over the limit");



    }
}
