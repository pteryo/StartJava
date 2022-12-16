public class Calculator {
    private char sign;
    private double num1;
    private double num2;

    public void setSign(char inpSign) {
        sign = inpSign;
    }

    public void setNum1(double inpNum1) {
        num1 = inpNum1;
    }

    public void setNum2(double inpNum2) {
        num2 = inpNum2;
    }

    public double calculate() {
        switch(sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2; 
            case '^':
                int result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
        }
        return 0;
    }
}