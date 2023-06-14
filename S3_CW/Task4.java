package S3_CW;
/*
 * 1. Создайте класс исключения, который будет выбрасываться при делении на 0. 
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 * 2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве 
 * ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке
 * 3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. 
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println("Начало работы");
        try {
            //test1();
            test2();
        } catch (DivideByZeroException e) {
            throw new RuntimeException();
        }
    }

    public static void test2() {
        String[] strings = new String[5];
        
        try {
            strings[0].length();
        } catch (NullPointerException e) {
            throw new NullObjectException("Обращение к пустому элементу");
            
        }
        
    }
    
}
