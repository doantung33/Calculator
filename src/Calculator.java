import java.util.Scanner;

public class Calculator {
    public static final char Cong= '+';
    public static final char Tru= '-';
    public static final char Nhan = '*';
    public static final char Chia = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case Cong:
                return firstOperand + secondOperand;
            case Tru:
                return firstOperand - secondOperand;
            case Nhan:
                return firstOperand * secondOperand;
            case Chia:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

}