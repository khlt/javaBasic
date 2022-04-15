package sec1;
class Student {
	String name;
	int no;
	int year;
	int ban;
}
class Scores {
	int edps;
	int oa;
	int pg;
	public Student setStudent(String name, int no, int year, int ban) {
		Student st = new Student();
		st.name = name;
		st.no = no;
		st.year = year;
		st.ban = ban;
		return st;
	}
	public Student setStudent(Student s) {
		Student st = new Student();
		st.name = s.name;
		st.no = s.no;
		st.year = s.year;
		st.ban = s.ban;
		return st;
	}
	
}
public class StudentEx {
	public static void main(String[] args) {
		Scores hak1_c = new Scores(); 
		Scores hak1_e =	new Scores();
		hak1_c.edps = 100;
		hak1_c.oa = 80;
		hak1_c.pg = 90;
		Student s1 =  new Student();
		s1.name = "김기태";
		s1.no = 7;
		s1.year = 1;
		s1.ban = 3;
		hak1_c.setStudent(s1);
	}
}