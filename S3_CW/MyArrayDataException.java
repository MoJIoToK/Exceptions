package S3_CW;

import java.util.ArrayList;
import java.util.List;

public class MyArrayDataException extends Exception{
    private List<String> indexes;
    private boolean work;

    public MyArrayDataException(String message) {
        super(message);
        indexes = new ArrayList<>();        
    }

    public MyArrayDataException() {
        this("Ошибка данных");
    }
    
    public void addIndex(int x, int y) {
        work = true;
        this.indexes.add("[" + x + "," + y + "]");
    }

    public List<String> getIndexes(){
        return indexes;
    }

    public boolean work() {
       return indexes.size(); 
    }

}
