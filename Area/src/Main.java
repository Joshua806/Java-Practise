public class Main {
    public static void main(String[] args) {

        System.out.println(area(15));
        System.out.println(area(1,4));
    }

    public static double area(double radius) {


        if (radius < 0) {
            return -1;
        }

        double pi = 3.14159;
        double area = radius * radius * pi;
        return  area;

    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0){
            return -1;
        }

        double area = x * y;
        return area;
    }
}
