public class TimeCalc {
    public static void main(String[] args) {
        int hour = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int min = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minToAdd = Integer.parseInt(args[1]);

        String hourRes = "" + (hour + (min + minToAdd) / 60) % 24,
                minRes = "" + (min + minToAdd) % 60;
        if (hourRes.length() < 2) {
            hourRes = "0" + hourRes;
        }
        if (minRes.length() < 2) {
            minRes = "0" + minRes;
        }
        System.out.println(hourRes + ":" + minRes);
    }
}
