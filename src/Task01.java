import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("¬ведите первое число: ");
            firstNumber = scan.nextInt();
            System.out.print("¬ведите второе число: ");
            secondNumber = scan.nextInt();
        }
        int sum = firstNumber + secondNumber;
        float averageValue = (float) sum / 2;
//        System.out.println("Cумма: " firstNumber + secondNumber);
        System.out.println("—умма: " + sum); // Line breakpoint:Task01 [line: 16] - main(String[])
        System.out.println("—реднее значение: " + averageValue);
    }
}
