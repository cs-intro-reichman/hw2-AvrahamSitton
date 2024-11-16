// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		while (seed > 1) {
			if (seed % 2 == 0) {
				seed /= 2;
			} else {
				seed = seed * 3 + 1;
			}
			System.out.print(seed + ", ");

		}

	}
}
