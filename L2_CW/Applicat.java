import java.io.File;
import java.util.Collections;
import java.util.List;

public class Applicat {

    public static void main(String[] args) {
        // String name = null;
        // System.out.println(name.length()); //NullPointerException

        // Object object = new String("123");
        // File file = (File) object;
        // System.out.println(file); //ClassCastException

        // String number = "123fq";
        // int result = Integer.parseInt(number);
        // System.out.println(result); //NumberFormatException

        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object()); //UnsupportedOperationException
        
    }
    
}
