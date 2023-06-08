package S2_CW;

public class Task3 {

    public static int sum2d(String[][] arr) {
        String name = null;
        int sum = 0;
        if (arr == null) {
            System.out.println("Массив не инициализирован!");
            arr = new String[0][]; // инициализация внешнего массива
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = new String[0]; // инициализация внутреннего массива
            }
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
                if(arr[i].length < j + 1){
                    return sum;
                }
            }
        }
        return sum;
    }
}
