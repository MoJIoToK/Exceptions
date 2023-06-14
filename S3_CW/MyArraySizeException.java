package S3_CW;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        this("Неверный размер массива");      
    }

    public MyArraySizeException(String message) {
        super("Неверный размер массива");      
    }
    
}
