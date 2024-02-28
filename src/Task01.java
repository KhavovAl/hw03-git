import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Сведите первое число: ");
            firstNumber = scan.nextInt();
            System.out.print("Сведите второе число: ");
            secondNumber = scan.nextInt();
        }
        int sum = firstNumber + secondNumber;
        float averageValue = (float) sum / 2;
//        System.out.println("Cумма: " firstNumber + secondNumber);
<<<<<<< HEAD
        System.out.println("без ума: " + sum); // Line breakpoint:Task01 [line: 16] - main(String[])
        System.out.println("Вредное значение: " + averageValue);
=======
        System.out.println("Сумма: " + sum); // Line breakpoint:Task01 [line: 16] - main(String[])
        System.out.println("Среднее значение: " + averageValue);
>>>>>>> test
    }
}
