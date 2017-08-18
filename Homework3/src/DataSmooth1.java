import java.util.LinkedList;

class DataSmooth1 extends AbsDataSmooth {
  DataSmooth1(){}
 
  public LinkedList<Double> dataSmooth(LinkedList<PHR> phrs) {
	LinkedList<Double> smoothed = new LinkedList<Double>();  
	smoothed.add((double)phrs.get(0).heartRate);
	for (int i = 1; i < (phrs.size() - 1); i++) {
		int num1 = phrs.get(i-1).heartRate;
		int num2 = phrs.get(i).heartRate;
		int num3 = phrs.get(i+1).heartRate;
		smoothed.add(this.average(num1, num2, num3));		
	}
	smoothed.add((double)phrs.get(phrs.size() - 1).heartRate);
    return smoothed;
  }
}