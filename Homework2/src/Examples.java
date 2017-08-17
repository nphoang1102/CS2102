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
    }
    static LinkedList<BiathlonRound> rounds2 = new LinkedList<BiathlonRound>();
    static {
    	rounds2.add(br3);
    	rounds2.add(br4);
    	rounds2.add(br5);
    }
    static LinkedList<BiathlonRound> rounds3 = new LinkedList<BiathlonRound>();
    static {
    	rounds3.add(br2);
    	rounds3.add(br4);
    	rounds3.add(br1);
    }
    
    // Creating some biathlon result
    BiathlonResult bResult1 = new BiathlonResult(rounds1); // 546.7
    BiathlonResult bResult2 = new BiathlonResult(rounds2); // 253.2
    BiathlonResult bResult3 = new BiathlonResult(rounds3); // 368.5
    
    // Creating some cycling result
    CyclingResult cResult1 = new CyclingResult(2.2, 6); // 2.2
    CyclingResult cResult2 = new CyclingResult(11.2, 1); // 1.2
    CyclingResult cResult3 = new CyclingResult(8.4, 2); // 1.4

    // Test making two athlete
    Athlete athlete1 = new Athlete(bResult1, cResult1);
    Athlete athlete2 = new Athlete(bResult2, cResult2);
    Athlete athlete3 = new Athlete(bResult3, cResult3);
    
    // Testing the best biathlon rounds
    @Test
    public void checkBest1() {
    	assertEquals(bResult1.bestRound(), br2);
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
    	assertEquals(athlete1.totalScore(), 548.9, 0.01);
    }
    
    @Test
    public void checkScore2() {
    	assertEquals(athlete2.totalScore(), 254.4, 0.01);
    }
    
    @Test
    public void checkScore3() {
    	assertEquals(athlete3.totalScore(), 369.9, 0.01);
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
    	assertEquals(athlete1.betterCyclist1(athlete3), athlete3);
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
    	assertEquals(athlete1.betterCyclist2(athlete3), athlete3);
    }
}