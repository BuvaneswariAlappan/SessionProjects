import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4j implements Runnable {
	Logger logger = LogManager.getLogger(Log4j.class);
    String id = "id1";
    String symbol = "@";
    Thread thrd = null;

    public void run()
    {
        try {
            logger.fatal("Fatal Message");
            Thread.sleep(1000);

            logger.trace("Trace");
            Thread.sleep(1000);

            logger.debug("Debug Message");
            Thread.sleep(1000);

            logger.info("Info Message!");
            Thread.sleep(1000);

            logger.warn("Warn Message");
            Thread.sleep(1000);

            logger.error("Error Message");




        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

    }
    public void start()
    {
        thrd=new Thread(this);
        thrd.start();
    }

    public static void main(String[] args) throws InterruptedException
    {
Log4j log1= new Log4j();
Log4j log2= new Log4j();

        log1.start();
        log2.start();


    }

	
}
