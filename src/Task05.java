import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        int number;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите N: ");
            number = scan.nextInt();
        }
        while (number > 0) {
            System.out.println(number);
            number -=1;
        }
        
    }

}