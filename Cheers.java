// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String toSpell = args[0];
        int repeat = Integer.parseInt(args[1]);
        String toPrint = "";        
        for (int i = 0; i < toSpell.length(); i++) {
            char a = Character.toUpperCase(args[0].charAt(i));
            if ("AEFHILMNORSX".indexOf(a) > -1){
                System.out.println("Give me an " + a + ":  " + a + "!");
            } else {
                System.out.println("Give me a  " + a + ":  " + a + "!");
            }
            toPrint += a;

        }
        System.out.println("What does that spell?");

        for (int i = 0; i < repeat; i++) {
            System.out.println(toPrint + "!!!");
        }
    }
}
