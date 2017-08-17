import java.util.LinkedList;

// Biathlon result holds 3 biathlon round info and implements IEvent
public class BiathlonResult implements IEvent {
	LinkedList<BiathlonRound> rounds;
	
	BiathlonResult(LinkedList<BiathlonRound> rounds) {
		this.rounds = rounds;
	}
	
	// Sum of score for each round
	public double pointsEarned() {
		double points = 0;
		for (BiathlonRound r : this.rounds) {
			points += r.getRoundPoint();
		}
			
		return points;
	}
	
	// Return the best round out of the list of rounds
	public BiathlonRound bestRound() {
		int max_index = 0;
		for (int i = 0; i < this.rounds.size(); i++) {
			if (this.rounds.get(i).getRoundPoint() < this.rounds.get(max_index).getRoundPoint())
				max_index = i;
		}
		return this.rounds.get(max_index);
	}
}
