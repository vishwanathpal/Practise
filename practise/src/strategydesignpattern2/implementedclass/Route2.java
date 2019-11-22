package strategydesignpattern2.implementedclass;

import java.util.Random;

import strategydesignpattern2.classes.Traffic;
import strategydesignpattern2.interfaces.Route;

public class Route2 implements Route {

	@Override
	public void getDirections() {
		System.out.println("Route2::Turn Right after 150 meters");
		//getTotalDistance();
	}

	@Override
	public int getTotalDistance() {
		return 20;
	}

	@Override
	public Enum<Traffic> getTraffic() {
		Random random = new Random();
		if (random.nextBoolean() == true) {
			System.out.println("High Traffic on Route2");
			return Traffic.HIGH_TRAFFIC;
		} else {
			System.out.println("Low Traffic on Route2");
			return Traffic.LOW_TRAFFIC;
		}
	}
}
