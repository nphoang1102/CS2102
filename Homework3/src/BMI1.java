import java.util.LinkedList;

class BMI1 extends AbsBMI {
  BMI1(){}
  
  // Iterate through list of patients and add their names directly to the summary
  public BMISummary bmiReport(LinkedList<PHR> phrs) {
	BMISummary summ = new BMISummary(new LinkedList<String>(), new LinkedList<String>(), new LinkedList<String>(), new LinkedList<String>());
	for (PHR p : phrs) {
		this.bmiSort(p,  summ);
	}
    return summ;
  }
  
  // Helper for sorting
  public void bmiSort(PHR file, BMISummary summ) {
	  double bmi = this.bmiCalculator(file);
	  if (bmi < 18.5) summ.under.add(file.name);
	  else if (bmi < 25) summ.healthy.add(file.name);
	  else if (bmi < 30) summ.over.add(file.name);
	  else summ.obese.add(file.name);
  }
}