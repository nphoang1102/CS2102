import java.util.LinkedList;

// Competition, holds a list of athletes and number of BiathlonRounds
public class Competition {
	LinkedList<Athlete> competitors;
	int rounds;
	
	Competition(LinkedList<Athlete> competitors, int rounds) {
		this.competitors = competitors;
		this.rounds = rounds;
	}
	
	// Check for athletes that hasn't finished all of the biathlon rounds
	public LinkedList<Athlete> BiathlonDNF() {
		LinkedList<Athlete> dnfList = new LinkedList<Athlete>();
		for (Athlete a : this.competitors) {
			if (a.result1.rounds.size() < this.rounds) dnfList.add(a);
		}
		return dnfList;
	}
	
	// Return the total score of the named athlete in the competition
	public double scoreForAthlete(String name) {
		for (Athlete a : this.competitors) {
			if (a.name == name) return a.totalScore();
		}
		return 0.0;
	}
	
	// Return number of athletes whose points is lower in this competition
	public int countCyclingImproved(Competition other) {
		int amount = 0;
		if (this.rounds != other.rounds) return 0;
		LinkedList<Athlete> dnfList = this.BiathlonDNF();
		for (Athlete a : this.competitors) {
			for (Athlete b : other.competitors) {
				if ((a.name.equals(b.name)) && (a.totalScore() > b.totalScore()))
					amount++;
					for (Athlete check : dnfList) {
						if ((a.name.equals(check.name))) amount--;
					}				
			}
		}
		return amount;
	}
}
