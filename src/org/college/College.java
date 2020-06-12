package org.college;

public class College extends Student {

	public static void main(String[] args) {
		College detail = new College();
		detail.collegeCode();
		detail.collegeName();
		detail.collegeRank();
		detail.deptName();
		detail.HostelName();
		detail.studentDept();
		detail.studentId();
		detail.studentName();
	}
public void collegeName(){
	System.out.println("CLG NAME : HICAS");
}
public void collegeCode(){
	System.out.println("CLG CODE:236541");
}
public void collegeRank(){
	System.out.println("CLG RANK: 2");
}
}
