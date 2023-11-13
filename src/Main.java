public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("shouldWakeUp Test");
        System.out.println(shouldWakeUp (true, 1)); //true
        System.out.println(shouldWakeUp (false, 2)); //false
        System.out.println(shouldWakeUp (true, 8)); //false
        System.out.println(shouldWakeUp (true, -1)); //false
    }
    public static boolean shouldWakeUp(boolean isBarking, int hour) {

        if(hour < 0 || hour > 23)
            return false;

        if(!isBarking)
            return false;

        return hour < 8 || hour > 20;
    }
}