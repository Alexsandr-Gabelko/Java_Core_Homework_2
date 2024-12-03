//Написать функцию, возвращающую разницу между самым большим и самым ма-
//леньким элементами переданного не пустого массива.

public class Task_2 {
    public static void task_2() {
        int[] array = CreateArray.createArray();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : array){
            if (i > max) max = i;
            if (i < min ) min = i;
        }
        System.out.println("Min: " + min + ", Max: " + max);
        System.out.println("Difference: " + (max - min) + "\n");
    }
}
