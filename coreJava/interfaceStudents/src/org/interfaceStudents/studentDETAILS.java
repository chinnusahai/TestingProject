package org.interfaceStudents;

public class studentDETAILS implements Student {

	@Override
	public void StudentName() {
		System.out.println("priya");
	}

	@Override
	public void BloodGroup() {
		System.out.println("O+");
	}

	public static void main(String[] args) {
		studentDETAILS s = new studentDETAILS();
		
		s.BloodGroup();
		s.StudentName();
	}
}
