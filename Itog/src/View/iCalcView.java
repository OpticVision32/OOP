package View;

public interface iCalcView<T> {
    
    void showLabel();

    void exitProgram();

    String suggestInputCommand();

    T suggestInputTerm();

    boolean suggestInputAnswerToAQuestion(String question);
}