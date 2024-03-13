import java.util.*;

class Ex10_4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2019, 7, 31);	

		System.out.println(toString(date));
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));

		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));

		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}

}