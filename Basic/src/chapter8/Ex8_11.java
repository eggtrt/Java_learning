class Ex8_11 {
	public static void main(String args[]) {
		try {
			startInstall();		
			copyFiles();	
		} catch (SpaceException e)	{
			e.printStackTrace();
		} catch (MemoryException me)	{
			me.printStackTrace();
			System.gc();         // Garbage Collection
		} finally {
			deleteTempFiles();
		} 
	} // main

   static void startInstall() throws SpaceException, MemoryException { 
		if(!enoughSpace()) 	
			throw new SpaceException("space exception");
		if (!enoughMemory())
			throw new MemoryException("memory exception");
   } // startInstall

   
   static boolean enoughSpace()   {
		return false;
   }
   
	static boolean enoughMemory() {
		return true;
   }
}

class SpaceException extends Exception {
	SpaceException(String msg) {
	   super(msg);	
   }
}

class MemoryException extends Exception {
	MemoryException(String msg) {
	   super(msg);	
   }
}