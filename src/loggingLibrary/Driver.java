package loggingLibrary;

public class Driver {
		
		   private static AbstractLogger getChainOfLoggers(){

		      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		      errorLogger.setNextLogger(fileLogger);
		      fileLogger.setNextLogger(consoleLogger);

		      return errorLogger;	
		   }

		   public static void main(String[] args) {
		      AbstractLogger loggerChain = getChainOfLoggers();

		      loggerChain.logMessage(AbstractLogger.INFO, 
		         "This is an information.");

		      loggerChain.logMessage(AbstractLogger.DEBUG, 
		         "This is an debug level information.");

		      loggerChain.logMessage(AbstractLogger.ERROR, 
		         "This is an error information.");
		   }
}
/*
 *  Another Implementation using Observer Pattern
 *  http://thispointer.com/designing-a-configurable-logging-framework-using-observer-design-pattern/#
 */