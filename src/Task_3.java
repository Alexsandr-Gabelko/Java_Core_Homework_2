//Написать функцию, возвращающую истину, если в переданном массиве есть два
//соседних элемента, с нулевым значением.

public class Task_3 {
    public static void task_3(){
       int[] array = CreateArray.createArray();
       if (array.length < 2) {
            System.out.println("Массив содержит менее двух элементов");
            return;
        }
        boolean meaning = false;
        for (int i = 0; i < array.length - 1; i++) {
             if (array[i] ==0 && array[i+1]==0)  {
                 meaning = true;
                 break;
            }
        }
        System.out.println("В массиве есть два соседних элемента, с нулевым значением : " + meaning+ "\n");
    }
}
