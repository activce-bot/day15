package dara6_1_11_10;

public class data5_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		******
		*****
		****	
		***	
		**	
		*
		*/

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= (7 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 1000; i++) {
			int factor = 0;
			for (int j = 1; j <= i / 2; j++) {

				if (i % j == 0) {
					factor += j;
				}

			}

			if (i == factor) {
				System.out.println(i);
			}

			// ÖØÖÃfactor
			// factor = 0;

			// }
			//
		}
	}
}
