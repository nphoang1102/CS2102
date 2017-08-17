
// Biathlon result holds 3 biathlon round info and implements IEvent
public class BiathlonResult implements IEvent {
	BiathlonRound round1;
	BiathlonRound round2;
	BiathlonRound round3;
	
	BiathlonResult(BiathlonRound round1, BiathlonRound round2, BiathlonRound round3) {
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
	}
	
	// Sum of score for each round
	public double pointsEarned() {
		return round1.getRoundPoint() + round2.getRoundPoint() + round3.getRoundPoint();
	}
	
	// Return the best round out of the 3
	public BiathlonRound bestRound() {
		double score1 = round1.getRoundPoint();
		double score2 = round2.getRoundPoint();
		double score3 = round3.getRoundPoint();
		if ((score1 <= score2) && (score1 <= score3)) return this.round1;
		else if ((score2 <= score1) && (score2 <= score3)) return this.round2;
		else return this.round3;
	}
}
