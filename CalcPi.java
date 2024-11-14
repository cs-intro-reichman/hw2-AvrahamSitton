// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   double pi = Math.PI;
	   double myPi = 0.0;
	   int myNum = Integer.parseInt(args[0]);
	   
	   for(int i = 1; i <= myNum ; i++){
		   myPi += Math.pow( -1 , i + 1) / (2 * i - 1);
	   }
    myPi *= 4;
	   
	System.out.println("pi according to Java: " + pi);
	System.out.println("pi, approximated: " + myPi);

	}
}
