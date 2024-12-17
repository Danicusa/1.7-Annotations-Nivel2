package tascas107level1ex1and2;

public class OnlineWorker extends Worker {
	public static final int flatRateInternetPlan = 50;
	
	public OnlineWorker(String name, String lastName, int pricePerHour) {
		super (name, lastName, pricePerHour);
	}
	
	@Override
	public double calculateSalary(int workedHours) {
		
		return (workedHours * this.getpricePerHour()) + OnlineWorker.flatRateInternetPlan;
	}
	
	@Deprecated
	
	public int onlineExtra(int workedHours) {
		return workedHours + 5;
	}
}
