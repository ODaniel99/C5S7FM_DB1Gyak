import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.IOException;

public class XYFileIr {

	private static final Pattern COMMA = Pattern.compile(",");
	public static void main(String[] args) {
		int db = 0, sum = 0, i = 0, numb = 0;
		try {
			System.out.println("Adja meg az adatok számát:");
			BufferedReader reader = new BufferedReader(new FileReader("vezeteknev.txt"));
			Scanner s = new Scanner (System.in);
			String str = s.nextLine();
			db = Integer.parseInt(str);
			int[] numbers = new int[db];
			System.out.println("Adatok száma: " + db);
			while(i < db) {
					try {
						str = s.nextLine();
						numb = Integer.parseInt(str);
					} catch (NumberFormatException ex) {
						System.err.println(numb + " nem szam");
					}
					i++;
			}
			for (i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			System.out.println("Összeg: " + sum);
		} catch (Exception e) {
			System.out.println("Hiba");
			e.printStackTrace();
		}

	}

}
