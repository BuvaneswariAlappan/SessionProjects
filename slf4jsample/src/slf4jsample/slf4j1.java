package slf4jsample;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class slf4j1 implements Runnable {
	
	//Logger logger = LogManager.getRootLogger();
			Logger logger = LogManager.getLogger(slf4j1.class);
			//logger.error(arg0);
			String id="id1";
			String symbol="@";
			
			Thread thrd=null;
			public void run() 
			{
				try {// TODO Auto-generated method stub
					
				//logger.fatal("Processing trade with id: {} and symbol : {} ", id, symbol);
				logger.fatal("Fatal Message ");
					Thread.sleep(1000);
				logger.trace("Trace Message!");
					Thread.sleep(1000);
				logger.debug("Debug Message!");
				  Thread.sleep(1000);
				logger.info("Info Message!");
					Thread.sleep(1000);
				logger.warn("Warn Message!");
					Thread.sleep(1000);
				logger.error("Error Message!");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				
			}
			public void start()
			{
				thrd=new Thread(this);
				thrd.start();
			}
			

		    public static void main( String[] args ) throws InterruptedException{
		        slf4j1 log1=new slf4j1();
		        slf4j1 log2=new slf4j1();
		        
		       // Log4jMultiThreadin log3=new Log4jMultiThreadin();
		        
		        log1.start();
		        //log1.thrd.join();
		        log2.start();
		       // log3.start();
		    	//logger.fatal("Fatal Message!");
		    }

}
