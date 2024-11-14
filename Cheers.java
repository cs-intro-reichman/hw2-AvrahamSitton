// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String toSpell = args[0];
            int repeat = Integer.parseInt(args[1]);
            String toPrint = "";

            for(int i = 0; i < toSpell.length(); i++){
                char a = Character.toUpperCase(args[0].charAt(i));
                System.out.println("Give me an " + a + ": " + a + "!");
                toPrint += a;

            }
            System.out.println("What does that spell?");
            
            
            for(int i = 0; i <= repeat; i++){
                System.out.println( toPrint + "!!!");
            }



        }
}

            
            
            
            
            
            
/* Give me an R: R!
Give me a U: U!
Give me an N: N!
Give me an I: I!
What does that spell?
RUNI!!!
RUNI!!!
RUNI!!!
RUNI!!!
RUNI!!!
        }
}
*/