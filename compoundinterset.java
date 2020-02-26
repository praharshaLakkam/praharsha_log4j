package epam.task4;

import org.apache.log4j.Logger;

public class compoundinterset{
private static final Logger logger=Logger.getLogger("compoundinterest.class");
	void compoundinterset1(double income,double rateofinterset,double numberofyears )
	{
		double compo1=Math.pow((1+(rateofinterset/100)), numberofyears);
		double compound=compo1*income;
		logger.info(""+compound);
	}

}
