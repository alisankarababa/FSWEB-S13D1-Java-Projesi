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
}