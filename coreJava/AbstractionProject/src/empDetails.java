
public class empDetails extends Employee {

public static void main(String[] args) {
	empDetails e = new empDetails();
	e.empAge();
	e.empI();
}

@Override
public void empAge() {
	System.out.println(50);
}
}
