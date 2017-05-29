import java.util.*;

public class Test1 {  
    public static void main(String[] args) {  
        List<String> list = new ArrayList<String>();  
        int i = 0;  
        while(true){  
            list.add(String.valueOf(i++).intern());  
        }  
    }  
} 