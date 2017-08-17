
// Biathlon round info, track the time in seconds and targets_hit (0-5)
public class BiathlonRound {
	int targets_hit;
	double time;
	
	BiathlonRound(int targets_hit, double time) {
		this.targets_hit = targets_hit;
		this.time = time;
	}
	
	// Function to get score for this biathlon round
	public double getRoundPoint() {
		return this.time + 60.0 * (5 - this.targets_hit);
	}
}
