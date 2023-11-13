public class Main {
    public static void main(String[] args) {

        System.out.println("shouldWakeUp Test");
        System.out.println(shouldWakeUp (true, 1)); //true
        System.out.println(shouldWakeUp (false, 2)); //false
        System.out.println(shouldWakeUp (true, 8)); //false
        System.out.println(shouldWakeUp (true, -1)); //false

        System.out.println("hasTeen Test");
        System.out.println(hasTeen(9, 99, 19)); // true;
        System.out.println(hasTeen(23, 15, 42)); // true;
        System.out.println(hasTeen(22, 23, 34)); //false;

        System.out.println("isCatPlaying Test");
        System.out.println(isCatPlaying(true, 10)); //false
        System.out.println(isCatPlaying(false, 36)); //false
        System.out.println(isCatPlaying(false, 35)); // true

        System.out.println("area Test1");
        System.out.println(area(5.0, 4.0)); //20.0
        System.out.println(area(-1.0, 4.0)); //-1

        System.out.println("area Test2");
        System.out.println(area(5.0)); //78.53975
        System.out.println(area(-1)); //-1
    }

    public static boolean shouldWakeUp(boolean isBarking, int hour) {

        if(hour < 0 || hour > 23)
            return false;

        if(!isBarking)
            return false;

        return hour < 8 || hour > 20;
    }


    public static boolean inAgeLimit(int age) {
        int ageMax = 19;
        int ageMin = 13;

        return age >=ageMin && age <= ageMax;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {

        return inAgeLimit(age1) || inAgeLimit(age2) || inAgeLimit(age3);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        int minTemp = 25;
        int maxTemp = 35;

        if(isSummer)
            maxTemp = 45;


        return minTemp <= temp && maxTemp >= temp;
    }

    public static double area(double x1, double x2) {

        if( x1 < 0 || x2 < 0)
            return -1;

        return  x1 * x2;
    }

    public  static double area(double radius) {

        if(radius < 0)
            return -1;

        return radius * radius * Math.PI;
    }
}