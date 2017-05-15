
public class Student {
	public String name;
	public String section;
	
	public Subject[] subjects;
	
	private int index = 0;
	private double scoreSum = 0;
	
	public Student(String name) {
		this.name = name;
		subjects = new Subject[8];
	}
	
	public void addScore(Subject subject) {
		if (index >= 8) {
			System.out.println("All scores entered");
		} else {
			subjects[index] = subject;
			index++;
		}
	}
	
	public double getPercentage() {
		return (getSum() / 800 ) * 100;
	}
	
	public boolean isPassed() {
		if (scoreSum == 0) {
			scoreSum = getSum();
		}
		double percent = (scoreSum / 800 ) * 100;
		
		if (percent < 40) {
			return false;
		}
		
		return true;
	}
	
	private double getSum() {
		scoreSum = 0;
		for (int i=0;i<8;i++) {
			scoreSum = subjects[i].score + scoreSum; 
		}
		return scoreSum;
	}
	
	
}
