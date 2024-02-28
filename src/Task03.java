import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int factorial = 1;
        int number;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите натуральное число: ");
            number = scan.nextInt();
        }
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
            
            }
            System.out.println("Факториал числа " + number + " равен - " + factorial);
            
        }
    }

}
