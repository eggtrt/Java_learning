import java.io.*;

class Ex15_12 {
	public static void main(String[] args) {
		String line = "";

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);


			do {
				line = br.readLine();
			} while(!line.equalsIgnoreCase("q"));

		} catch(IOException e) {}
	} // main
}