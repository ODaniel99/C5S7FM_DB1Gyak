import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.IOException;

public class XYFileOlvas {

	private static final Pattern COMMA = Pattern.compile(",");
	public static void main(String[] args) {
		int db = 0, sum = 0, i = 0;
		try {
			System.out.println("Adja meg az adatok számát:");
			BufferedReader reader = new BufferedReader(new FileReader("vezeteknev.txt"));
			Scanner s = new Scanner (System.in);
			String str = s.nextLine();
			db = Integer.parseInt(str);
			String line;
			System.out.println("Adatok száma: " + db);
			while((line = reader.readLine()) != null) {
				for (String token : COMMA.split(line)) {
					try {
						sum += Integer.parseInt(token);
						System.out.println((i+1) + ".adat = " + token);
					} catch (NumberFormatException ex) {
						System.err.println(token + " nem szam");
					}
					i++;
				}
			}
			System.out.println("Összeg: " + sum);
		} catch (Exception e) {
			System.out.println("Hiba");
			e.printStackTrace();
		}

	}

}
