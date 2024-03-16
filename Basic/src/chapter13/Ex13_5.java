import javax.swing.JOptionPane;

class Ex13_5 {
	public static void main(String[] args) throws Exception  {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();

		String input = JOptionPane.showInputDialog("dialog"); 
	}
}

class ThreadEx5_1 extends Thread {
	public void run() {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e ) {}
		}
	} // run()
}