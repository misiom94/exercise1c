package wdsr.exercise1.conversions;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
	private static final Logger log = LogManager.getLogger();

	public int[] convertToInts(String[] strings) {
		log.debug("Started method: convertToInts, strings: ");
		int i=0;
		for (String value : strings) {
			i++;
			log.debug("Value number: "+ i +" : "  + value);
		}
		int[] results=Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
		log.debug("Ended Method: convertToInts, results: ");
		int j=0;
		for (int result : results) {
			j++;
			log.debug("Result:" + j +" : "+ result);
		}
		return results;
	}
}
