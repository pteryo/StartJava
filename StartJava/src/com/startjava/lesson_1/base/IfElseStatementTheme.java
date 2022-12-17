public class IfElseStatementTheme {   

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java (это название задачи)");
        int age = 40;
        if (age > 20) {
            System.out.println("возможно, старый");
        } else {
            System.out.println("не старый");
        }
        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("не мужчина");
        } else {
            System.out.println("мужчина");
        }
        double hight = 1.9;
        if (hight < 1.80) {
            System.out.println("влезешь в дверной проём");
        } else {
            System.out.println("возможно, не влезешь в дверной проём");
        }
        char nameFirstLetter = "Имя".charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("первая буква имени = M");
        } else if (nameFirstLetter == 'I') {
            System.out.println("первая буква имени = I");
        } else {
            System.out.println("первая буква имени не I и не M");
        }

        System.out.println("\n2. Поиск max и min числа");
        int number1 = 42;
        int number2 = 121;
        if (number1 < number2) {
            System.out.println("min = " + number1 + " max = " + number2);
        } else if (number1 == number2) { 
            System.out.println("min = max = " + number2);
        } else {
            System.out.println("min = " + number2 + " max = " + number1);
        }

        System.out.println("\n3. Проверка числа");
        int anyNumber = 420;
        if (anyNumber == 0) {
            System.out.println("number = 0");
        } else {
            if (anyNumber < 0) {
                System.out.print("number is negative, and ");
            } else {
                System.out.print("number is positive, and ");
            }
            if (anyNumber % 2 == 0) {
                 System.out.println("even.");
            } else {
                System.out.println("odd.");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 325;
        boolean foundMatch = false;
        System.out.println("comparing " + num1 + " to " + num2);
        int hundreds1 = num1 / 100;
        if (hundreds1 == num2 / 100) {
            System.out.println("match in hundreds: " + hundreds1);
            foundMatch = true;
        }
        int tens1 = num1 % 100 /10;
        if (tens1 == num2 % 100 /10) {
            System.out.println("match in tens: " + tens1);
            foundMatch = true;
        }
        int ones1 = num1 % 10;
        if (ones1 == num2 % 10) {
            System.out.println("match in ones: " + ones1);
            foundMatch = true;
        } 
        if (!foundMatch) {
            System.out.println("no match");
        }

        System.out.println("\n5. Определение символа по его коду");
        char someChar = '\u0057';
        if ('0' <= someChar && '9' >= someChar) {
            System.out.println("symbol \'" + someChar +"\' is a number.");
        } else if ('a' <= someChar && 'z' >= someChar) {
            System.out.println("symbol \'" + someChar +"\' is a lower case letter.");  
        } else if ('A' <= someChar && 'Z' >= someChar) {
            System.out.println("symbol \'" + someChar +"\' is an upper case letter.");
        } else {
            System.out.println("symbol \'" + someChar +"\' is not a letter nor a number");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 300000.0;
        double bankPercent = 10.0;
        if (deposit < 100000.0) {
            bankPercent = 5.0;
        } else if (100000.0 <= deposit && deposit <= 300000.0) {
            bankPercent = 7.0;
        }
        double accuredInterest = deposit * bankPercent / 100;
        double total = deposit + accuredInterest;
        System.out.println("Сумма вклада " + deposit + ", начисленный % " + accuredInterest + " итоговая сумма " + total);
    }
}