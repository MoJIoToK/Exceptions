package S3_HW;

/*
 * CheckException - пользовательское исключение, наследуется от класса Exception. Обрабатывают ошибки, 
 * связанные с проверкой данных, введённых пользователем. Конструктор класса
 * принимает сообщение об ошибке и передает его в конструктор базового класса Exception с помощью
 * ключевого слова super.
 */

public class CheckException extends Exception {

    public CheckException(String message){
        super(message);
    }
    
}
