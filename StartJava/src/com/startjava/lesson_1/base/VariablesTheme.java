public class VariablesTheme {   

    public static void main(String[] args) {
        System.out.println("1 Вывод значений переменных на консоль");
        byte numberOfCPUcores = 1;
        short numberOfTouchpadButtons = 2;
        int numberOfFButtons = 12;
        long hddCount = 1;
        float ramGb = 8.0f;
        double availableRam = 6.2f;
        char cpuVendor = 'I';
        boolean builtinWifi = true;
        System.out.println("number of CPU cores = " + numberOfCPUcores);
        System.out.println("number of touchpad buttons = " + numberOfTouchpadButtons);
        System.out.println("number of F buttons = " + numberOfFButtons);
        System.out.println("hdd count = " + hddCount);
        System.out.println("ram gb = " + ramGb);
        System.out.println("available ram = " + availableRam);
        System.out.println("cpu vendor = " + cpuVendor);
        System.out.println("builtin wifi = " + builtinWifi + "\n");
        
        System.out.println("2 Расчет стоимости товара со скидкой");
        double penPrice = 100.0;
        double bookPrice = 200.0;
        double discountPercent = 11;
        double sumPrice = penPrice + bookPrice;
        double discountPrice = sumPrice - ((sumPrice) / 100 * discountPercent);
        double discountAmount = sumPrice - discountPrice;
        System.out.println("discount amount = " + discountAmount);
        System.out.println("total with discount = " + discountPrice + "\n");
        
        System.out.println("3 Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");                                               
        System.out.println("   J   a a  v   v  a a  ");                                              
        System.out.println("J  J  aaaaa  V V  aaaaa ");                                              
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4 Вывод min и max значений целых числовых типов");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE; 
        int maxInt = Integer.MAX_VALUE; 
        long maxLong = Long.MAX_VALUE; 
        System.out.println("max byte = " + maxByte + " plus 1 = " + ++maxByte + "; minus 1 = " + --maxByte);
        System.out.println("max short = " + maxShort + " plus 1 = " + ++maxShort + "; minus 1 = " + --maxShort);
        System.out.println("max int = " + maxInt + " plus 1 = " + ++maxInt + "; minus 1 = " + --maxInt);
        System.out.println("max long = " + maxLong + " plus 1 = " + ++maxLong + "; minus 1 = " + --maxLong + "\n");

        System.out.println("5 Перестановка значений переменных");
        int first = 2;
        int second = 5;
        System.out.print(" with 3rd var: Before: first = " + first + " second = " + second + " ");
        int third = first; 
        first = second;
        second = third;
        System.out.println(" After : first = " + first + " second = " + second);
        System.out.print(" arithmetic : Before: first = " + first + " second = " + second + " ");
        first += second;
        second = first - second;
        first -= second;
        System.out.println(" After : first = " + first + " second = " + second);
        System.out.print(" XOR : Before: first = " + first + " second = " + second);
        first ^= second;
        second = first ^ second;
        first ^= second;
        System.out.println(" After : first = " + first + " second = " + second + "\n");

        System.out.println("6 Вывод символов и их кодов");
        char char1 = '#';
        char char2 = '&';
        char char3 = '@';
        char char4 = '^';
        char char5 = '_';
        System.out.println((int) char1 + " - " + char1);
        System.out.println((int) char2 + " - " + char2);
        System.out.println((int) char3 + " - " + char3);
        System.out.println((int) char4 + " - " + char4);
        System.out.println((int) char5 + " - " + char5 + "\n");

        System.out.println("7 Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        System.out.print(srcNum + " consists of: ");
        int hundreds = srcNum / 100;
        int dosens = srcNum % 100 / 10;
        int ones = srcNum % 10;
        System.out.print(hundreds + " hundreds, ");
        System.out.print(dosens + " dozens, ");
        System.out.println(ones + " ones.\n");

        System.out.println("8 Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char dash = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("     " + slash + backSlash);
        System.out.println("    " + slash + "  " + backSlash);
        System.out.println("   " + slash + dash + leftBracket + " " + rightBracket + backSlash);
        System.out.println("  " + slash + "      " + backSlash);
        System.out.print(" " + slash + dash + dash + dash + dash);
        System.out.println("" + slash + backSlash + dash + dash + backSlash + "\n");

        System.out.println("9 Вывод произведения и суммы цифр числа");
        srcNum = 345;
        hundreds = srcNum / 100;
        dosens = srcNum % 100 / 10;
        int trail = srcNum % 10;
        int sumDigits = hundreds + dosens + trail;
        int prodDigits = hundreds * dosens * trail;
        System.out.println("sum of digits of number " + srcNum + " is " + sumDigits);
        System.out.println("product of their multiplication is " + prodDigits + "\n");

        System.out.println("10 Вывод времени");
        int unixTime = 86399;
        int hours = unixTime / 3600;
        int minutes = unixTime % 3600 / 60;
        int seconds = unixTime % 60;
        System.out.println( ""+ hours + ":" + minutes + ":" + seconds);
    }
}