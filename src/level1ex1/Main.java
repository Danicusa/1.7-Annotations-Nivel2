package level1ex1;

public class Main {

	public static void main(String[] args) {
		double answer = 0d;
		OnSiteWorker oSWorker1 = new OnSiteWorker("Javier","Méndez",32,100.2);
		OnlineWorker oLWorker1 = new OnlineWorker("Matías","Larazaba",32);
		
		answer = oSWorker1.calculateSalary(37);
		System.out.println("Salary: " + answer + "€");
		answer = oLWorker1.calculateSalary(37);
		System.out.println("Salary: " + answer + "€");
	}
}
