import java.util.ArrayList;

public class MarksheetApplication {

	public static void main(String[] args) {
		
		Student ram = new Student("Ram");
		ram.section = "8 A";
		
		Subject math = new Subject("Math", 100);
		
		ram.addScore(math);
		ram.addScore(new Subject("Science", 50));
		ram.addScore(new Subject("Nepali", 40));
		ram.addScore(new Subject("English", 55));
		ram.addScore(new Subject("Computer", 90));
		ram.addScore(new Subject("Environment", 30));
		ram.addScore(new Subject("Sanskrit", 50));
		ram.addScore(new Subject("History", 80));
		
		double userinput = 110;
		if (userinput > math.fullScore) {
			
		}
		
		System.out.println(ram.name + "'s Percentage is: " + ram.getPercentage());
		if (ram.isPassed()) {
			System.out.println("Yay!! Passed");
		} else {
			System.out.println("Sorry!! Failed");
		}

	}

}
