package epam.task4;

import org.apache.log4j.Logger;

public class simpleinterset {
private static final Logger logger=Logger.getLogger("simpleinterest.class");

void simpleinterset1(double income,double rateofinterset,double numberofyears)
{
	double s1=(income*rateofinterset*numberofyears)/100;
	logger.info(""+s1);
}
}
