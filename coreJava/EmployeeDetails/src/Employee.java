
public class Employee {
	
	private void empid() {
		System.out.println("employee id");
	}
	private void empName() {
		System.out.println("employee name");
	}
	private void empDOB() {
		System.out.println("employee date ");
	}
	private void empPh() {
		System.out.println("employee phone");
	}
	private void empEmail() {
		System.out.println("employeeemail");
	}
	private void empAddress() {
		System.out.println("employee address");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empAddress();
		e.empDOB();
		e.empEmail();
		e.empid();
		e.empName();
		e.empPh();
	}

}
