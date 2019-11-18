package abstractfactotypattern.journaldev.pro1.factoryClasses;

import abstractfactotypattern.journaldev.pro1.abstractClasses.Computer;
import abstractfactotypattern.journaldev.pro1.interfaces.ComputerAbstractFactory;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}

}
