public class TimeCalc {
    public static void main(String[] args) {
	    int correctH = Integer.parseInt( "" + args[0].charAt(0) + args[0].charAt(1));
        int correctM = Integer.parseInt( "" + args[0].charAt(3) + args[0].charAt(4));
        int minToAdd = Integer.parseInt( "" + args[1]);
        int h = correctH * 60;
        int m = correctM;
        int totalMin = (h + m + minToAdd);
        int mm = (totalMin % 60);
        int hh = ((totalMin - mm) / 60);

        if((hh > 23) && ((hh % 24) < 10)){
            System.out.println("0" + hh % 24 + ":" + mm);
        } else System.out.println( hh + ":" + mm);
        // System.err.println(hh + " " + correctM );
        }

    }

