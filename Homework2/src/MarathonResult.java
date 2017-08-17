
// Marathon result, basically the same as cycling result with different points system
public class MarathonResult extends AbsResult implements IEvent {
	
	MarathonResult(double time, int position) {
		super(time, position);
	}
	
	// Points earned only depend upon time, position is irrelevant
	public double pointsEarned() {
		return this.time;
	}
}
