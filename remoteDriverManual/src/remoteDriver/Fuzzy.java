package remoteDriver;

import net.sourceforge.jFuzzyLogic.FIS;

class Fuzzy {
    private FIS fis = null;
    
	public Fuzzy() {
        String fclFile = "resources/fuzzyLogical.fcl";
        fis = FIS.load(fclFile, true);
	}
	
	double evaluation(double angle, double x) {
		fis.setVariable("direction", angle);
		fis.setVariable("x", x);
		fis.evaluate();
        return fis.getVariable("angle").defuzzify();
	} 
}

