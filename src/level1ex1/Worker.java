package level1ex1;

public abstract class Worker {
	private String name;
	private String lastName;
	private int pricePerHour;
	
	public Worker(String name, String lastName, int pricePerHour) {
		this.name = name;
		this.lastName = lastName;
		this.pricePerHour = pricePerHour;
	}
	public String getName() {
		return this.name;
	}
	public String getLastName() {
		return this.lastName;
	}
	public int getpricePerHour() {
		return this.pricePerHour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPricePerHour(int pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	
	public abstract double calculateSalary(int workedHours); 
	
}
