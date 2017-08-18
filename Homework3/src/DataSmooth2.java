import java.util.LinkedList;

class DataSmooth2 extends AbsDataSmooth {
  DataSmooth2(){}
  
  public LinkedList<Double> dataSmooth(LinkedList<PHR> phrs) {
	  LinkedList<Double> smoothed = new LinkedList<Double>();
	  LinkedList<Double> toReplace = new LinkedList<Double>();
	  for (PHR p : phrs) {
		  smoothed.add((double)p.heartRate);
	  }
	  for (int i = 1; i < (smoothed.size() - 1); i++) {
			double num1 = smoothed.get(i-1);
			double num2 = smoothed.get(i);
			double num3 = smoothed.get(i+1);
			toReplace.add(this.average(num1, num2, num3));		
	  }
	  for (int i = 1; i < (smoothed.size() - 1); i++) {
		  smoothed.set(i, toReplace.get(i - 1));
	  }
	  return smoothed;
  }
  
  public double average(double num1, double num2, double num3) {
	  return (num1 + num2 + num3) / 3.0;
  }
  
}