import java.util.Arrays;

/**
     This is the simple program where we can check two strings are same length, same char
    So, we can say string is permutation each other
 */


//General concepts to know.
  // "god" =  a string contains characters, numbers, operators. etc.
//our case we just assume only char
// dog = same thing a string is a collections of characters

    //If we sort "god" we will get like this = dgo
    //If we sort "dog" we will get like this = dgo

// length of the string




public class PermutationExm {
    //Creating a method for sort
    public String sort(String str){    // "god"
        char[] content = str.toCharArray();   //char[] content={'g', 'o', 'd'};
        Arrays.sort(content);                 // char[] content={'d','g','o'};
        return new String(content);           //"dgo" as a String
    }

    // "mad"  and another String    "maad"


    // "cat"      == "tvc"  => true, what???? just length. it will not produce permutation fact.

    public boolean permutation(String str, String t){
        if(str.length() != t.length()){                //Base case for checking the length
            return false;
        }
        return sort(str).equals(sort(t));  // This line will return  true; like "cat"   "tca"
    }
}
