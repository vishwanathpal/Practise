package strategydesignpattern2.interfaces;

import strategydesignpattern2.classes.Traffic;

public interface Route {
	
	public void getDirections();
	public int getTotalDistance();
	public Enum<Traffic> getTraffic();
}
