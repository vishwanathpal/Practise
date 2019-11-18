package abstractfactotypattern.journaldev.pro1.applicationtest;
import abstractfactotypattern.journaldev.pro1.abstractClasses.Computer;
import abstractfactotypattern.journaldev.pro1.factoryClasses.ComputerFactory;
import abstractfactotypattern.journaldev.pro1.factoryClasses.PCFactory;
import abstractfactotypattern.journaldev.pro1.factoryClasses.ServerFactory;

public class TestDesignPatterns {
	
	ComputerFactory computerFactory;
	
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		// TODO Auto-generated method stub
		Computer pc = abstractfactotypattern.journaldev.pro1.factoryClasses.ComputerFactory.getComputer(new PCFactory("8GB", "500 GB","2.4 GHz"));
		Computer server = abstractfactotypattern.journaldev.pro1.factoryClasses.ComputerFactory.getComputer(new ServerFactory("2GB", "125 GB","8.2 GHz"));
		System.out.println("AbstractFactory PC Config::"+ pc);
		System.out.println("AbstractFactory server Config::"+ server);
	}
}

//reference: https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java
