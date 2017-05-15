
public class Subject {
	public String name;
	public float score;
	
	public double fullScore = 100;
	
	public Subject(String name, float score) {
		if (score > fullScore) {
			System.out.println("Invalid Score");
		} else {
			this.name = name;
			this.score = score;
		}
	}
}
