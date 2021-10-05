import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class c5s7fm_3_4 {

	public static void main(String[] args) {
		hf2("vezeteknev.txt");
	}

	public static void hf2 (String fnev) {
		String sor;
		String[] szavak;
		int sorid = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fnev));
			while ((sor = br.readLine()) != null) {
				System.out.println(sor.toUpperCase());
			}
			br.close();
			System.out.println("Ok");
		}catch (Exception ee) {
			ee.printStackTrace();
		}
	}
}
