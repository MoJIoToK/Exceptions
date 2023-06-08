package S2_CW;

import java.util.Scanner;

/*
 * Посмотреть на код и найти проблему. Если есть попробовать решить. 
 * 
 * Решение:
 * - можно за пределы выйти
 * - можно написать букву вместо цифры индекса
 * - можно ничего не ввести
 * - здесь unchecked, поэтому нужно use try catch 
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента в который хотите записать значение 1");
        int index = 0;
        String line = scanner.nextLine();
        if(line.matches("[0-9]+")){
            index = Integer.parseInt(line);
        } else{
            System.out.println("Лажа какая-то");
        }
        //int index = scanner.nextInt();
        // Как лучше было бы сделать:
        if (index < arr.length && index > -1){
            arr[index] = 1;
        } else {
            System.out.println("Указан индекс за пределами массива");
        }
        // Как было:
        // try {
        //     arr[index] = 1;
        // } catch (Exception e){
        //     System.out.println("Указан индекс за пределами массива");
        // }
    }
    
}
