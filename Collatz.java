// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int lastToChac = Integer.parseInt(args[0]);
		String cORv = args[1];
		int j = 0;
		boolean run = true;
		if ("vV".indexOf(cORv) == 0) {
			for (int i = 1; i <= lastToChac; i++) {
				int res = i;
				while (res != 1 || run) {
					j += 1;					
					run = false;
					System.out.print(res + " ");
					if (res % 2 == 0) {
						res /= 2;

					} else {
						res = res * 3 + 1;

					}
				}
				System.out.print("1 (" + (j + 1) + ")");
				System.out.println();
				j =0;

			}
			System.out.println("Every one of the first " + lastToChac + " hailstone sequences reached 1.");

		} else {
			System.out.println("Every one of the first " + lastToChac + " hailstone sequences reached 1.");
		}

	}
}
