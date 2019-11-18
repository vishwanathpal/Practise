package abstractfactotypattern.journaldev.pro1.factoryClasses;

import abstractfactotypattern.journaldev.pro1.abstractClasses.Computer;
import abstractfactotypattern.journaldev.pro1.concreateClasses.Server;
import abstractfactotypattern.journaldev.pro1.interfaces.ComputerAbstractFactory;

public class ServerFactory implements ComputerAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Server(ram,hdd,cpu);
	}

}
