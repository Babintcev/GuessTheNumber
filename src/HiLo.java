import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int j = 0;
        //Генерация случай числа, которое будет угадывать пользователь
        int theNumber = (int) (Math.random() * 100 + 1);
        //System.out.println(theNumber);
        int guess = 0;

        int isContinue = 1;

        //Условие выбора языка:
        System.out.println("Выберите язык программы, нажмите соответствующую цифру (1=русский, 2=english):");
        int Lang = scan.nextInt();

        if (Lang == 2) {
            while (guess != theNumber) {
                System.out.println("I chose the number. Guess my number between 0 and 100:");
                guess = scan.nextInt();
                if (guess < theNumber)
                    System.out.println(guess + " is too low. Try again.");
                else if (guess > theNumber)
                    System.out.println(guess + " is too high. Try again.");
                else
                    System.out.println(guess + " is correct!");
                i++;
            } // Конец цикла угадывания while
            System.out.println("You won with " + i + " tries!");
        } else if (Lang == 1) {
            while (guess != theNumber) {
                System.out.println("Я, компьютер, загадал число. Угадай моё число от 0 до 100:");
                guess = scan.nextInt();
                if (guess < theNumber)
                    System.out.println(guess + " слишком маленькое число. Попробуй еще раз.");
                else if (guess > theNumber)
                    System.out.println(guess + " слишком большое число. Попробуй еще раз.");
                else
                    System.out.println(guess + " - Верное число!");
                j++;
            } // Конец цикла угадывания while
            System.out.println("Ты выиграл с " + j + " попытки!");
        } else
            System.out.println("Вы ввели неверный выбор!");
        //Конец условия выбора языка
    }
}
