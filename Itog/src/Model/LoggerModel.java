package Model;

public abstract class LoggerModel {
    

    protected String loggerName;

    protected static String filePrefix = "_xCalc";
    protected String filePath;

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public static String getFilePrefix() {
        return filePrefix;
    }

    public static void setFilePrefix(String filePrefix) {
        LoggerModel.filePrefix = filePrefix;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
