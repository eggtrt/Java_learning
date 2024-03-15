import java.util.*;

class Ex12_2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("a", 1, 1));
		list.add(new Student("b", 1, 2));
		list.add(new Student("c", 2, 1));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
		//  Student s = (Student)it.next();
			Student s = it.next();
			System.out.println(s.name);
		}
	} // main
}

class Student {
	String name = "";
	int ban;
	int no;

	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}