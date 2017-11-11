package remoteDriver;

import net.sourceforge.jFuzzyLogic.FIS;

import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;


class Fuzzy {
    private FIS fis = null;

	public Fuzzy() {
        String fclFile = "resources/fuzzyLogical.fcl";
        fis = FIS.load(fclFile);
	}

	double evaluation(double angle, double x) {
		fis.setVariable("direction", angle);
		fis.setVariable("x", x);
		fis.evaluate();
        return fis.getVariable("angle").defuzzify();
	}
}

