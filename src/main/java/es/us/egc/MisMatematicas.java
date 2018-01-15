package es.us.egc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
/**
 * DIVISION
 *
 */
public class MisMatematicas
{
	static Logger log= LoggerFactory.getLogger(MisMatematicas.class);

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println(a + "/" + b + " = " + MisMatematicas.divide(a,b));
	}
	
	public static int divide(int a, int b){
		int result= a/b;
		log.info("Returning "+a+"/"+b+"="+result);
		return result;
	}

	public static int multiplica(int a, int b){
                int result= a*b;
                log.info("Returning "+a+"*"+b+"="+result);
                return result;
        }

}
