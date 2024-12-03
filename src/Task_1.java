//Написать метод, возвращающий количество чётных элементов массива.
//countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3
//countEvens([1, 3, 5]) → 0

import java.util.Arrays;

public class Task_1 {
    public static void task_1(){
        int[] array = CreateArray.createArray();
        int count = 0;
        for (int i : array){
            if (i % 2 == 0) count++;
        }
        System.out.println("countEvens(" + Arrays.toString(array) + ") → " + count + "\n");
    }
}
