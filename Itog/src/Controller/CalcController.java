package Controller;

import Model.iCalcModel;
import Model.iLogger;
import View.iCalcView;

public class CalcController<T> {

    iCalcModel<T> model;
    iCalcView<T> view;
    iLogger<T> logger;

    public CalcController(iCalcModel<T> model, iCalcView<T> view, iLogger<T> logger) {
        this.model = model;
        this.view = view;
        this.logger = logger;
        this.run();
    }

    private void run() {
        Commands com = Commands.NONE;
        boolean flag = true;

        while (flag) {
            view.showLabel();
            
            String question = "Would you like to start working?";
            if (!view.suggestInputAnswerToAQuestion(question)) {
                flag = false;
                view.exitProgram();
                break;
            }

            T firstTerm = view.suggestInputTerm();
            T secondTerm = view.suggestInputTerm();
            T result;

            String command = view.suggestInputCommand();
            com = Commands.valueOf(command.toUpperCase());

            switch (com) {
                case PLUS:
                    result = model.add(firstTerm, secondTerm);
                    System.out.println("Result:" + result);
                    logger.writeLog(firstTerm, secondTerm, result, com);
                    view.suggestInputAnswerToAQuestion("");
                    break;
                case MINUS:
                    result = model.subtract(firstTerm, secondTerm);
                    System.out.println("Result:" + result);
                    logger.writeLog(firstTerm, secondTerm, result, com);
                    view.suggestInputAnswerToAQuestion("");
                    break;
                case TIMES:
                    result = model.multiply(firstTerm, secondTerm);
                    System.out.println("Result:" + result);
                    logger.writeLog(firstTerm, secondTerm, result, com);
                    view.suggestInputAnswerToAQuestion("");
                    break;
                case DIVIDE:
                    result = model.divide(firstTerm, secondTerm);
                    System.out.println("Result:" + result);
                    logger.writeLog(firstTerm, secondTerm, result, com);
                    view.suggestInputAnswerToAQuestion("");
                    break;
                case EXIT:
                default:
                    flag = false;
                    view.exitProgram();
                    break;
            }
        }
    }
}
