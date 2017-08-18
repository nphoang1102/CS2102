import static org.junit.Assert.assertEquals;
import java.util.LinkedList;
import org.junit.Test;

public class Examples {

    public Examples(){}
    
    boolean dummy = false;
    
    // Creating some biathlon rounds
    static BiathlonRound br1 = new BiathlonRound(1, 0.5); // 240.5
    static BiathlonRound br2 = new BiathlonRound(3, 5.0); // 125
    static BiathlonRound br3 = new BiathlonRound(2, 1.2); // 181.2
    static BiathlonRound br4 = new BiathlonRound(5, 3.0); // 3
    static BiathlonRound br5 = new BiathlonRound(4, 9.0); // 69

    // Creating some linked list
    static LinkedList<BiathlonRound> rounds1 = new LinkedList<BiathlonRound>();
    static {
    	rounds1.add(br1);
    	rounds1.add(br2);
    	rounds1.add(br3);
    	rounds1.add(br4);
    }
    static LinkedList<BiathlonRound> rounds2 = new LinkedList<BiathlonRound>();
    static {
    	rounds2.add(br4);
    	rounds2.add(br5);
    }
    static LinkedList<BiathlonRound> rounds3 = new LinkedList<BiathlonRound>();
    static {
    	rounds3.add(br1);
    	rounds3.add(br2);
    	rounds3.add(br3);
    	rounds3.add(br4);
    	rounds3.add(br5);
    }
    
    // Creating some biathlon result
    BiathlonResult bResult1 = new BiathlonResult(rounds1); // 549.7
    BiathlonResult bResult2 = new BiathlonResult(rounds2); // 72
    BiathlonResult bResult3 = new BiathlonResult(rounds3); // 618.7
    
    // Creating some cycling result
    CyclingResult cResult1 = new CyclingResult(2.2, 6); // 2.2
    CyclingResult cResult2 = new CyclingResult(11.2, 1); // 1.2
    CyclingResult cResult3 = new CyclingResult(8.4, 2); // 1.4

    // Test making some athlete
    Athlete athlete1 = new Athlete("Alan", bResult1, cResult1); // 551.9
    Athlete athlete2 = new Athlete("Bob", bResult2, cResult2); // 73.2
    Athlete athlete3 = new Athlete("Chris", bResult3, cResult3); // 620.1
    Athlete athlete4 = new Athlete("Dan", bResult1, cResult3); // 551.1
    Athlete athlete5 = new Athlete("Ethan", bResult2, cResult1); // 74.2
    
    // Some athlete compete in different compitition, thus having different results but same name
    Athlete athleteA = new Athlete("Alan", bResult2, cResult2); // 73.2
    Athlete athleteB = new Athlete("Bob", bResult3, cResult1); // 620.9
    Athlete athleteC = new Athlete("Chris", bResult2, cResult3); // 619.9
    
    // A broken athlete
    Athlete athleteS = new Athlete("Broken", new BiathlonResult(new LinkedList<BiathlonRound>()), cResult2);

    
    // Testing the best biathlon rounds
    @Test
    public void checkBest1() {
    	assertEquals(bResult1.bestRound(), br4);
    }
    
    @Test
    public void checkBest2() {
    	assertEquals(bResult2.bestRound(), br4);
    }
    
    @Test
    public void checkBest3() {
    	assertEquals(bResult3.bestRound(), br4);
    }
    
    // Checking score of the athletes
    @Test
    public void checkScore1() {
    	assertEquals(athlete1.totalScore(), 551.9, 0.01);
    }
    
    @Test
    public void checkScore2() {
    	assertEquals(athlete2.totalScore(), 73.2, 0.01);
    }
    
    @Test
    public void checkScore3() {
    	assertEquals(athlete3.totalScore(), 620.1, 0.01);
    }
    
    // Finding the better athletes
    @Test
    public void checkBetter1() {
    	assertEquals(athlete1.betterCyclist1(athlete2), athlete2);
    }
    
    @Test
    public void checkBetter2() {
    	assertEquals(athlete2.betterCyclist1(athlete3), athlete2);
    }
    
    @Test
    public void checkBetter3() {
    	assertEquals(athlete1.betterCyclist1(athlete3), athlete1);
    }
    
    @Test
    public void checkBetter4() {
    	assertEquals(athlete1.betterCyclist2(athlete2), athlete2);
    }
    
    @Test
    public void checkBetter5() {
    	assertEquals(athlete2.betterCyclist2(athlete3), athlete2);
    }
    
    @Test
    public void checkBetter6() {
    	assertEquals(athlete1.betterCyclist2(athlete3), athlete1);
    }
}