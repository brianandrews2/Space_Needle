package spaceNeedle;

//SpaceNeedle class prints the SpaceNeedle image proportional to final SIZE
//methods include:  vertical, top, base, slash, trunk

public class SpaceNeedle {
	static final int SIZE = 3;

	public static void main(String[] args) {
		vertical();
		top();
		base();
		slash();
		vertical();
		trunk();
		top();
		base();
	}
	//vertical prints || sections  
	//for size 4:
	// character          expression     
	// #rows= 4           =SIZE           
	public static void vertical() {
		for (int line = 1; line <= SIZE; line++) {
			for (int spaces = 1; spaces <= (3 * SIZE); spaces++) {
				System.out.print(" ");
			}
			for (int row = 1; row <= 2; row++) {
				System.out.print("|");
			}
			System.out.println();
		}
	}
	//top prints _/:||:\_ sections
	//for size 4:
	// character            expression        
	// #rows = 4            =SIZE
	// spaces = 9,6,3,0     (3 * SIZE) - 3 * line
	// : = 0,3,6,9          (3 * line - 3)
	public static void top() {
		for (int line = 1; line <= SIZE; line++) {
			for (int spaces = 1; spaces <= ((3 * SIZE) - 3 * line); spaces++) {
				System.out.print(" ");
			}
			System.out.print("__/");
			for (int colon = 1; colon <= (3 * line - 3); colon++) {
				System.out.print(":");
			}
			System.out.print("||");
			for (int colon = 1; colon <= (3 * line - 3); colon++) {
				System.out.print(":");
			}
			System.out.print("\\__");
			System.out.println();
		}
	}
	//base prints |"""""""""""| sections
	//for size 4:
	// character          expression        
	// " = 24             6 * SIZE
	public static void base() {
		System.out.print("|");
		for (int quote = 1; quote <= (6 * SIZE); quote++) {
			System.out.print("\"");
		}
		System.out.print("|");
		System.out.println();
	}
	//slash prints \_/\/\_/ sections
	//for size 4:
	// character           expression       
	// #rows = 4		   =SIZE
	// spaces = 0,2,4,6    (2 * line - 2)
	// \/ = 10,8,6,4       (3 * SIZE - 2 * line)
	public static void slash() {
		for (int line = 1; line <= SIZE; line++) {
			for (int space = 1; space <= (2 * line - 2); space++) {
				System.out.print(" ");
			}
			System.out.print("\\_/");
			for (int vshape = 1; vshape <= (3 * SIZE - 2 * line); vshape++) {
				System.out.print("\\/");
			}
			System.out.print("\\_/");
			System.out.println();
		}
	}
	//trunk prints |%%||%%| sections
	//for size 4:
	// character          expression        
	//#rows = 16          4 * SIZE
	// spaces = 9         (2 * SIZE + 1)
	// % = 2              SIZE - 2
	public static void trunk() {
		for (int line = 1; line <= (4 * SIZE); line++) {
			for (int spaces = 1; spaces <= (2 * SIZE + 1); spaces++) {
				System.out.print(" ");
			}
			System.out.print("|");
			for (int percent = 1; percent <= (SIZE - 2); percent++) {
				System.out.print("%");
			}
			System.out.print("||");
			for (int percent = 1; percent <= (SIZE - 2); percent++) {
				System.out.print("%");
			}
			System.out.print("|");
			System.out.println();
		}
	}
}