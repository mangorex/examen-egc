package es.us.egc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MULTIPLICACIÓN
 *
 */
public class App2 
{
	static Logger log=LoggerFactory.getLogger(App2.class);
	
	public static int multiplica(int a, int b){
		int result= a*b;
		log.info("Returning "+a+"*"+b+"="+result);
		return result;
	}
}
