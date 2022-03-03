public class BarkingDog {
    public static boolean shouldWakeUP( boolean barking,int hoursOfDay ){
        if (hoursOfDay < 0 || hoursOfDay > 23) {
            return false;
        }
        if ((barking==true)&&(hoursOfDay<8 || hoursOfDay>22)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUP(true,1));
        System.out.println(shouldWakeUP(false,2));
        System.out.println(shouldWakeUP(true,8));
        System.out.println(shouldWakeUP(true,-1));
    }
}
