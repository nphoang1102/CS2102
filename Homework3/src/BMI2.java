import java.util.LinkedList;

class BMI2 {
  BMI2(){}
  
//  Make seperate Linked list, then join them together to a new BMI Summary object
  public BMISummary bmiReport(LinkedList<PHR> phrs) {
    LinkedList<String> under = new LinkedList<String>();
    LinkedList<String> healthy = new LinkedList<String>();
    LinkedList<String> over = new LinkedList<String>();
    LinkedList<String> obese = new LinkedList<String>();
    
    for (PHR p : phrs) {
    	double bmi = this.bmiCalculator(p);
    	if (bmi < 18.5) under.add(p.name);
    	else if (bmi < 25) healthy.add(p.name);
    	else if (bmi < 30) over.add(p.name);
    	else obese.add(p.name);
    }
    
    return (new BMISummary(under, healthy, over, obese));
  }
  
  // Method for BMI calculation
  public double bmiCalculator(PHR file) {
	  return file.weight/(file.height * file.height);
  }
}