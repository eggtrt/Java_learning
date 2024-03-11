import java.io.*;

class Ex8_10 {
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
		} catch (Exception e) {
			throw e;
		}
	}	// main

	static File createFile(String fileName) throws Exception {
		if (fileName==null || fileName.equals(""))
			throw new Exception("error");
		File f = new File(fileName);		
		f.createNewFile();
		return f;		
	}	
}