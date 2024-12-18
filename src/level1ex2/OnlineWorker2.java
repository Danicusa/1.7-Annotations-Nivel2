package level1ex2;

import level1ex1.OnlineWorker;

	public class OnlineWorker2 extends Worker2 {
	
		public static final int FLATRATEINTERNETPLAN = 50;
	
	public OnlineWorker2(String name, String lastName, int pricePerHour) {
		super (name, lastName, pricePerHour);
	}
	
	@Override
	public double calculateSalary(int workedHours) {
		
		return (workedHours * this.getpricePerHour()) + OnlineWorker.FLATRATEINTERNETPLAN;
	}
	
	@Deprecated
	
	public int onlineExtra(int workedHours) {
		return workedHours + 5;
	}
}
