//abstract class
public abstract class Employee {
//NON Abstract metbod
	public void empI() {
		
	}
	// absrtact method
	public abstract void empAge();

	public static void main(String[] args) {
		Employee e = new Employee() {
			
			@Override
			public void empAge() {
				// TODO Auto-generated method stub
				
			}
		}; 
	}
}
