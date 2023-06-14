package S3_CW;

import java.io.IOException;

/*
 * Создайте метод doSomething(), который может быть источником одного из типов checked exceptions 
 * (тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в 
 * нем исключение, которое вызвал метод doSomething().
 */

public class Task2 {

    public static void doSomething() throws IOException{ // пробрасывает туда где вызвана функция
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
    
}
