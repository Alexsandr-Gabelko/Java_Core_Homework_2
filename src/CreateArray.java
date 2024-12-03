import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CreateArray {
    public static int[] createArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество элементов маccива  - ");
        int numberOfElements = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Заданный массив : ");
        System.out.println(Arrays.toString(array));
        return array;
    }
}
