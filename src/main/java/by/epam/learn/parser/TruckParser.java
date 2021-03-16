package by.epam.learn.parser;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.exception.LogisticBaseException;

public class TruckParser {
	public static Logger log = LogManager.getLogger();
	public static final String DELIMETER = "\\s";

	public List<String[]> parseTruck(List<String> data) throws LogisticBaseException {
		if (data == null || data.size() == 0) {
			log.error("data not available");
			throw new LogisticBaseException("data not available");
		}
		List<String[]> trucksSpecification = new ArrayList<>();
		for (String truckData : data) {
			String[] trucksData = truckData.split(DELIMETER);
			trucksSpecification.add(trucksData);
		}
		if (trucksSpecification.isEmpty()) {
			log.error("no data to create the truck");
			throw new LogisticBaseException("no data to create the truck");
		}
		log.info("data were parsed");
		return trucksSpecification;
	}
}
