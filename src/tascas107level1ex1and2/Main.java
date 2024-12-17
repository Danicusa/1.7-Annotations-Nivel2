package tascas107level1ex1and2;

public class Main {

	public static void main(String[] args) {
		double answer = 0d;
		Worker worker1 = new Worker("Pepe", "Romero", 32);
		OnSiteWorker oSWorker1 = new OnSiteWorker("Javier","Méndez",32,100.2);
		OnlineWorker oLWorker1 = new OnlineWorker("Matías","Larazaba",32);
		
		answer = worker1.calculateSalary(37);
		System.out.println("Salary: " + answer + "€");
		answer = oSWorker1.calculateSalary(37);
		System.out.println("Salary: " + answer + "€");
		answer = oLWorker1.calculateSalary(37);
		System.out.println("Salary: " + answer + "€");
		
		
		@SuppressWarnings("deprecation")
		double answer1 = oSWorker1.extraHoursPrice();
		System.out.println(answer1);
		
		@SuppressWarnings("deprecation")
		int answer2 = oLWorker1.onlineExtra(37);
		System.out.println(answer2);
		

	}

}
