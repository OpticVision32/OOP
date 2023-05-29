package View;

import java.util.Scanner;
import Model.ComplexNumber;

public class DefaultCalcView implements iCalcView<ComplexNumber> {

    @Override
    public void exitProgram() {
        System.out.println("Close the program!");
    }

    @Override
    public void showLabel() {

        System.out.println("|---+- Addition:       type 'PLUS' ----|");
        System.out.println("|---_- Subtraction:    type 'MINUS' ---|");
        System.out.println("|---*- Multiplication: type 'TIMES' ---|");
        System.out.println("|---/- Division:       type 'DIVIDE' --|");
    }

    @Override
    public boolean suggestInputAnswerToAQuestion(String question) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("%s Y/n: ", question);
        String answer = iScanner.nextLine();
        if (answer.equals("Y") || answer.equals("y"))
            return true;
        return false;
    }

    private double suggestInputNumber() {
        Scanner iScanner = new Scanner(System.in);
        boolean isCorrect = false;
        double number = -1;
        while (!isCorrect) {
            if (iScanner.hasNextInt()) {
                number = (double)iScanner.nextInt();
                isCorrect = true;
            } else if (iScanner.hasNextDouble()) {
                number = iScanner.nextDouble();
                isCorrect = true;
            } else {
                iScanner.next();
                System.out.println("Only numbers like 1, 3, 7 or 5.25 allowed! Try again");
            }
        }
        return number;
    }

    @Override
    public ComplexNumber suggestInputTerm() {
        System.out.print("Type Real number: ");
        double realNumber = suggestInputNumber();
        System.out.print("\nType Image number (without post-prefix 'i'): ");
        double imageNumber = suggestInputNumber();
        ComplexNumber result = new ComplexNumber(realNumber, imageNumber);
        System.out.println("> " + result);
        return result;
    }

    @Override
    public String suggestInputCommand() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter command: ");
        return iScanner.nextLine();
    }
    
}
