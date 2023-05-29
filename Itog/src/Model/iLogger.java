package Model;

import Controller.Commands;

public interface iLogger<T> {

    void checkFile();


    void createFileHandler();


    void initLogger();


    void writeLog(T firtsTerm, T secondTerm, T result, Commands command);
}
