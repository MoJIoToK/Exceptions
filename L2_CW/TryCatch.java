import java.util.Collection;
import java.util.Collections;

public class TryCatch {

    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
            //System.out.println(test.length());
            Collections.emptyList().add(new Object());

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception");
        } catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println(number);
    }

}
