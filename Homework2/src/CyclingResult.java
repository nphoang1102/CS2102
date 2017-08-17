
// Cycling result hold a time and position finished, also implements IEvent
public class CyclingResult implements IEvent {
	double time;
	int position;
	
	CyclingResult(double time, int position) {
		this.time = time;
		this.position = position;
	}
	
	// Points earned for cycling result, based on time and position performance
	public double pointsEarned() {
		double timeOff = 0.0;
		if (this.position == 1) timeOff = 10.0;
		else if (this.position == 2) timeOff = 7.0;
		else if (this.position == 3) timeOff = 3.0;
		return this.time - timeOff;
	}
}
