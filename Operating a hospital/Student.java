package Pravi_labos_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {

	String id, name;
	public Student(String i, String n) {
		id=i;
		name=n;
	}
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Student pero= new Student("123456","Pero");
		students.add(new Student("123450","Ivo"));
		students.add(pero);
		System.out.print(students.contains(pero+", "));
		System.out.println(students.contains(new Student("123450","Ivo")));

	}

//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
