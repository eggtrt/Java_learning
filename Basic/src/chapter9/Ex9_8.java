class Ex9_8 {
	public static void main(String[] args) {
		char[] cArr = new char[0];    // char[] cArr = {};
		String s = new String(cArr);  // String s = new String("");

		System.out.println("cArr.length="+cArr.length);
		System.out.println("@@@"+s+"@@@");
	}
}