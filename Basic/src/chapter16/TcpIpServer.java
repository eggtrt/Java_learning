import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TcpIpServer {
	public static void main(String args[]) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
		} catch(IOException e) { e.printStackTrace(); }

		while(true) {
			try {
				Socket socket = serverSocket.accept();
				System.out.println(getTime()+ socket.getInetAddress() 
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);

				dos.writeUTF("[Notice] Test Message1 from Server.");

				dos.close();
				socket.close();
			} catch (IOException e) { 
				e.printStackTrace(); 
			}
		} // while
	} // main

	static String getTime() {  
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
} // class