import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

	static final Logger LOGGER = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		LOGGER.debug("Hello World");
	}

}