
// Athlete class, holds a biathlon result and a cycling result
public class Athlete {
	String name;
	BiathlonResult result1;
	CyclingResult result2;
	
	Athlete (BiathlonResult result1, CyclingResult result2) {
		this.name = "name";
		this.result1 = result1;
		this.result2 = result2;
	}
	
	// The total score of this athlete
	public double totalScore() {
		return result1.pointsEarned() + result2.pointsEarned();
	}
	
	// Whether this athlete has beaten another athlete
	public boolean hasBeaten(Athlete other) {
		if (this.totalScore() < other.totalScore()) return true;
		else return false;
	}
	
	// Determine this or another athlete is a better cyclist based on performance
	public Athlete betterCyclist1(Athlete other) {
		if (this.totalScore() < other.totalScore()) return this;
		else return other;
	}
	
	// Determine this or another athlete is a better cyclist based on history
	public Athlete betterCyclist2(Athlete other) {
		if (this.hasBeaten(other)) return this;
		else return other;
	}
}
