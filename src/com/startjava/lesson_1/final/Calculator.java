public class Calculator {

    public static void main(String[] args) {
        char sign = '^';
        double num1 = 10;
        double num2 = 3;
        double result = 0;
        if (sign == '+') { 
            result = num1 + num2; 
        } else if (sign == '-') { 
            result = num1 - num2; 
        } else if (sign == '*') { 
            result = num1 * num2; 
        } else if (sign == '/') { 
            result = num1 / num2; 
        } else if (sign == '^') { 
            result = 1;
            for (int i = 1; i <= num2; i++){
                result *= num1;
            }
        } else if (sign == '%') { 
            result = num1 % num2; 
        }
        System.out.println(num1 + " "  + sign +  " " + num2 + " = " + result);
    }
}