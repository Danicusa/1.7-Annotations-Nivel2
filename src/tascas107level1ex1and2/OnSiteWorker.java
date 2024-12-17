package tascas107level1ex1and2;

public class OnSiteWorker extends Worker {
	static double gasoline;
	
	public OnSiteWorker(String name, String lastName, int pricePerHour, double gasoline) {
		super(name, lastName, pricePerHour);
		OnSiteWorker.gasoline = gasoline;
	}
	
	public static double getGasoline() {
		return OnSiteWorker.gasoline;
	}
	public static void setGasoline(double gasoline) {
		OnSiteWorker.gasoline = gasoline;
	}
	
	@Override
	public double calculateSalary(int workedHours) {
		
		return (workedHours * this.getpricePerHour()) + OnSiteWorker.getGasoline();
	}
	
	@Deprecated
	public double extraHoursPrice() {
		double extra = 0d;
		extra = this.getpricePerHour() * 0.5;
		
		return extra;
	}
}
