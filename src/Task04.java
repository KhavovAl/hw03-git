import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int number;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            number = scan.nextInt();
        }
        int i = 1;
        do {
            System.out.println(number + " х " + i + " = " + number * i);
            i++;
            
        } while (i <= 10 && number != 0);
    }

}