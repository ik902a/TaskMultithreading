package by.epam.learn.main;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.entity.Truck;
import by.epam.learn.exception.LogisticBaseException;
import by.epam.learn.factory.TruckFactory;
import by.epam.learn.parser.TruckParser;
import by.epam.learn.reader.TruckFileReader;

public class Main {
	public static Logger log = LogManager.getLogger();
	
	public static void main(String[] args) {
		String filePath = "data_truck/trucks.txt";
		TruckFileReader reader = new TruckFileReader();
		TruckParser parser = new TruckParser();
		TruckFactory factory = TruckFactory.getTruckFactory();
		List<String> trucksData;
		List<String[]> trucksSpecification;
		try {
			trucksData = reader.readFromFile(filePath);
			trucksSpecification = parser.parseTruck(trucksData);
			for (String[] truckData : trucksSpecification) {
					Truck truck = factory.createTruck(truckData[0], truckData[1], truckData[2]);
					truck.start();		
			}
		} catch (LogisticBaseException e) {
			log.error("Exception in Main " + e.getMessage());
		}
	

	}

}
