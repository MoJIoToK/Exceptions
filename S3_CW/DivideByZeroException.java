package S3_CW;

public class DivideByZeroException extends Exception{
    private final String ERROR_MESSAGE = "Деление на ноль";
    public DivideByZeroException(){
        super("Деление на ноль");
    }

    public DivideByZeroException(Throwable cause){
        super("Деление на ноль", cause);
        
    }


    
}
