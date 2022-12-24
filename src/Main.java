import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<String>> platno = new ArrayList<>();

		System.out.println("Jak velké chceš mít plátno");
		int platnoSize = scan.nextInt();
		System.out.println("super:  " + platnoSize);

		for (int i = 0; i < platnoSize; i++) {
			platno.add(i, new ArrayList<String>());
			for (int j = 0; j < platnoSize; j++) {
				platno.get(i).add("0");
			}
		}

		int cordinationX = 0;
		int cordinationY = 0;
		do {
			if (cordinationY !=0){
				platno.get(platnoSize - cordinationY).set(cordinationX - 1, "X");
			}

			for (int i = 0; i < platnoSize; i++) {
				for (int j = 0; j < platnoSize; j++) {
					System.out.print(platno.get(i).get(j) + "  ");
				}
				System.out.println();
			}
			System.out.println ("napiš souradnice X");
			cordinationX = scan.nextInt();
			System.out.println("napiš souradnice Y");
			cordinationY = scan.nextInt();
		} while (cordinationX > 0 && cordinationX <= platnoSize && cordinationY > 0 && cordinationY <= platnoSize);
		System.out.println("konec");
	}
}