package com.basicsstrong.designprinciples;

interface ILogger{
	public void logInformation(String logInfo);
}
class Logger implements ILogger{
	public void logInformation(String logInfo) {
		System.out.println(logInfo);
		}
}

class LoggingToFile{
	private ILogger logger;
	public LoggingToFile(ILogger l) {
		this.logger = l;
	}
	public void logging() {
		logger.logInformation("Printing Logs to the file...");
	}
	
}

class LoggingToDb{
	private ILogger logger;
	public LoggingToDb(ILogger l) {
		this.logger = l;
	}
	public void logging() {
		logger.logInformation("saving Logs to the database...");
	}
	
}
public class DIP {

	public static void main(String[] args) {
		LoggingToFile fileLogger = new LoggingToFile(new Logger()); 
		fileLogger.logging();

	}

}
