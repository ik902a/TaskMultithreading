package by.epam.learn.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.entity.Truck;
import by.epam.learn.entity.TypeGoods;

public class TruckFactory {
	public static Logger log = LogManager.getLogger();
	private static TruckFactory truckFactory = new TruckFactory();

	private TruckFactory() {
	}

	public static TruckFactory getTruckFactory() {
		return truckFactory;
	}
	
	public Truck createTruck(String numberTruckData, String typeData, String arrivalData) {
		int numberTruck = Integer.valueOf(numberTruckData);
		TypeGoods type = TypeGoods.valueOf(typeData.toUpperCase());
		int arrival = Integer.valueOf(arrivalData);
		
		Truck truck = new Truck(numberTruck, type, arrival);

		log.info("Truck number " + numberTruck + " was created");
		return truck;
	}

}
