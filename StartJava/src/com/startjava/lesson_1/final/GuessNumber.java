public class GuessNumber {

    public static void main(String[] args) {
        int secretNum = 2;
        int guessNum = 90;
        while (guessNum != secretNum) {
            if (guessNum < secretNum) {
                System.out.println("Число " + guessNum + " меньше того, что загадал компьютер.");
            } else {
                System.out.println("Число " + guessNum + " больше того, что загадал компьютер.");
            }
            guessNum += 1;
            if (guessNum > 100) {
                guessNum %= 100;
            }
            if (guessNum == 0) {
                guessNum++;
            }
        }
        System.out.println("Число = " + secretNum + " Вы победили!");
    }
}