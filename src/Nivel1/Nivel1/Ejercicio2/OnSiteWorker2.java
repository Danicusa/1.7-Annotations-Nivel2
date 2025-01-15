package level1ex2;

import level1ex1.OnSiteWorker;

public class OnSiteWorker2 extends Worker2 {
	private static double gasoline;
	
	public OnSiteWorker2(String name, String lastName, int pricePerHour, double gasoline) {
		super(name, lastName, pricePerHour);
		OnSiteWorker2.gasoline = gasoline;
	}
	
	public static double getGasoline() {
		return OnSiteWorker2.gasoline;
	}
	public static void setGasoline(double gasoline) {
		OnSiteWorker2.gasoline = gasoline;
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
