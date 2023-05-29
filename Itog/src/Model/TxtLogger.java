package Model;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Controller.Commands;

public class TxtLogger extends LoggerModel implements iLogger<ComplexNumber> {

    private Logger logger;

    public TxtLogger(String loggerName) {
        super.loggerName = loggerName;
        String localPath = this.getClass().getResource("").getPath();
        super.filePath = localPath.concat("loggers/" + super.getLoggerName() + super.getFilePrefix() + ".txt").substring(1);
        this.checkFile();
        this.initLogger();
    }

    @Override
    public void checkFile() {
        try {
            File file = new File(super.getFilePath());
            if (file.createNewFile()) {
                System.out.printf("%s > New file created!\n", super.getLoggerName());
            } else {
                System.out.printf("%s > Necessary file existed!\n", super.getLoggerName());
            }
        } catch (Exception e) {
            System.out.printf("%s > BOOM!\n", super.getLoggerName());
            e.printStackTrace();
        }
    }

    @Override
    public void createFileHandler() {
        FileHandler fh;
        try {
            fh = new FileHandler(super.getFilePath(), true); // add new lines mode
            this.logger.addHandler(fh);
            // To turn off the console handler:
            this.logger.setUseParentHandlers(false);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
        } catch (Exception e) {
            System.out.println("BOOM!");
            e.printStackTrace();
        } 
    }

    @Override
    public void initLogger() {
        this.logger = Logger.getLogger(super.loggerName);
        this.createFileHandler();
    }

    @Override
    public void writeLog(ComplexNumber firtsTerm, ComplexNumber secondTerm, ComplexNumber result, Commands command) {
        this.logger.info(String.format("%s %s %s = %s", firtsTerm, command, secondTerm, result));
    }
}
