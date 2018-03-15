package fpp.prob2;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		List<Student> students = new ArrayList<>();
		for(Object obj : studentArray){
			//it is safe to cast to students
			students.add((Student)obj);
		}
		return students;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		/*implement */
		double total = 0.0;
		int numberOfStudents = 0;
		for(Student student : studentList){
			total +=student.computeGpa();
			numberOfStudents++;
		}
		return total/numberOfStudents;
	}
}
