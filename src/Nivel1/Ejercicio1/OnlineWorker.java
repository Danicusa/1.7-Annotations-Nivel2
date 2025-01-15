package level1ex1;

public class OnlineWorker extends Worker {
	public static final int FLATRATEINTERNETPLAN = 50;
	
	public OnlineWorker(String name, String lastName, int pricePerHour) {
		super (name, lastName, pricePerHour);
	}
	
	@Override
	public double calculateSalary(int workedHours) {
		
		return (workedHours * this.getpricePerHour()) + OnlineWorker.FLATRATEINTERNETPLAN;
	}
}

