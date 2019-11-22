package bridgepattern.abstractclasses;

import bridgepattern.interfaces.DraAPI;

public abstract class Shape {
	
	protected DraAPI draApi;

	public Shape(DraAPI draApi) {
		this.draApi = draApi;
	}
	
	public abstract void draw();

}
