import java.util.ArrayList;

/**
     Some language arrays are automatically resizable. The array or list will grow as your append items.
    In java the array's size can't change after its creation.
    But when you need an array-like data structure that offers dynamic resizing, you would usually use an Array-List
    We know that an array resizes as needed while still providing O(1) access.
    When the array is full, they array doubles in size(although in some languages, like java, the size
    might increase by 50% or another value). Each resizing takes O(n) time, but it happens
    rarely that its amortized insertion time is still O(1).
 */
public class ArrayListandResizableArrays {

    ArrayList<String> merge(String[] words, String[] moreWords){
        ArrayList<String > snt = new ArrayList<String>();
        for(String wor: words)
            snt.add(wor);
        for(String wo: moreWords)
            snt.add(wo);
        return snt;
    }

}
