package pl.com.tt;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	logger.info("application started");
    	
    	logger.info("application end!");
    	//System.out.println("a");
    }
}
