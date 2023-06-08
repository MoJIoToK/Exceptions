package S1_HW;

import java.util.ArrayList;

/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */
public class Task3 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 0, 4};

        ArrayList<Float> arrResult = new ArrayList<>();
        arrResult = newArray(arr1, arr2);
        System.out.println(arrResult);
    }

    public static ArrayList<Float> newArray(int[] arr1, int[] arr2) {
        ArrayList<Float> result = new ArrayList<>();
        //int min = Math.min(arr1.length, arr2.length);
        if (arr1.length == 0 || arr2.length == 0){
            throw new RuntimeException("Один из массивов пустой");
        } else if (arr1.length != arr2.length){
            throw new RuntimeException("Массивы разной длины");
        } else{ 
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] != 0){
                    result.add((float) (arr1[i] / arr2[i]));
                } else{
                    throw new RuntimeException("Деление на ноль!");
                }   
            }
        }
        return result;        
    }
    
}
