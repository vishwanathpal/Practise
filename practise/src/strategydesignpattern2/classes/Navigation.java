package strategydesignpattern2.classes;

import strategydesignpattern2.implementedclass.Route1;
import strategydesignpattern2.implementedclass.Route2;
import strategydesignpattern2.interfaces.Route;

public class Navigation {
	
	private Route route;
	
	public Navigation(){
		route = this.getBestRoute();
	}

	private Route getBestRoute() {
		
		Route route1 = new Route1();
		Route route2 = new Route2();
		
		//get trafic
		if(route1.getTraffic() == Traffic.HIGH_TRAFFIC && route2.getTraffic() == Traffic.HIGH_TRAFFIC) {
			System.out.println("Selecting Low traffic route - Route 1");
			return route1; //Selecting low traffic route;
		}
		else {
			System.out.println("Selecting Route 2");
			return route2; //Any other case, return shortest route
		}
	}
	
	public void navigate(){
		route.getDirections();
		//route.getTotalDistance();
	}
	
	public void distance(){
		route.getTotalDistance();
	}
}
