package chap11.example.sec110401;

import java.util.Comparator;

import chap11.example.sec110401.CompareExample.Student;

class StudentComparator implements Comparator<Student> {
	
	public int compare(Student a, Student b) {
		if(a.sno < b.sno) return -1;
		else if(a.sno == b.sno) return 0;
		else return 1;
//		return Integer.compare(a.sno, b.sno);
	}
	

}
