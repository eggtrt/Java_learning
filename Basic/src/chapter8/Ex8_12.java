class Ex8_12 {
	public static void main(String[] args) {
		try  {
			method1();		
		} catch (Exception e)	{
			throw e;
		}
	}	// main

	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			throw e;			
		}
	}	// method
}