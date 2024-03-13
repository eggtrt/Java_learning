import java.util.*;

class Ex10_2 {
	public static void main(String[] args) {
 
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();


   	long difference = 
            (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"22 "+ (date.get(Calendar.MONTH)+1) 
                            +"12 " + date.get(Calendar.DATE) + "08 ";
	}
}