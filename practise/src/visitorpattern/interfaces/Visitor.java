package visitorpattern.interfaces;

import visitorpattern.implementedclass.Liquor;

public interface Visitor {

	public double visit(Liquor liquorItem);

	public double visit(Tobacco tobaccoItem);

	public double visit(Necessity necessityItem);

}
