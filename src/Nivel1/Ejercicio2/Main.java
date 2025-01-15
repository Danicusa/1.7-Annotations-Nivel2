package level1ex2;

public class Main {

	public static void main(String[] args) {
		OnSiteWorker2 oSWorker1 = new OnSiteWorker2("Javier","Méndez",32,100.2);
		OnlineWorker2 oLWorker1 = new OnlineWorker2("Matías","Larazaba",32);
		
		@SuppressWarnings("deprecation")
		double answer1 = oSWorker1.extraHoursPrice();
		System.out.println(answer1);
		
		@SuppressWarnings("deprecation")
		int answer2 = oLWorker1.onlineExtra(37);
		System.out.println(answer2);
	}

}
