package es.us.egc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DIVISION
 *
 */
public class App1 
{
	static Logger log= LoggerFactory.getLogger(App1.class);

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println(a + "/" + b + " = " + App1.divide(a,b));
	}
	
	public static int divide(int a, int b){
		int result= a*b;
		log.info("Returning "+a+"/"+b+"="+result);
		return result;
	}
}
