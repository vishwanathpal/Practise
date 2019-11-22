package iteratorpattern.implementedclasses;

import iteratorpattern.interfaces.Container;
import iteratorpattern.interfaces.Iterator;

public class NameRepository implements Container {
	
	public String name[] = {"AB", "CD", "EF", "GH"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {
		
		int index = 0;

		@Override
		public boolean hasNext() {

			if(index<name.length)
				return true;
				return false;
		}

		@Override
		public Object next() {
			
			if(this.hasNext()) 
				return name[index++];
				return false;
		}
	}
}
