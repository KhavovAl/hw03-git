import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        int number;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            number = scan.nextInt();
        }
        int count = 1;
            do {
                count++;
            }
            while  (number % count != 0 && count <= (number / 2));
        if (count > number / 2 && number > 1) {
            System.out.println("Число " + number + " - простое");
        }
        else System.out.println("Число " + number + " - непростое");
//        System.out.println(count);
    }
}

