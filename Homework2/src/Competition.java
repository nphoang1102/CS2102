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
		return new LinkedList<Athlete>();
	}
	
	
}
